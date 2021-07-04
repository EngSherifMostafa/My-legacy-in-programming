package javathecompletereference.Ch4;
public class ShiftLeft
{
    public static void main (String [] args)
    {
        byte a = 64, b; //64 = 0100 0000
        int i;
        i = a << 2; // 1 0000 0000
        
        b = (byte) (a << 2); // 1 0000 0000 
        // 1 in the previous line is out of byte range
        
        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);
        System.out.println("------------------------------------");
        
        int c = 0;
        int num = 0xFFFFFFE; // 1111  1111 1111  1111 1111  1111 1110
        for(c=0; c<4; c++)
        {
        num = num << 1;
        
        /*
        c=0: (0001 1111  1111 1111  1111 1111  1111 1100)  :  536870908
        c=1: (0011 1111  1111 1111  1111 1111  1111 1000)  :  1073741816
        c=2: (0111 1111  1111 1111  1111 1111  1111 0000)  :  2147483632
       
        c=3: (1111 1111  1111 1111  1111 1111  1110 0000)  : -2,147,483,648
                                                              2,147,483,616
                                                             --------------
                                                             -           32
        */
        
        System.out.println(num);
        }
        
        System.out.println("------------------------------------");
    }
}