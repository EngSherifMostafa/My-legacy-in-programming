package javathecompletereference.Ch4;
public class ShiftRight
{
    public static void main (String [] args)
    {
        
        char hex[] =
        {
        '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        
        byte b = (byte) 0xf1;
        // Shifting in less than int must by convert to int
        // 0xf1 = 1111 0001
        
        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
        /*
        A: 1111 0001 >> 4 = 1000 1111   (note: 1 in the MSB because of sign extension)
                     0x0f = 0000 1111
                          & ----------
                            0000 1111 = (F)
        
        B:    b = 1111 0001
           0x0f = 0000 1111
                & ---------
                  0000 0001 = (1)
        */
    }
}