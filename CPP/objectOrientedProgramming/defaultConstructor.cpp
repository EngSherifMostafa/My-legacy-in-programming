#include <iostream>
#include <iomanip>
using namespace std;

class Time
{
private:
    int hour,minute,second;

public:
    //constructor with default value 0
    Time (int h=0 , int m=0 , int s=0);
    //setter function
    void setTime (int h, int m, int s);
    //print description of object in hh:mm:ss
    void print ();
    //compare two time object
    bool equals (Time);
};

Time :: Time(int h, int m, int s)
{
    hour = h;
    minute = m;
    second = s;
}

void Time :: setTime(int h, int m, int s)
{
    hour = h;
    minute = m;
    second = s;
}

void Time :: print()
{
    cout << setw(2) << setfill('0') << hour << ":"
    << setw(2) << setfill('0') << minute << ":"
    << setw(2) << setfill('0') << second << "\n";
}

bool Time :: equals (Time otherTime)
{
    if(hour == otherTime.hour && minute == otherTime.minute && second == otherTime.second)
        return true;
    else
        return false;
}

int main ()
{
    Time t1(10,50,59);
    t1.print();
    Time t2;
    t2.print();
    t2.setTime(6,39,9);
    t2.print();

    if(t1.equals(t2))
        cout << "Two objects are equals\n";
    else
        cout << "Two objects are not equals\n";
    return 0;
}
