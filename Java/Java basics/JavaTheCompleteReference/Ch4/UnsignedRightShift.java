package javathecompletereference.Ch4;
public class UnsignedRightShift
{
    public static void main (String [] args)
    {
        char hex[] =
        {
        '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
    
        byte b = (byte) 0xf1; // b = 1111 0001 = (113 - 128 = -15)
        
        byte c = (byte) (b >> 4); // 1111 0001 >> 4 = 1111 1111 = (-1)    
        //(sign extension and convert to int before shift)
        //the left side of binary number is ones because b is negative
        
        byte d = (byte) (b >>> 4); // 1111 0001 >>> 4 = 1111 1111 = (-1)    
        //(no sign extension and convert to int before shift)
        //the left side of binary number is ones because b is negative
        
        byte e = (byte) ((b & 0xff) >> 4);
        //(sign extension but not working here because the operation applied by default on int)
        //(other 32 bits is zeros)        
        //after operation complete casting done
        
        /*
                                  b = 1111 0001
                               0xff = 1111 1111
                                    &----------
        0000 0000 0000 0000 0000 0000 1111 0001 >> 4 = 1111 = (15)
        */
        
        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
        /*
        A:      b >> 4 = 1111 1111
                  0x0f = 0000 1111
                       &----------
                         0000 1111 = (F)
        
        B:           b = 1111 0001
                  0x0f = 0000 1111
                       &----------
                         0000 0001 = (1)
        */
        
        System.out.println("b >> 4 = 0x" + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);
        /*
        A:      c >> 4 = 1111 1111
                  0x0f = 0000 1111
                       &----------
                         0000 1111 = (F)
        
        B:           c = 1111 1111
                  0x0f = 0000 1111
                       &----------
                         0000 1111 = (F)
        */
        
        System.out.println("b >>> 4 = 0x" + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);
        /*
        A:      d >> 4 = 1111 1111
                  0x0f = 0000 1111
                       &----------
                         0000 1111 = (F)
        
        B:           d = 1111 1111
                  0x0f = 0000 1111
                       &----------
                         0000 1111 = (F)
        */
        
        System.out.println("(b & 0xff) >> 4 = 0x" + hex[(e >> 4) & 0x0f] + hex[e & 0x0f]);
        /*
        A:        e = 0000 1111 

             e >> 4 = 0000 0000
               0x0f = 0000 1111
                    &----------
                      0000 0000 = (0)
        
        B:       e = 1111 1111
              0x0f = 0000 1111
                   &----------
                     0000 1111 = (F)   
        */
    }
}