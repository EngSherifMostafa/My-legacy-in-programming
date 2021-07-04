//8 13 14 15 16 not solve yet
#include <iostream>
#include <math.h>
using namespace std;

void Page_64_Ex_1 (void);
void Page_64_Ex_2 (void);
void Page_64_Ex_3 (void);
void Page_65_Ex_4 (void);
void Page_65_Ex_5 (void);
void Page_65_Ex_6 (void);
void Page_66_Ex_7 (void);
void Page_66_Ex_8 (void);
void Page_67_Ex_9 (void);
void Page_67_Ex_10 (void);
void Page_67_Ex_11 (void);
void Page_67_Ex_12 (void);
void Page_67_Ex_13 (void);
void Page_68_Ex_14 (void);
void Page_68_Ex_15 (void);
void Page_68_Ex_16 (void);
void Page_68_Ex_17 (void);
void Page_69_Ex_18 (void);
void Page_69_Ex_19 (void);
void Page_69_Ex_20 (void);
void Page_70_Ex_21 (void);
void Page_70_Ex_22 (void);
void Page_70_Ex_23 (void);
void Page_71_Ex_24 (void);

int main()
{
    int select = 0;
    cout << endl << "Select the exercises that you want to run : ";
    cin >> select;

    switch (select)
    {
    case (1): Page_64_Ex_1 (); break;
    case (2): Page_64_Ex_2 (); break;
    case (3): Page_64_Ex_3 (); break;

    case (4): Page_65_Ex_4 (); break;
    case (5): Page_65_Ex_5 (); break;
    case (6): Page_65_Ex_6 (); break;

    case (7): Page_66_Ex_7 (); break;
    case (8): Page_66_Ex_8 (); break;

    case (9): Page_67_Ex_9 (); break;
    case (10): Page_67_Ex_10 (); break;
    case (11): Page_67_Ex_11 (); break;
    case (12): Page_67_Ex_12 (); break;
    case (13): Page_67_Ex_13 (); break;

    case (14): Page_68_Ex_14 (); break;
    case (15): Page_68_Ex_15 (); break;
    case (16): Page_68_Ex_16 (); break;
    case (17): Page_68_Ex_17 (); break;

    case (18): Page_69_Ex_18 (); break;
    case (19): Page_69_Ex_19 (); break;
    case (20): Page_69_Ex_20 (); break;

    case (21): Page_70_Ex_21 (); break;
    case (22): Page_70_Ex_22 (); break;
    case (23): Page_70_Ex_23 (); break;

    case (24): Page_71_Ex_24 (); break;

    default: cout << "Error";
    }

    return 0;
}


void Page_64_Ex_1 (void)
{
    cout << "Page_64_Ex_1" << endl << "-------------" << endl;
    int temp;
    cout << "Enter the temperature : ";
    // temp is a variable to store temperature
    cin >> temp;

    if (temp > 85)
        cout << "Swimming is the appropriate sport"<<endl;
    else if (temp <= 32)
        cout << "Skiing is the appropriate sport"<<endl;
    else if ((temp > 70)&&(temp <= 85))
        cout << "Tennis is the appropriate sport"<<endl;
    else if ((temp > 32)&&(temp <= 70))
        cout << "Golf is the appropriate sport"<<endl;
    main();
}

void Page_64_Ex_2 (void)
{
    cout << "Page_64_Ex_2" << endl << "-------------" << endl;
    // two variable to store
    // student number - hours completed
    int studentNum = 0, hoursCompleted = 0;
    cout << "Enter the student number : ";
    cin >> studentNum;
    cout << "Enter Hours Completed : ";
    cin >> hoursCompleted;

    if (hoursCompleted <30)
        cout << "This student is Freshman" << endl;
    else if (hoursCompleted>=90)
        cout << "This student is Senior" << endl;
    else if ((hoursCompleted >= 60)&& (hoursCompleted < 90))
         cout << "This student is Junior" << endl;
    else if ((hoursCompleted >= 30)&& (hoursCompleted < 60))
         cout << "This student is Sophomore" << endl;
    main();
}

void Page_64_Ex_3 (void)
{
    cout << "Page_64_Ex_3" << endl << "-------------" << endl;
    // three variable to store age - sex - marital status
    int age = 0;
    char sex = 0, maritalStatus = 0;

    cout << "Enter the Age : ";
    cin >> age;
    cout << "Enter the Sex : ";
    cin >> sex;
    cout << "Enter the Marital Status : ";
    cin >> maritalStatus;

    if ((sex == 'm')&&(age < 25)&&(maritalStatus == 'm'))
    cout << "Insurance Rate = 400" << endl;

    else if ((sex == 'm')&&(age < 25)&&(maritalStatus == 's'))
    cout << "Insurance Rate = 500" << endl;

    else if ((sex == 'm')&&(age >= 25)&&(maritalStatus == 'm'))
    cout << "Insurance Rate = 100" << endl;

    else if ((sex == 'm')&&(age >= 25)&&(maritalStatus == 's'))
    cout << "Insurance Rate = 200" << endl;

    else if ((sex == 'f')&&(age < 25)&&(maritalStatus == 'm'))
    cout << "Insurance Rate = 300" << endl;

    else if ((sex == 'f')&&(age < 25)&&(maritalStatus == 's'))
    cout << "Insurance Rate = 300" << endl;

    else if ((sex == 'f')&&(age >= 25)&&(maritalStatus == 'm'))
    cout << "Insurance Rate = 100" << endl;

    else if ((sex == 'f')&&(age >= 25)&&(maritalStatus == 's'))
    cout << "Insurance Rate = 200" << endl;
    main();
}

void Page_65_Ex_4 (void)
{
    cout << "Page_65_Ex_4" << endl << "-------------" << endl;
    float a = 0.0, b = 0.0, c = 0.0, root = 0.0, x1 = 0.0, x2 = 0.0;
    cout << "Enter value of A , B and C : ";
    cin >> a >> b >> c;

    root = (b*b)-(4*a*c);
    if (root > 0) //positive
        cout << "Two distinct real roots exist" << endl;
    if (root == 0)
        cout << "Two equal real roots exist" << endl;
    if (root < 0) //negative
        cout << "We have two complex roots" << endl;

    root = sqrt(root);
    x1 = (-1 * b + root)/2*a;
    x2 = (-1 * b - root)/2*a;
    cout << "Result one is : " << x1 << endl;
    cout << "Result two is : " << x2 << endl;
    main();
}

void Page_65_Ex_5 (void)
{
    cout << "Page_65_Ex_5" << endl << "-------------" << endl;
    int BirthDay = 0, BirthMonth = 0, BirthYear = 0;
    int CurrentDay = 0, CurrentMonth = 0, CurrentYear = 0;
    int days = 0;

    cout << "Enter birth date (day , month , year) : ";
    cin >> BirthDay >> BirthMonth >> BirthYear;

    cout << "Enter current date (day , month , year) : ";
    cin >> CurrentDay >> CurrentMonth >> CurrentYear;

    // days in the current month
    days += CurrentDay;
    CurrentMonth--;

    for (CurrentYear ; CurrentYear > BirthYear ; CurrentYear--)
    {
        for (CurrentMonth ; CurrentMonth >= 1 ; CurrentMonth--)
        {
            if (CurrentMonth == 4 || CurrentMonth == 6 || CurrentMonth == 9 || CurrentMonth == 11)
                days += 30;

            else if ((CurrentMonth == 2) && (CurrentYear % 4 == 0))
                days += 29;

            else if ((CurrentMonth == 2) && (CurrentYear % 4 != 0))
                days += 28;

            else
                days += 31;
        }
        CurrentMonth = 12;
    }

    for (CurrentMonth ; CurrentMonth > BirthMonth ; CurrentMonth--)
        {
            if (CurrentMonth == 4 || CurrentMonth == 6 || CurrentMonth == 9 || CurrentMonth == 11)
                days += 30;

            else if ((CurrentMonth == 2) && (CurrentYear % 4 == 0))
                days += 29;

            else if ((CurrentMonth == 2) && (CurrentYear % 4 != 0))
                days += 28;

            else
                days += 31;
        }

    if (CurrentMonth == 4 || CurrentMonth == 6 || CurrentMonth == 9 || CurrentMonth == 11)
                days = days + (30 - BirthDay);

    else if ((CurrentMonth == 2) && (CurrentYear % 4 == 0))
        days = days + (29 - BirthDay);

    else if ((CurrentMonth == 2) && (CurrentYear % 4 != 0))
        days = days + (28 - BirthDay);

    else
        days = days + (31 - BirthDay);

    BirthYear = days / 365;
    days = days % 365;
    BirthMonth = days / 30;
    BirthDay = days % 30;

    cout << "Your age " << BirthYear << " Years";
    cout << ", " << BirthMonth << " Months";
    cout << " And " << BirthDay << " Days" << endl;
    main();
}

void Page_65_Ex_6 (void)
{
    cout << "Page_65_Ex_6" << endl << "-------------" << endl;
    int days = 0, months = 0, years = 0;
    cout << "Enter the date that you want to convert (day , month , year) : ";
    cin >> days >> months >> years;

    if ((days % 10) == 1)
        cout << days << "st ";
    else if ((days % 10) == 2)
        cout << days << "nd ";
    else if ((days % 10) == 3)
        cout << days << "rd ";
    else
        cout << days << "th ";

    switch (months)
    {
        case 1: cout << "Jan "; break;
        case 2: cout << "Feb "; break;
        case 3: cout << "Mar "; break;
        case 4: cout << "Apr "; break;
        case 5: cout << "May "; break;
        case 6: cout << "Jun "; break;
        case 7: cout << "Jul "; break;
        case 8: cout << "Aug "; break;
        case 9: cout << "Sept "; break;
        case 10: cout << "Oct "; break;
        case 11: cout << "Nov "; break;
        case 12: cout << "Dec "; break;
    }

    if (years <= 99)
        cout << "19" << years << endl;
    else
        cout << years << endl;
    main();
}

void Page_66_Ex_7 (void)
{
    cout << "Page_66_Ex_7" << endl << "-------------" << endl;
    int hour = 0, minute = 0;
    float tax = 1.04, callRate = 0.4, price = 0.0;

    cout << "Enter time of call (24-Hours System): ";
    cin >> hour;
    cout << "Enter length of call (per minute) : ";
    cin >> minute;

    // take discount when call more than 60 minutes
    if (minute >= 60 && (hour >= 20 || hour <= 7))
    {
        price = minute * callRate; // price of call
        price = price * .5; // price after normal discount
        price = price * (1 - .15); // price after minutes discount
        price = price * tax; // price after tax
    }

    else if (minute >= 60 && hour > 7)
    {
        price = minute * callRate; // price of call
        price = price * (1 - .15); // price after minutes discount
        price = price * tax; // price after tax
    }

    else if (hour >= 20 || hour <= 7)
    {
        price = minute * callRate; // price of call
        price = price * tax; // price after tax
        price = price * .5; // price after discount
    }
    else
    {
        price = minute * callRate; // price of call
        price = price * tax; // price after tax
    }
    cout << "Price of call : $" << price << endl;
    main();
}

void Page_66_Ex_8 (void)
{
    cout << "Page_66_Ex_8" << endl << "-------------" << endl;
    main();
}

void Page_67_Ex_9 (void)
{
    cout << "Page_67_Ex_9" << endl << "-------------" << endl;
    int years = 0, numOfPeople = 9870;
    for (years = 1 ; numOfPeople <= 30000 ; years++)
        numOfPeople = numOfPeople * 1.1;
    cout << "Number of years : " << years << endl;
    main();
}

void Page_67_Ex_10 (void)
{
    cout << "Page_67_Ex_10" << endl << "-------------" << endl;
    int x = 0;
    cout << "Enter number : ";
    cin >> x;
    if (x > 0)
        cout << "Number is positive" << endl;
    else if (x < 0)
        cout << "Number is negative" << endl;
    else
        cout << "Number is zero" << endl;
    main();
}

void Page_67_Ex_11 (void)
{
    cout << "Page_67_Ex_11" << endl << "-------------" << endl;
    int value = 0;
    cout << "Enter value of product : ";
    cin >> value;

    if (value == 0)
        main();
    else if (value < 0)
        value *= -1;

    if (value >= 1 && value <= 1000)
        cout << "A";
    else if (value >= 1001 && value <= 2000)
        cout << "B";
    else if (value >= 2001)
        cout << "C";
    main();
}

void Page_67_Ex_12 (void)
{
    cout << "Page_67_Ex_12" << endl << "-------------" << endl;
    float first = 0.0, last = 0.0;
    int step = 0;

    cout << "Enter first degree : ";
    cin >> first;
    cout << "Enter final degree : ";
    cin >> last;
    cout << "Enter step of table : ";
    cin >> step;

    cout << endl << "Celsius" << "\t" << "Fahrenheit" << endl;

    for (int i = 0 ; first <= last ; i++)
    {
        cout << "  " << first << "\t";
        cout << "  " << ((1.8 * first) + 32) << endl;
        first = first + step;
    }
    main();
}

void Page_67_Ex_13 (void)
{
    cout << "Page_67_Ex_13" << endl << "-------------" << endl;
    main();
}

void Page_68_Ex_14 (void)
{
    cout << "Page_68_Ex_14" << endl << "-------------" << endl;
    main();
}

void Page_68_Ex_15 (void)
{
    cout << "Page_68_Ex_15" << endl << "-------------" << endl;
    main();
}

void Page_68_Ex_16 (void)
{
    cout << "Page_68_Ex_16" << endl << "-------------" << endl;
    main();
}

void Page_68_Ex_17 (void)
{
    cout << "Page_68_Ex_17" << endl << "-------------" << endl;
    for (int line = 5 ; line >= 1 ; line--)
    {
        for (int space = 5 ; space > line ; space--)
            cout << " ";
        for (int x = 1 ; x <= line ; x++)
            cout << line << " ";

        cout << endl;
    }
    main();
}

void Page_69_Ex_18 (void)
{
    cout << "Page_69_Ex_18" << endl << "-------------" << endl;
    char mid_char = 'E';
    cout << "Enter char in appear in the middle : ";
    cin >> mid_char;

    for (int line = 1 ; line <= 5 ; line++)
    {
        for (int space = 1 ; space <= (5-line) ; space++)
            cout << " ";

        for (int ast = 1 ; ast <= (line*2)-1 ; ast++)
        {
            if (ast == 1 || ast == (line*2)-1)
                cout << (char) (mid_char-(5-line));
            else
                cout << "-";
        }
        cout << endl;
    }

    for (int line = 4 ; line >= 1 ; line--)
    {
        for (int space = 1 ; space <= (5-line) ; space++)
            cout << " ";
        for (int ast = 1 ; ast <= (line*2)-1 ; ast++)
        {
            if (ast == 1 || ast == (line*2)-1)
                cout << (char) (mid_char-(5-line));
            else
                cout << "-";
        }
        cout << endl;
    }
    main();
}

void Page_69_Ex_19 (void)
{
    cout << "Page_69_Ex_19" << endl << "-------------" << endl;
    for (int num = 99 ; num <= 496 ; num++)
    {
        for (int i = 0 ; i < 4 ; i++)
        {
            num++;
            if ((num == 111)||(num == 222)||(num == 333)||(num == 444))
            {
                cout << "--- ";
                continue;
            }
            cout << num << " ";
        }
        cout << endl;
        num --;
    }
    main();
}

void Page_69_Ex_20 (void)
{
    cout << "Page_69_Ex_20" << endl << "-------------" << endl;
    for (int l1 = 1 ; l1 <= 5 ; l1++)
    {
        for (int s1 = 1 ; s1 <= (5-l1) ; s1++)
            cout << " ";
        for (int a1 = 1 ; a1 <= (2*l1-1) ; a1++)
            cout << "*";

        cout << endl;
    }

    for (int l2 = 4 ; l2 >= 1 ; l2--)
    {
        for (int s2 = 5 ; s2 >= (l2+1) ; s2--)
            cout << " ";
        for (int a2 = 1 ; a2 <= (2*l2-1) ; a2++)
            cout << "*";

        cout << endl;
    }
    main();
}

void Page_70_Ex_21 (void)
{
    cout << "Page_70_Ex_21" << endl << "-------------" << endl;
    int num = 0, num1 = 0;
    int digitCounter = 0;
    // to store the original number
    int array1[4];
    cout << "Enter a number of 5 digits : ";
    cin >> num;
    num1 = num;
    while (num1)
    {
        num1 = num1 / 10;
        digitCounter ++;

        // warning message if input > 5
        if (digitCounter > 5)
        {
            cout << "Wrong input \nYou Exceeded 5 digits !" << endl;
            Page_70_Ex_21();
        }
    }

    // warning if digits < 5
    if (digitCounter < 5)
    {
        cout << "Wrong input \nYou Entered less than 5 digits !"<< endl;
        Page_70_Ex_21();
    }
    // for loop to store the original number
    for (int i = 0 ; i < 4 ; i++)
    {
        array1[i] = num%10;
        num = num / 10;
    }

    for (int i = 0 ; i <= 4 ; i++)
    {
        cout << array1[i];
    }
    cout << endl;

    // check if number is palindrome
    if ((array1[0] == array1[4])&&(array1[1] == array1[3]))
    {
        cout << "number is palindrome !" << endl;
        main();
    }
    else
    {
        cout << "number is not palindrome !" << endl;
        main();
    }
}

void Page_70_Ex_22 ()
{
    cout << "Page_70_Ex_22" << endl << "-------------" << endl;
    int num1 = 3 , num2 = 4;
    for (int index = 1 ; index < num1 ; index++)
    {
        cout << "Multiplication table " << index << endl;
        cout << "---------------------" << endl;
        for (int i = 1 ; i <= 12 ; i++)
            cout << index << " * " << i << " = " << index * i << endl ;
    }

    cout << "Multiplication table " << num2 << endl;
    cout << "---------------------" << endl;

    for (int i = 1 ; i < num2 ; i++)
       cout << i << " * " << num2 << " = " << num2 * i << endl;
    main();
}

void Page_70_Ex_23_Extension (int day , int day_OF_Month)
{
	day++;
    for (int i = 2 ; i <= day_OF_Month ; i++, day++)
    {
        if (day % 7 == 0)
        {
            cout << endl << " ";
        }
        if (i <= 9)
            cout << i << "     ";
        else
            cout << i << "    ";
    }
}

void Page_70_Ex_23 (void)
{
    cout << "Page_70_Ex_23" << endl << "-------------" << endl;
    int year = 0, month = 0, day = 0, day_OF_Month = 0;
    cout << "\nEnter Day Number (Saturday is 0 and Sunday is 1 and so on) Month and Year : ";
    cin >> day >> month >> year;

    if (day > 6)
    {
        cout << "You can not enter more than 6" << endl;
        Page_70_Ex_23();
    }

    //calculate days in month
    if (month == 4 || month == 6 || month == 9 || month == 11)
        day_OF_Month = 30;
    else if (month == 2 && year % 4 == 0)
        day_OF_Month = 29;
    else if (month == 2 && year % 4 != 0)
        day_OF_Month = 28;
    else
        day_OF_Month = 31;

    cout << "Sat   Sun   Mon   Tue   Wed   Thu   Fri" << endl;

    if (day == 0)
    {
        for (int space = 1 ; space <= 1 ; space++)
            cout << " ";
        cout << "1     ";
        Page_70_Ex_23_Extension(day , day_OF_Month);
    }

    else if (day == 1)
    {
        for (int space = 1 ; space <= 7 ; space++)
            cout << " ";
        cout << "1     ";
        Page_70_Ex_23_Extension(day , day_OF_Month);
    }

    else if (day == 2)
    {
        for (int space = 1 ; space <= 13 ; space++)
            cout << " ";
        cout << "1     ";
        Page_70_Ex_23_Extension(day , day_OF_Month);
    }

    else if (day == 3)
    {
        for (int space = 1 ; space <= 19 ; space++)
            cout << " ";
        cout << "1     ";
        Page_70_Ex_23_Extension(day , day_OF_Month);
    }

    else if (day == 4)
    {
        for (int space = 1 ; space <= 25 ; space++)
            cout << " ";
        cout << "1     ";
        Page_70_Ex_23_Extension(day , day_OF_Month);
    }

    else if (day == 5)
    {
        for (int space = 1 ; space <= 31 ; space++)
            cout << " ";
        cout << "1     ";
        Page_70_Ex_23_Extension(day , day_OF_Month);
    }

    else if (day == 6)
    {
        for (int space = 1 ; space <= 37 ; space++)
            cout << " ";
        cout << "1" << " ";
        Page_70_Ex_23_Extension(day , day_OF_Month);
    }
    main();
}

void Page_71_Ex_24 (void)
{
    cout << "Page_71_Ex_24" << endl << "-------------" << endl;
    int digits = 0, num = 25315;
    while ((num / 10))
    {
        digits ++;
        num /= 10;
    }

    // if there is a reminder digits ++
    if ((num % 10) != 0)
        digits++;

    cout << "This number have " << digits << " decimal digits" << endl;
    main();
}
