#include <iostream>
#include "ListLinked.cpp"
using namespace std;

class Student
{
public:
	void getStudDetails() const;
	void putStudDetails(char*,int,float);
	friend std::ostream& operator<<(ostream &,const Student &);

private:
	char *stud_name;
	int stud_ID;
	float total,perc;

	int key=0;
	List<int,Student> li;
};

void Student::putStudDetails(char *stud_name,int stud_ID,float total)
{
	this->stud_name=stud_name;
	this->stud_ID=stud_ID;
	this->total=total;
	perc=(total/500)*100;
	li.insertFirst(++key,*this);
}

void Student::getStudDetails() const
{
	cout<<*this;
}

std::ostream& operator<<(ostream &os,const Student &obj)
{
	os<<"Student name : "<<obj.stud_name<<endl;
	os<<"Student ID : "<<obj.stud_ID<<endl;
	os<<"Student total : "<<obj.total<<endl;
	os<<"Student percentage : "<<obj.perc<<endl;
	os<<"---------------------------------\n";
	return os;
}
