#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
	double startingbalance, deposits1, deposits2, deposits3, interestearned1, interestearned2, interestearned3, withdrawals1, withdrawals2, withdrawals3, annualinterestrate, newbalance1, newbalance2, monthlyinterestrate, balance, endingbalance, average, newbalance;
	cout << "Welcome to Your Bank!" << endl;
	cout << "What is your starting Balance? $" << fixed << showpoint << setprecision(2);
	cin >> startingbalance;
	cout << "What is the annual interest rate?. Please enter whole value. For example 6 for 6% :";
	cin >> annualinterestrate;

	cout << endl;
	balance = 0;
	do {
		balance = balance + 1;
		cout << "Month #1" << endl;
		cout << "Current Balance: $" << startingbalance << fixed << showpoint << setprecision(2) << endl;
		cout << "Please enter total amount of deposits: $";
		cin >> deposits1;
		if (deposits1 < 0) {
			cout << "Deposit must be a positive number!" << endl;
			cout << "Please enter total amount of deposits: $";
			cin >> deposits1;
		}
		cout << "Please enter total amount of withdrawals: $";
		cin >> withdrawals1;
		if (withdrawals1 < 0) {
			cout << "Withdrawal must be a positive number and not be larger than";
			cout << " balance: $" << (deposits1 + startingbalance) << fixed << showpoint << setprecision(2) << endl;
			cout << "Please enter total amount of withdrawals: $";
			cin >> withdrawals1;
		}
		endingbalance = (deposits1 + startingbalance) - (withdrawals1);
		average = (endingbalance + startingbalance) / (2);
		monthlyinterestrate = (annualinterestrate / 100) / (12);
		interestearned1 = (monthlyinterestrate * average);
		newbalance = interestearned1 + endingbalance;
		cout << "New Balance: $" << newbalance << fixed << showpoint << setprecision(2) << endl;
	} while (balance < 1);
	cout << endl;
	do {
		balance = balance + 1;
		cout << "Month #2" << endl;
		cout << "Current Balance: $" << newbalance << fixed << showpoint << setprecision(2) << endl;
		cout << "Please enter total amount of deposits: $";
		cin >> deposits2;
		if (deposits2 < 0) {
			cout << "Deposit must be a positive number!" << endl;
			cout << "Please enter total amount of deposits: $";
			cin >> deposits2;
		}
		cout << "Please enter total amount of withdrawals: $";
		cin >> withdrawals2;
		if (withdrawals2 < 0) {
			cout << "Withdrawal must be a positive number and not be larger than";
			cout << " balance: $" << (deposits2 + newbalance) << fixed << showpoint << setprecision(2) << endl;
			cout << "Please enter total amount of withdrawals: $";
			cin >> withdrawals2;
		}
		endingbalance = (deposits2 + newbalance) - (withdrawals2);
		average = (endingbalance + newbalance) / (2);
		monthlyinterestrate = (annualinterestrate / 100) / (12);
		interestearned2 = (monthlyinterestrate * average);
		newbalance1 = interestearned2 + endingbalance;
		cout << "New Balance: $" << newbalance1 << fixed << showpoint << setprecision(2) << endl;

	} while (balance < 1);

	cout << endl;
	do {
		balance = balance + 1;
		cout << "Month #3" << endl;
		cout << "Current Balance: $" << newbalance1 << fixed << showpoint << setprecision(2) << endl;
		cout << "Please enter total amount of deposits: $";
		cin >> deposits3;
		if (deposits3 < 0) {
			cout << "Deposit must be a positive number!" << endl;
			cout << "Please enter total amount of deposits: $";
			cin >> deposits3;
		}
		cout << "Please enter total amount of withdrawals: $";
		cin >> withdrawals3;
		if (withdrawals3 < 0) {
			cout << "Withdrawal must be a positive number and not be larger than";
			cout << " balance: $" << (deposits3 + newbalance1) << fixed << showpoint << setprecision(2) << endl;
			cout << "Please enter total amount of withdrawals: $";
			cin >> withdrawals3;
		}
		endingbalance = (deposits3 + newbalance1) - (withdrawals3);
		average = (endingbalance + newbalance1) / (2);
		monthlyinterestrate = (annualinterestrate / 100) / (12);
		interestearned3 = (monthlyinterestrate * average);
		newbalance2 = interestearned3 + endingbalance;
		cout << "New Balance: $" << newbalance2 << fixed << showpoint << setprecision(2) << endl;
	} while (balance < 1);
	cout << endl;
	cout << "Start Balance:" << right << setw(10) << "$" << startingbalance << fixed << showpoint << setprecision(2) << endl;
	cout << "Total Deposits:" << right << setw(9) << "$" << (deposits1 + deposits2 + deposits3) << fixed << showpoint << setprecision(2) << endl;
	cout << "Total Withdrawals:" << right << setw(6) << "$" << (withdrawals1 + withdrawals2 + withdrawals3) << fixed << showpoint << setprecision(2) << endl;
	cout << "Total Interest Earned:" << right << setw(2) << "$" << (interestearned1 + interestearned2 + interestearned3) << fixed << showpoint << setprecision(2) << endl;
	cout << "Final Balance:" << right << setw(10) << "$" << fixed << showpoint << setprecision(2) << newbalance2;
	return 0;
}