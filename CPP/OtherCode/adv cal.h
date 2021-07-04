#include <config.h>
 int main ()
 {
    system("color 0a") ;

    while (1)
    {
    double x = 0 , y = 0 , power = 1 , fact = 1 ;
    int rep = 1 ;
    char opcode , again ;
//************************************************
        cout << "\nPlease enter two No. = " ;
        cin >> x >> y ;
        cout << "Please enter operation : " ;
        cin >> opcode ;
//************************************************
        switch (opcode)
        {
//************************************************
        case '+' :
            cout << "x + y = " << x + y << endl ;
        break ;
//************************************************
        case '-' :
            cout << "x - y = " << x - y << endl ;
        break ;
//************************************************
        case '*' :
            cout << "x * y = " << x * y << endl ;
        break ;
//************************************************
        case '/' :
            cout << "x / y = " << x / y << endl ;
        break ;
//************************************************
        case '^' :
        power = x ;
            while (y != 0)
            {
                if (y > 1)
                {
                x *= power ;
                y-- ;
                }
                else
                y = 0 ;
            }

            cout << "x ^ y = " << x << endl ;
        break ;
//************************************************
        case '!' :
        fact = x ;
            while (rep != x)
            {
                fact *= (x - rep) ;
                rep++ ;
            }

            cout << "x! = " << fact << endl ;
        break ;
//************************************************
        }
//************************************************
        cout << "again y / n : " ;
        cin >> again ;
        if (again == 'n' || again == 'N')
            break ;
    }
//************************************************
return 0 ;
}