/*
	static have two modifiers ( public - default - protected ), ( private )
*/

import java.io.*;

class Main {
	public static void main(String[] args) {
	    
	    ModifiersWithStatic mws = new ModifiersWithStatic();
	    
	    System.out.println(
	        // ModifiersWithStatic.privateAtt + // cannot be accessed
	        ModifiersWithStatic.protectedAtt + "\n" +
	        ModifiersWithStatic.defaultAtt + "\n" +
	        ModifiersWithStatic.publicAtt
	        );
	        
	    System.out.println(
	        // mws.privateAtt + // cannot be accessed
	        mws.protectedAtt + "\n" +
	        mws.defaultAtt + "\n" +
	        mws.publicAtt
	        );
			
        /********************************************************************/
	    
	    // ModifiersWithStatic.privatePrint(); // cannot be accessed
	    ModifiersWithStatic.protectedPrint();
	    ModifiersWithStatic.defaultPrint();
	    ModifiersWithStatic.publicPrint();
	    
	    // mws.privatePrint(); // cannot be accessed
	    mws.protectedPrint();
	    mws.defaultPrint();
	    mws.publicPrint();
	}
}

class ModifiersWithStatic {
    
    private static String privateAtt 	 = "privateAtt";
    protected static String protectedAtt = "protectedAtt";
    static String defaultAtt 			 = "defaultAtt";
    public static String publicAtt 		 = "publicAtt";
    
    private static void privatePrint() {
        System.out.println("privatePrint");
    }

    protected static void protectedPrint() {
        System.out.println("protectedPrint");
    }
    
    static void defaultPrint() {
        System.out.println("defaultPrint");
    }
    
    public static void publicPrint() {
        System.out.println("publicPrint");
    }
}