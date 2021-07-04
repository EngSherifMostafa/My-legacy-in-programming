#include <iostream>
#include <unistd.h>
using namespace std;

class StepOne
{
   public:
        int minutes , seconds;

    public:
    void screenOne ()
    {
        cout << "Select minutes : " << endl;
        cin >> minutes;
    }

    void screenTwo ()
    {
        cout << "Select seconds : " << endl;
        cin >> seconds;
    }

    void screenThree ()
    {
        cout << endl;
        cout << minutes << "minutes + " << seconds << "seconds" << endl;
        cout << "Press Enter to start game";
    }
};

class StepTwo
{
    private:
    char stopClk = '0';

    void playersTime(int minutes , int seconds)
    {
        int p1Min = minutes , p1Sec = seconds;
        int p2Min = minutes , p2Sec = seconds;
    }

    void screenFour (int &p1Min , int &p1Sec , int &p2Min , int &p2Sec)
    {
        cout << "Player One : " << p1Min << " Min , " << p1Sec << "Sec" << endl;
        cout << "Player Two : " << p2Min << " Min , " << p2Sec << "Sec" << endl;
    }

    void clock (int &minutes , int &seconds , char &stopClk , int &player)
    {
        while (stopClk != '0')
        {
        for (seconds ; seconds>=0 ; seconds--)
        {
            if (player == 1)
                screenFour(minutes , seconds , p2Min , p2Sec);
            else if (player == 2)
                screenFour(p1Min , p1Sec , minutes , seconds);

            usleep(999999);
            cin >> stopClk;

            if(minutes==0 && seconds==0 || stopClk=='0')
                break;

            else if (seconds==0)
            {
                minutes--;
                seconds=60;
            }
        }
        }
    }

    public:
    void playerOne (int minutes , int seconds)
    {
        //player one press to stop his time & start player two time
        clock (p2Min , p2Sec , stopClk , player);
    }

    void playerTwo (int minutes , int seconds)
    {
        //player two press to stop his time & start player one time
        clock (p1Min , p1Sec , stopClk , player);
    }

};


int main ()
{
    int player = 0;

    StepOne stepOne;
    stepOne.screenOne();
    stepOne.screenTwo();
    stepOne.screenThree();

    StepTwo stepTwo;
    stepTwo.playersTime(stepOne.minutes , stepOne.seconds);

    if (player == 1)
        stepTwo.playerOne(stepOne.minutes , stepOne.seconds);
    else if (player == 2)
        stepTwo.playerTwo(stepOne.minutes , stepOne.seconds);

    return 0;
}
