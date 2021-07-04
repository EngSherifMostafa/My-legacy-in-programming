package xandogame;
import java.util.Scanner;

public class XAndOGame
{  
    Scanner scan = new Scanner(System.in);
    String Question;
    String Alphabet;
    int Position;
    int CounterPosition, fullCounter;
    static String ArrShape [] = new String [9];
    int UserPosition [] = new int [9];
    
    public static void main (String [] args)
    {
        Start sta = new Start();
        sta.startGame();
    }
}