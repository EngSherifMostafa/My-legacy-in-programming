package javathecompletereference.Ch3;
public class LiteralsAndCasting
{
    public static void main(String[] args)
    {
        byte By = 127; // 8 bits
        short Sh  = 32_767; // 16 bits
        int In = 2_147_483_647; // 32 bits
        long Lo = 9_223_372_036_854_775_807L; // 64 bits
        
        float Fl = 3.402_823_56e+38F; // 32 bits
        double Do = 1.79769313486231580e+308; // 64 bits
        
        char Ch = '\uFFFF'; // 16 bits
        boolean Bo = false; // 1 bit
        
        String Str = "Name"; // Object
        
        // narrowing conversion
        System.out.println("byte to short = " + (byte)Sh);
        System.out.println("byte to int = " + (byte)In);
        System.out.println("byte to long = " + (byte)Lo);
        
        System.out.println("byte to float = " + (byte)Fl);
        System.out.println("byte to double = " + (byte)Do);
        
        System.out.println("byte to char = " + (byte)Ch);
        //System.out.println("byte to boolean = " + (byte)Bo); error(can not convert byte to boolean)
        
        int Binary = 0b1101; // 13
        int Decimal = 10; // 10
        int Octal = 077; // 63
        int Hexa = 0xff; // 255
        System.out.println("Binary = " + Binary);
        System.out.println("Decimal = " + Decimal);
        System.out.println("Octal = " + Octal);
        System.out.println("Hexa = " + Hexa);
    }
}