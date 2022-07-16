#include <iostream>
#include <iomanip>



using namespace std;

int main() {
	double adulttickets, childtickets, grossboxofficeprofit, amountpaidtodistributor, netboxofficeprofit;
	cout << "Please enter the name of the movie: ";
	string moviename;
	cin >> moviename;
	cout << "How many ADULT tickets sold: ";
	cin >> adulttickets;
	cout << "How many CHILD tickets sold: ";
	cin >> childtickets;
	grossboxofficeprofit = (adulttickets * 6.00) + (childtickets * 3.00);
	netboxofficeprofit = (.20 * grossboxofficeprofit);
	amountpaidtodistributor = grossboxofficeprofit - netboxofficeprofit;
	cout << "Movie Name: " << moviename << endl;
	cout << "Adult Tickets Sold:" << setw(4) << adulttickets << endl;
	cout << "Child Tickets Sold:" << setw(4) << childtickets << endl;
	cout << fixed << "Gross Box Ofﬁce Proﬁt: $" << setprecision(2) << grossboxofficeprofit << endl;
	cout << fixed << "Amount Paid to Distributor: $" << setprecision(2) << amountpaidtodistributor << endl;
	cout << fixed << "Net Box Ofﬁce Proﬁt: $" << setprecision(2) << netboxofficeprofit;
	return 0;
}