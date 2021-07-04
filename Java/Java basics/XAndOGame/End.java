package xandogame;
class End extends Start
{
    void check ()
    {
        if("x".equals(ArrShape[0]) && "x".equals(ArrShape[1]) && "x".equals(ArrShape[2]) 
        || "x".equals(ArrShape[3]) && "x".equals(ArrShape[4]) && "x".equals(ArrShape[5])
        || "x".equals(ArrShape[6]) && "x".equals(ArrShape[7]) && "x".equals(ArrShape[8]))
        {
            createShape();
            System.out.println("X is Winner !");
            startGame();
        }

        else if ("o".equals(ArrShape[0]) && "o".equals(ArrShape[1]) && "o".equals(ArrShape[2]) 
        || "o".equals(ArrShape[3]) && "o".equals(ArrShape[4]) && "o".equals(ArrShape[5])
        || "o".equals(ArrShape[6]) && "o".equals(ArrShape[7]) && "o".equals(ArrShape[8]))
        {
            createShape();
            System.out.println("O is Winner !");
            startGame();
        }
        
        for (int i = 0; i < 9 ; i++)
        {
        if ("x".equals(ArrShape[i]) || "o".equals(ArrShape[i]))
            fullCounter++;
        if (fullCounter == 9)
            System.out.println("Game is draw *_*");
        }
    }
}