package QuadraticFormula;
import java.util.Scanner;

public class QuadraticFormula {
    public static void main(String[] args)
        // X = (-B ± √(B^2-4AC)/2A)
    {
        while (true)
        {
        Scanner read = new Scanner (System.in);
        
        System.out.print("Inter value of A = ");
        int a = read.nextInt();
        System.out.print("Inter value of B = ");
        int b = read.nextInt();
        System.out.print("Inter value of C = ");
        int c = read.nextInt();
        
        // √(B^2-4AC) ≠ 0
        int m = (b*b)-(4*a*c);
        
        // A ≠ 0
        if (m<0)
        {
            System.out.println("√(B^2-4AC) Mustn't equal 0");
        }
        
        else if (a==0)
        {
            System.out.println("A 's value Mustn't equal 0");
        }
        
        else
        {
            // X1 = (-B + √(B^2-4AC)/2A)
            Double x1 = (-b + Math.sqrt(m)) / (2*a);
            
            // X2 = (-B - √(B^2-4AC)/2A)
            Double x2 = (-b - Math.sqrt(m)) / (2*a);
            System.out.println("X1 : " +x1);
            System.out.println("X2 : " +x2);
        }
    }   
    }
}