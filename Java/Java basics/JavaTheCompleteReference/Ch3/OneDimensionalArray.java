package javathecompletereference.Ch3;
public class OneDimensionalArray
{
    public static void main (String [] args)
    {
        int Ave [] = new int [20];
        int i = 1 , result = 0;
        
        for (i = 1 ; i <= 20 ; i++)
        {
            Ave [i-1] = i;
            result = result + Ave[i-1];
        }
        System.out.println("result = " + (result/ Ave.length) );
    }
}