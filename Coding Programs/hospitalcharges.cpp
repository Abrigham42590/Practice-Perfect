#include <iostream>
#include <iomanip>
using namespace std;

void InPatient(double&, double&, double&, double&);
void totalhospitalcharges(double&, double&, double&, double&);
void OutPatient(double&, double&);
void totalhospitalcharges(double&, double&);



int main() {
	double count = 0, incharge1, incharge2, incharge3, incharge4;
	double outcharge1, outcharge2;
	string totalhospitalbill;
	cout << "Do you want to calculate the total hospital bill for " << endl;
	cout << "(I) an In-Patient, or " << endl;
	cout << "(O) an Out-Patient?";
	cin >> totalhospitalbill;
	while (count < 1) {
		if (totalhospitalbill != "I" && totalhospitalbill != "O") {
			cout << "Enter I or O: ";
			cin >> totalhospitalbill;
			continue;
		}
		if (totalhospitalbill == "I") {
			cout << endl;
			InPatient(incharge1, incharge2, incharge3, incharge4);
			totalhospitalcharges(incharge1, incharge2, incharge3, incharge4);
			break;
		}
		if (totalhospitalbill == "O") {
			cout << endl;
			OutPatient(outcharge1, outcharge2);
			totalhospitalcharges(outcharge1, outcharge2);
			break;
		}

	}

	return 0;
}

void InPatient(double& days, double& dailyrate, double& hospitalservices, double& medicalcharges) {
	int count = 0;
	cout << "How many days were spent in the hospital? ";
	cin >> days;
	while (count < 1) {
		if (days < 0) {
			cout << "Number must be a positive number : ";
			cin >> days;
			continue;
		}
		if (days > 0) {
			break;
		}
	}
	cout << "What is the hospital daily rate? $";
	cin >> dailyrate;
	while (count < 1) {
		if (dailyrate < 0) {
			cout << "Number must be a positive number : ";
			cin >> dailyrate;
			continue;
		}
		if (dailyrate > 0) {
			break;
		}
	}
	cout << "What were the charges for hospital services (lab tests, etc.)? $";
	cin >> hospitalservices;
	while (count < 1) {
		if (hospitalservices < 0) {
			cout << "Number must be a positive number : ";
			cin >> hospitalservices;
			continue;
		}
		if (hospitalservices > 0) {
			break;
		}
	}
	cout << "What were the hospital medication charges? $";
	cin >> medicalcharges;
	while (count < 1) {
		if (medicalcharges < 0) {
			cout << "Number must be a positive number : ";
			cin >> medicalcharges;
			continue;
		}
		if (medicalcharges > 0) {
			break;
		}
	}
}

void OutPatient(double& outhospitalservices, double& outmedicalcharges) {
	int count = 0;
	cout << "What were the charges for hospital services (lab, tests, etc.)? $";
	cin >> outhospitalservices;
	while (count < 1) {
		if (outhospitalservices < 0) {
			cout << "Number must be a positive number : ";
			cin >> outhospitalservices;
			continue;
		}
		if (outhospitalservices > 0) {
			break;
		}
	}
	cout << "What were the hospital medication charges? $";
	cin >> outmedicalcharges;
	while (count < 1) {
		if (outmedicalcharges < 0) {
			cout << "Number must be a positive number : ";
			cin >> outmedicalcharges;
			continue;
		}
		if (outmedicalcharges > 0) {
			break;
		}
	}
}

void totalhospitalcharges(double& charge1, double& charge2, double& charge3, double& charge4) {
	double rate, totalcharge;
	rate = charge2 * charge1;
	totalcharge = (rate)+(charge3)+(charge4);
	cout << endl;
	cout << "Total Hospital Charges: $" << fixed << setprecision(2) << totalcharge;
}

void totalhospitalcharges(double& outcharges1, double& outcharges2) {
	double totalcharge;
	totalcharge = (outcharges1)+(outcharges2);
	cout << endl;
	cout << "Total Hospital Charges: $" << fixed << setprecision(2) << totalcharge;

}
