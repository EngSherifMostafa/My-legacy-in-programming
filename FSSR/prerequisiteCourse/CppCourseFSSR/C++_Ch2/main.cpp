#include <iostream>
using namespace std;

void Page_32_Ex_1 (void);
void Page_32_Ex_2 (void);
void Page_32_Ex_3 (void);
void Page_32_Ex_4 (void);
void Page_33_Ex_5 (void);
void Page_33_Ex_6 (void);
void Page_34_Ex_7 (void);
void Page_34_Ex_8 (void);

int main ()
{
    int select = 0;
    cout << endl << "Select the example that you want to run : ";
    cin >> select;

    switch (select)
    {
    case (1): Page_32_Ex_1 (); break;
    case (2): Page_32_Ex_2 (); break;
    case (3): Page_32_Ex_3 (); break;
    case (4): Page_32_Ex_4 (); break;
    case (5): Page_33_Ex_5 (); break;
    case (6): Page_33_Ex_6 (); break;
    case (7): Page_34_Ex_7 (); break;
    case (8): Page_34_Ex_8 (); break;
    default: cout << "Error" << endl;
    }

    return 0;
}


void Page_32_Ex_1 (void)
{
    cout << "Page_32_Ex_1" << endl << "-------------" << endl;
    int r , area , circum = 0;
    float Pi = 3.14159;

    cout << "Enter the radius : ";
    cin >> r;

    area = Pi * r * r;
    circum = 2 * Pi * r;

    cout << "Area is : " << area << endl;
    cout << "Circumference is : " << circum << endl;
    main();
}

void Page_32_Ex_2 (void)
{
    cout << "Page_32_Ex_2" << endl << "-------------" << endl;
    float f , c = 0.0;

    cout << "Enter the degree in Fahrenheit : ";
    cin >> f;

    c = (5.0/9.0)*(f-32.0);

    cout << "The degree in Celsius is : " << c << endl;
    main();
}

void Page_32_Ex_3 (void)
{
    cout << "Page_32_Ex_3" << endl << "-------------" << endl;
    float p , k = 0.0;
    float constant = 0.453592;

    cout << "Enter the weight in pounds : ";
    cin >> p;

    k = p * constant;

    cout << "The weight in KM is : " << k << endl;
    main();
}

void Page_32_Ex_4 (void)
{
    cout << "Page_32_Ex_4" << endl << "-------------" << endl;
    float len_1 , len_2 , wid_1 , wid_2 = 0.0;
    float area_1 , area_2 , dif_area = 0.0;
    float sec = 0.0;

    cout << "Enter length and width of house : ";
    cin >> len_1 >> wid_1;
    cout << "Enter length and width of garden : ";
    cin >> len_2 >> wid_2;

    area_1 = len_1 * wid_1;
    area_2 = len_2 * wid_2;
    dif_area = area_2 - area_1;
    dif_area *= .914;
    sec = dif_area / 2;

    cout << "The time required is : " << sec << endl;
    main();
}

void Page_33_Ex_5 (void)
{
    cout << "Page_33_Ex_5" << endl << "-------------" << endl;
    double grossSalary = 78000;
    int socialSec = .705 * 58000;
    int fedralTax = (78000.0 - 30000.0) * .28;
    int stateTax = .1 * grossSalary;
    float incomeAfterTax = socialSec + fedralTax + stateTax + 3000.0;

    cout << "Income after tax is : " << incomeAfterTax << endl;
    main();
}

void Page_33_Ex_6 (void)
{
    cout << "Page_33_Ex_6" << endl << "-------------" << endl;
    float CDsPrice = 13.95 * 23;
    float discout = .18 * CDsPrice;
    float priceAfterDiscount = CDsPrice - discout;
    float stateTax = .075 * priceAfterDiscount;
    float actualCost = priceAfterDiscount + stateTax;

    cout << "Actual Cost is : " << actualCost << endl;
    main();
}

void Page_34_Ex_7 (void)
{
    cout << "Page_34_Ex_7" << endl << "-------------" << endl;
    float originalCost = 0.0;
    float stickerPrice = 89.950;

    cout << "Enter original cost of car : ";
    cin >> originalCost;

    float priceAfterDiscount = originalCost - (.12 * originalCost);
    float luxuryTax = .1 * (priceAfterDiscount - 30000.0);
    float stateTax = .0875 * priceAfterDiscount;
    float actualCost = priceAfterDiscount + luxuryTax + stateTax + stickerPrice;

    cout << "Actual Cost is : " << actualCost << endl;
    main();
}

void Page_34_Ex_8 (void)
{
    cout << "Page_34_Ex_8" << endl << "-------------" << endl;
    float interest = .06;
    float startBalance = 5000.0;
    float interestYears = 1.0;

        for (int years = 1 ; years <= 7 ; years++)
            interestYears *= (1 + interest);

    float amount = startBalance * interestYears;

    cout << "The amount of deposit after 7 years is : " << amount << endl;
    main ();
}
