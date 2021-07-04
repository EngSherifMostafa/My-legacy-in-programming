#include <iostream>
#include <string.h>
#include "ListLinked.cpp"
using namespace std;

class Student
{
    char sName[20]={'\0'};
    int sID;
    float total,perc;

    public:
    void getStudDetails(char *name,int &id,float &t,float &p)
    {
        int i=0;
        while(sName[i]!='\0')
        {
            name[i]=sName[i];
            i++;
        }

        id=sID;
        t=total;
        p=perc;
    }

    void putStudDetails(char *name,int id,float t)
    {
        int i=0;
        while(name[i]!='\0')
        {
            sName[i]=name[i];
            i++;
        }

        sID=id;
        total=t;
        perc=(t/500)*100;
    }
};


int main()
{
    char name[20]={'\0'};
    int id;
    float total,perc;
    List<int,Student> l;
    Student stu;

    stu.putStudDetails("sherif",1,400);
    l.insertAfter(1,stu);

    stu.getStudDetails(name,id,total,perc);
    cout<<name<<endl;
    cout<<id<<endl;
    cout<<total<<endl;
    cout<<perc<<endl<<endl;

    stu.putStudDetails("mohamed",2,300);
    l.insertAfter(2,stu);

    stu.getStudDetails(name,id,total,perc);
    cout<<name<<endl;
    cout<<id<<endl;
    cout<<total<<endl;
    cout<<perc<<endl<<endl;

    stu.putStudDetails("sayed",3,200);
    l.insertAfter(3,stu);

    stu.getStudDetails(name,id,total,perc);
    cout<<name<<endl;
    cout<<id<<endl;
    cout<<total<<endl;
    cout<<perc<<endl<<endl;

    return 0;
}
