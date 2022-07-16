#include <iostream>
#include <fstream>
#include <cstring>
#include <cctype>
#include <iomanip>
#include <string>
using namespace std;

const int DESCRIPTION = 20, QUANTITY = 20, WHOLESALE_PRICE = 30,
RETAIL_PRICE = 30, DATE = 51;



struct Info {

	char name[DESCRIPTION];
	char amount[QUANTITY];
	char wholesale[WHOLESALE_PRICE];
	char retail[RETAIL_PRICE];
	char calender[DATE];


};

long byteNum(int);
void showRec(Info);

long byteNum(int recNum) {
	return sizeof(Info) * recNum;
}

void showRec(Info record) {
	cout << "Description: " << record.name << endl;
	cout << "Quantity: " << record.amount << endl;
	cout << "Wholesale Price: $" << record.wholesale << ".00" << endl;
	cout << "Retail Price: $" << record.retail << ".00" << endl;
	cout << "Date: " << record.calender << endl;
}

void menudisplay() {
	cout << "Inventory Program Menu" << endl;
	cout << "  1. " << "ADD NEW Record" << endl;
	cout << "  2. " << "DISPLAY Record" << endl;
	cout << "  3. " << "MODIFY Record" << endl;
	cout << "  4. " << "EXIT Program" << endl;

}


int main()
{
	Info inventorydata;

	string input, drink;

	double selection, count = 0;

	while (count < 1) {
		menudisplay();
		cout << "please enter selection (1 - 4) : ";
		cin >> selection;


		if (selection == 5) {
			cout << "Please enter a valid choice (1 - 4): ";
			cin >> selection;
		}

		if (selection == 1) {

			fstream inventory("inventory.dat", ios::out | ios::binary);
			if (!inventory) {
				cout << "Error opening file. Program aborting. " << endl;
				return 0;
			}

			cout << "Enter the NEW Record Data:" << endl;
			cout << "Desciption: ";
			cin >> input;
			drink = input;
			strcpy(inventorydata.name, input.c_str());

			cout << "Quantity:";
			cin >> input;
			strcpy(inventorydata.amount, input.c_str());
			inventory.write(reinterpret_cast<char*>(&inventory), sizeof(inventory));

			cout << " Wholesale Price: $";
			cin >> input;
			strcpy(inventorydata.wholesale, input.c_str());
			inventory.write(reinterpret_cast<char*>(&inventory), sizeof(inventory));

			cout << "Retail Price: $";
			cin >> input;
			strcpy(inventorydata.retail, input.c_str());
			inventory.write(reinterpret_cast<char*>(&inventory), sizeof(inventory));

			cout << "Date Added: ";
			cin >> input;
			strcpy(inventorydata.calender, input.c_str());
			inventory.write(reinterpret_cast<char*>(&inventory), sizeof(inventory));
			inventory.close();

		}

		else if (selection == 2) {
			cout << "Which Record to DISPLAY:" << endl;
			cout << "Please choose one of the following... 1 to 2 : ";
			cin >> selection;

			if (selection == 2) {

				fstream inventory("inventory.dat", ios::in | ios::binary);
				if (!inventory)
				{
					cout << "Error opening file. ";
					return 0;
				}

				inventory.seekg(byteNum(25), ios::end);
				inventory.read(reinterpret_cast<char*>(&inventorydata),
					sizeof(inventorydata));
				showRec(inventorydata);
				inventory.close();
			}
		}

		else if (selection == 3) {
			cout << "Which record to MODIFY:" << endl;
			cout << "Please choose one of the following... 1 to 2 : ";
			cin >> selection;

			if (selection == 2) {
				fstream inventory("inventory.dat", ios::in | ios::binary);
				if (!inventory)
				{
					cout << "Error opening file. ";
					return 0;
				}

				inventory.seekg(byteNum(25), ios::end);
				inventory.read(reinterpret_cast<char*>(&inventorydata),
					sizeof(inventorydata));
				showRec(inventorydata);
				inventory.close();
			}

			fstream inventory("inventory.dat", ios::out | ios::binary);

			if (!inventory) {
				cout << "Error opening file. Program aborting. " << endl;
				return 0;
			}

			cout << "Enter MODIFY Data:" << endl;
			cout << "Desciption:";
			cin >> input;
			strcpy(inventorydata.name, input.c_str());

			cout << " Quantity:";
			cin >> input;
			strcpy(inventorydata.amount, input.c_str());
			inventory.write(reinterpret_cast<char*>(&inventory), sizeof(inventory));

			cout << " Wholesale Price: $";
			cin >> input;
			strcpy(inventorydata.wholesale, input.c_str());
			inventory.write(reinterpret_cast<char*>(&inventory), sizeof(inventory));

			cout << "Retail Price: $";
			cin >> input;
			strcpy(inventorydata.retail, input.c_str());
			inventory.write(reinterpret_cast<char*>(&inventory), sizeof(inventory));

			cout << "Date Added: ";
			cin >> input;
			strcpy(inventorydata.calender, input.c_str());
			inventory.write(reinterpret_cast<char*>(&inventory), sizeof(inventory));
			inventory.close();
		}
		else if (selection == 4) {
			cout << "Thank you!";
			break;
		}
	}

}