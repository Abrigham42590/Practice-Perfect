#include <iostream>
#include <fstream>
#include <iomanip>
using namespace std;

const int HOURS_PAY = 14;
double hoursandpay[HOURS_PAY];

class Employeedata {
public:
    double employee1calculation() {
        return hoursandpay[0] * hoursandpay[1];
    }
    double employee2calculation() {
        return hoursandpay[2] * hoursandpay[3];
    }
    double employee3calculation() {
        return hoursandpay[4] * hoursandpay[5];
    }
    double employee4calculation() {
        return hoursandpay[6] * hoursandpay[7];
    }
    double employee5calculation() {
        return hoursandpay[8] * hoursandpay[9];
    }
    double employee6calculation() {
        return hoursandpay[10] * hoursandpay[11];
    }
    double employee7calculation() {
        return hoursandpay[12] * hoursandpay[13];
    }
};



int main()
{
    Employeedata employees[HOURS_PAY]{};
    int count = 0;
    ifstream datafile;

    datafile.open("payroll.dat");
    while (count < HOURS_PAY && datafile >> hoursandpay[count]) {
        count++;
    }

    datafile.close();
    cout << "Employee 1: " << fixed << setprecision(2) << employees[count].employee1calculation();
    cout << endl;
    cout << "Employee 2: " << employees[count].employee2calculation();
    cout << endl;
    cout << "Employee 3: " << employees[count].employee3calculation();
    cout << endl;
    cout << "Employee 4: " << employees[count].employee4calculation() << endl;
    cout << "Employee 5: " << employees[count].employee5calculation() << endl;
    cout << "Employee 6: " << employees[count].employee6calculation() << endl;
    cout << "Employee 7: " << employees[count].employee7calculation() << endl;

    return 0;
}