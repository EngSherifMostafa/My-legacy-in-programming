package javathecompletereference.Ch3;

public class MultiDimensionalArray
{
    //regular MultiDimensionalArray
    public static void main (String [] args)
    {
        int TwoD [][] = new int [4][5];
        int R = 0 , C = 0 , value = 0;
        
        for (R = 0 ; R < 4 ; R++)
        {
            for (C = 0 ; C < 5 ; C++)
            {
                TwoD [R][C] = value;
                value++;
            }
        }
        
        for (R = 0 ; R < 4 ; R++)
        {
            for (C = 0 ; C < 5 ; C++)
                System.out.print(TwoD[R][C] + " "); //print space after every No.
            System.out.println(); //print space after every Row
            
        }
        
        System.out.println("----------------------------");
        IrregularMultiDimensionalArray irr = new IrregularMultiDimensionalArray();
        irr.irregularArray();
        
        System.out.println("----------------------------");
        Matrix matrix = new Matrix();
        matrix.matrixArray();
        System.out.println("----------------------------");
    }
}


class IrregularMultiDimensionalArray
{
    void irregularArray ()
    {
        int IrrArr [][] = new int [4][];
        IrrArr [0] = new int [1];
        IrrArr [1] = new int [2];
        IrrArr [2] = new int [3];
        IrrArr [3] = new int [4];
        
        int R = 0 , C = 0 , value = 0;
        
        for(R=0; R<4; R++)
        {
            for(C=0; C<R+1; C++)
            {
                IrrArr[R][C] = value;
                value++;
            }
        }
        
        for(R=0; R<4; R++)
        {
            for(C=0; C<R+1; C++)
            System.out.print(IrrArr[R][C] + " ");
        System.out.println();
        }
    }
}


class Matrix
{
    void matrixArray()
    {
       double matrixArr [][] = 
       {
           {1.1 , 1.2 , 1.3},
           {5.3 , 5.4 , 5.5},
           {7.5 , 7.6 , 7.7},
           {9.5 , 9.6 , 9.7}
       };
       int R = 0 , C = 0;
       
       for (R = 0 ; R < 4 ; R++)
       {
           for (C = 0 ; C < 3 ; C++)
               System.out.print(matrixArr[R][C] + "     ");
           System.out.println();
       }
    }
}