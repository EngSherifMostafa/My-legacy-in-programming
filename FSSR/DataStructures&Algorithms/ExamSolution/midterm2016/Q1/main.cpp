#include "Student.cpp"
int main()
{
    Student s1,s2,s3;

    s1.putStudDetails("Hemed",1,25.5);
    s2.putStudDetails("Sherif",2,30.5);
    s3.putStudDetails("asmaa",3,40.5);

	s1.getStudDetails();
    s2.getStudDetails();
    s3.getStudDetails();

    return 0;
}
