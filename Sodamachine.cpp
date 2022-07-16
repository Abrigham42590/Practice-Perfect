#include <iostream>
#include <iomanip>
using namespace std;



const int SODA_NAMES = 5;
string sodanamedata[SODA_NAMES] = { "Cola", "Root Beer", "Orange Soda", "Grape Soda", "Bottled Water" };

const int SODA_NUMBERS = 10;
double sodanumbersdata[SODA_NUMBERS] = { 1.00, 20, 1.00, 20, 1.00, 20, 1.50, 20, 1.50, 20 };

class SodaMachine {
public:

    void displayChoices() {
        cout << "Drink Machine Menu" << endl;
        cout << "1. " << sodanamedata[0] << fixed << setprecision(2) << right << setw(12) << ": " << "$" << sodanumbersdata[0] << endl;
        cout << "2. " << sodanamedata[1] << right << setw(7) << ": " << "$" << sodanumbersdata[2] << endl;
        cout << "3. " << sodanamedata[2] << right << setw(5) << ": " << "$" << sodanumbersdata[4] << endl;
        cout << "4. " << sodanamedata[3] << right << setw(6) << ": " << "$" << sodanumbersdata[6] << endl;
        cout << "5. " << sodanamedata[4] << right << setw(3) << ": " << "$" << sodanumbersdata[8] << endl;
        cout << "6. " << "Quit Drink Machine " << endl;
    }

    void buyDrink() {
        double moneyamount, count = 0, total1 = 20, total2 = 20, total3 = 20, total4 = 20, total5 = 20, totalsales1 = 0, totalsales2 = 0,
            totalsales3 = 0, totalsales4 = 0, totalsales5 = 0, finalsalestotal, selection;
        string purchasechoice;
        while (count < 1) {
            displayChoices();
            cout << "Please make a selection : ";
            cin >> selection;
            if (selection >= 7 || selection <= 0) {
                cout << "Please enter a valid choice (1 - 6): ";
                cin >> selection;

            }

            if (selection >= 7 || selection <= 0) {
                cout << "Please enter a valid choice (1 - 6): ";
                cin >> selection;
                totalsales1 = sodanumbersdata[0];
                totalsales1 = totalsales1 + 3.00;
            }
            if (selection == 6) {
                cout << "Thank you for shopping!" << endl;
                cout << endl;
                break;
            }
            cout << "How much money has been inserted: $";
            cin >> moneyamount;
            if (selection == 1) {
                if (moneyamount < 1) {
                    cout << "Not enough money, please enter $1.00 or more: $";
                    cin >> moneyamount;
                    totalsales1 = sodanumbersdata[0];
                }
                if (moneyamount < 1) {
                    cout << "Not enough money, please ener $1.00 or more: $";
                    cin >> moneyamount;
                    totalsales1 = sodanumbersdata[0];

                }
                if (moneyamount < 1) {
                    cout << "Not enough money, please enter $1.00 or more: $";
                    cin >> moneyamount;
                    totalsales1 = sodanumbersdata[0];
                }
            }
            if (selection == 2) {
                if (moneyamount < 1) {
                    cout << "Not enough money, please enter $1.00 or more: $";
                    cin >> moneyamount;
                    totalsales2 = sodanumbersdata[2];
                }
                if (moneyamount < 1) {
                    cout << "Not enough money, please ener $1.00 or more: $";
                    cin >> moneyamount;
                    totalsales2 = sodanumbersdata[2];
                }
                if (moneyamount < 1) {
                    cout << "Not enough money, please enter $1.00 or more: $";
                    cin >> moneyamount;
                    totalsales2 = sodanumbersdata[2];
                }
            }
            if (selection == 3) {
                if (moneyamount < 1) {
                    cout << "Not enough money, please enter $1.00 or more: $";
                    cin >> moneyamount;
                    totalsales3 = sodanumbersdata[4];
                }
                if (moneyamount < 1) {
                    cout << "Not enough money, please ener $1.00 or more: $";
                    cin >> moneyamount;
                    totalsales3 = sodanumbersdata[4];
                }
                if (moneyamount < 1) {
                    cout << "Not enough money, please enter $1.00 or more: $";
                    cin >> moneyamount;
                    totalsales3 = sodanumbersdata[4];
                }
            }
            if (selection == 4) {
                if (moneyamount < 1.50) {
                    cout << "Not enough money, please enter $1.50 or more: $";
                    cin >> moneyamount;
                    totalsales4 = sodanumbersdata[6];
                }
                if (moneyamount < 1.50) {
                    cout << "Not enough money, please enter $1.50 or more: $";
                    cin >> moneyamount;
                    totalsales4 = sodanumbersdata[6];
                }
                if (moneyamount < 1.50) {
                    cout << "Not enough money, please enter $1.50 or more: $";
                    cin >> moneyamount;
                    totalsales4 = sodanumbersdata[6];
                }
            }
            if (selection == 5) {
                if (moneyamount < 1.50) {
                    cout << "Not enough money, please enter $1.50 or more: $";
                    cin >> moneyamount;
                    totalsales5 = sodanumbersdata[8];
                }
                if (moneyamount < 1.50) {
                    cout << "Not enough money, please enter $1.50 or more: $";
                    cin >> moneyamount;
                    totalsales5 = sodanumbersdata[8];
                }
                if (moneyamount < 1.50) {
                    cout << "Not enough money, please enter $1.50 or more: $";
                    cin >> moneyamount;
                    totalsales5 = sodanumbersdata[8];
                }
            }
            cout << "Do you still want to make a purchase? (Y / N) : ";
            cin >> purchasechoice;
            if (selection == 1) {
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
            }
            if (selection == 1) {
                if (purchasechoice == "Y" || purchasechoice == "y") {
                    cout << "Here is your " << sodanamedata[0] << ", and your change of $" << (inputMoney(moneyamount) - sodanumbersdata[0]) << endl;
                    total1 -= 1;
                    totalsales1 = sodanumbersdata[0];
                }
            }
            if (selection == 1) {
                if (purchasechoice == "N") {
                    continue;
                }
            }
            if (selection == 2) {
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
            }
            if (selection == 2) {
                if (purchasechoice == "Y" || purchasechoice == "y") {
                    cout << "Here is your " << sodanamedata[1] << ", and your change of $" << (inputMoney(moneyamount) - sodanumbersdata[2]) << endl;
                    total2 -= 1;
                    totalsales2 = sodanumbersdata[2];
                }
            }
            else if (selection == 2) {
                if (purchasechoice == "N") {
                    continue;
                }
            }
            if (selection == 3) {
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
            }
            if (selection == 3) {
                if (purchasechoice == "Y" || purchasechoice == "y") {
                    cout << "Here is your " << sodanamedata[2] << ", and your change of $" << (inputMoney(moneyamount) - sodanumbersdata[4]) << endl;
                    total3 -= 1;
                    totalsales3 = sodanumbersdata[4];
                }
            }
            else if (selection == 3) {
                if (purchasechoice == "N") {
                    continue;
                }
            }
            if (selection == 4) {
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
            }
            if (selection == 4) {
                if (purchasechoice == "Y" || purchasechoice == "y") {
                    cout << "Here is your " << sodanamedata[3] << ", and your change of $" << (inputMoney(moneyamount) - sodanumbersdata[6]) << endl;
                    total4 -= 1;
                    totalsales4 = sodanumbersdata[6];
                }
            }

            else if (selection == 4) {
                if (purchasechoice == "N") {
                    continue;
                }
            }
            if (selection == 5) {
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
                if (purchasechoice != "Y" && purchasechoice != "y" && purchasechoice != "N" && purchasechoice != "n") {
                    cout << "Please enter Y or N: ";
                    cin >> purchasechoice;
                }
            }
            if (selection == 5) {
                if (purchasechoice == "Y" || purchasechoice == "y") {
                    cout << "Here is your " << sodanamedata[4] << ", and your change of $" << (inputMoney(moneyamount) - sodanumbersdata[8]) << endl;
                    total5 -= 1;
                    totalsales5 = sodanumbersdata[8];
                }
            }
            else if (selection == 5) {
                if (purchasechoice == "N") {
                    continue;
                }
            }
        }

        finalsalestotal = (totalsales1 + totalsales2 + totalsales3 + totalsales4 + totalsales5);
        cout << "Drink Machine Daily Report" << endl;
        cout << sodanamedata[0] << fixed << setprecision(0) << right << setw(13) << ": " << dailyReport(total1) << endl;
        cout << sodanamedata[1] << right << setw(8) << ": " << dailyReport(total2) << endl;
        cout << sodanamedata[2] << right << setw(6) << ": " << dailyReport(total3) << endl;
        cout << sodanamedata[3] << right << setw(7) << ": " << dailyReport(total4) << endl;
        cout << sodanamedata[4] << right << setw(4) << ": " << dailyReport(total5) << endl;
        cout << "Total amount collected : " << "$" << fixed << setprecision(2) << dailyReport(finalsalestotal);
    }

private:
    double inputMoney(double moneyamount) {
        return moneyamount;
    }
    double dailyReport(double value) {
        return value;
    }

};


int main() {
    SodaMachine machine1;
    machine1.buyDrink();
    return 0;
}