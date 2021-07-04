#include <iostream>
using namespace std;
void getSales (double * , int);
void totalSales (double * , int);

int main()
{
    const int totalQuarters = 4; //numbers of quarters per year
    double sales[totalQuarters];

    getSales(sales , totalQuarters); //getSales function pass 2 arguments double pointer and int variable
    totalSales(sales , totalQuarters); //totalSales function pass 2 arguments double pointer and int variable

    return 0;
}

//this function get 4 sales from user
void getSales(double *ptr , int quarter)
{
    for (int i = 0 ; i < quarter ; i++)
    {
        cout << "Enter sales figure for quarter No. " << i+1 << ": ";
        cin >> *(ptr + i); //store every value in pointer that point elements in sales array
    }
}

void totalSales(double *ptr , int quarter)
{
    double sum = 0.0;

    for (int i = 0 ; i < quarter ; i++)
        sum += *(ptr+i); //add every sale in sum variable

    cout << "Total salary = " << sum;
}
