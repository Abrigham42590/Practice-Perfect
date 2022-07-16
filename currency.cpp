#include <iostream>
using namespace std;

int main() {
	double yen, euro, dollars;
	cout << "Currency Conversion Machine" << endl;
	cout << "Enter amount in US Dollars: $";
	cin >> dollars;
	yen = dollars * 105.64;
	euro = dollars * .80;
	cout << "Your amount in YEN: " << yen << endl;
	cout << "Your amount in EURO: " << euro << endl;
	return 0;
}