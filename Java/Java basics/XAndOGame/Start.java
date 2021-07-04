package xandogame;
import static java.lang.System.exit;

public class Start extends XAndOGame
{
    //User must write yes to play
    void startGame()
    {
        System.out.print("Do you want to play with me (Yes/No)? ");
        Question = scan.next();
        
        if ("yes".equals(Question) || "Yes".equals(Question))
        {
            System.out.print("Choose X or O to play: ");
            Alphabet = scan.next();
            createShape();
        }
        else
        {
            System.out.println("GoodBye *_*");
            exit(0);
        }
    }
    
    //Draw the shape of game
    void createShape ()
    {
        for (int i=0 ; i<9 ; i++)
        {
        System.out.print(ArrShape[i] + "      ");
        if (i == 2 || i== 5 || i==8)
            System.out.println("");
        }
        humman();
    }
    
    //User enter the position that play in it
    void humman ()
    {
        System.out.print("Please select the position that you want to paly in (1-9): ");
        Position = scan.nextInt();
        //user limit in position (1 - 9)
        if (Position > 9 || Position < 1)
        {
            System.out.println("This position is not available");
            createShape();
        }
        
        //User cannot use the same position again
        for (int i = 0 ; i < 9 ; i++)
        {
            if (UserPosition[i] == Position)
            {
                System.out.println("You can not use this position again");
                createShape();
            }
        }
        
        ArrShape[Position-1] = Alphabet;
        UserPosition [CounterPosition] = Position;
        CounterPosition++;
        End endGame = new End();
        endGame.check();
        createShape();
    }
}