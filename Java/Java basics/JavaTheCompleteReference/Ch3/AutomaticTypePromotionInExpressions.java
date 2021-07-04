package javathecompletereference.Ch3;
public class AutomaticTypePromotionInExpressions
{
    public static void main (String [] args)
    {
        byte a = 127;
        byte b = -128;
        byte result = (byte) (a*b);
        System.out.println("Result of A * B = " + result);
    }
}