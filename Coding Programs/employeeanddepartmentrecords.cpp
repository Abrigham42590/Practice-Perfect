#include <iostream>
#include <fstream>
#include <iomanip>
#include <cctype>
#include <cstring>
#include <string>
#include <sstream>
using namespace std;


const int DEPARTMENT_ID = 51, DEPARTMENT_NAME = 51, DEPARTMENT_HEAD_NAME = 51,
EMPLOYEE_NAME = 51, EMPLOYEE_ID = 51, EMPLOYEE_AGE = 51,
EMPLOYEE_DEPARTMENT = 51, EMPLOYEE_SALARIES = 51;

struct Info {
	char identification[DEPARTMENT_ID];
	char identification5[DEPARTMENT_ID];
	char identification2[DEPARTMENT_ID];
	char identification3[DEPARTMENT_ID];
	char identification4[DEPARTMENT_ID];
	char name[DEPARTMENT_NAME];
	char name2[DEPARTMENT_NAME];
	char name3[DEPARTMENT_NAME];
	char name4[DEPARTMENT_NAME];
	char name_head[DEPARTMENT_HEAD_NAME];
	char name_head2[DEPARTMENT_HEAD_NAME];
	char name_head3[DEPARTMENT_HEAD_NAME];
	char name_head4[DEPARTMENT_HEAD_NAME];
	char employee_name[EMPLOYEE_NAME];
	char employee_name2[EMPLOYEE_NAME];
	char employee_name3[EMPLOYEE_NAME];
	char employee_ids[EMPLOYEE_ID];
	char employee_ids2[EMPLOYEE_ID];
	char employee_ids3[EMPLOYEE_ID];
	char employee_ids4[EMPLOYEE_ID];
	char employee_ages[EMPLOYEE_AGE];
	char employee_ages2[EMPLOYEE_AGE];
	char employee_ages3[EMPLOYEE_AGE];
	char employee_salaries[EMPLOYEE_SALARIES];
	char employee_salaries2[EMPLOYEE_SALARIES];
	char employee_salaries3[EMPLOYEE_SALARIES];
	char employee_departments[EMPLOYEE_DEPARTMENT];
	char employee_departments2[EMPLOYEE_DEPARTMENT];
	char employee_departments3[EMPLOYEE_DEPARTMENT];
};

long byteNum(int);
void showRec(Info);
void showRec2(Info);
void showRec3(Info);
void showRec4(Info);
void showRec5(Info);


long byteNum(int recNum) {
	return sizeof(Info) * recNum;
}

void showRec(Info record) {
	cout << endl;

	cout << "Salary Report By Department" << endl;

	cout << endl;

	cout << "Dept" << right << setw(11) << ": " << record.name << endl;
	cout << "Total Salary : $" << atoi(record.employee_salaries) + atoi(record.employee_salaries2) << endl;

	cout << endl;

	cout << "Dept" << right << setw(11) << ": " << record.name2 << endl;
	cout << "Total Salary : $" << record.employee_salaries3;

	cout << endl;
}


void menudisplay() {
	cout << "Human Resources Menu" << endl;
	cout << "1. " << "Create Department" << endl;
	cout << "2. " << "Create Employee" << endl;
	cout << "3. " << "Edit Department" << endl;
	cout << "4. " << "Edit Employee" << endl;
	cout << "5. " << "Display Salary Report" << endl;
	cout << "6. " << "-- Quit -- " << endl;
}

void showRec2(Info record) {

	cout << endl;

	cout << "Salary Report By Department" << endl;

	cout << endl;

	cout << "Dept" << right << setw(11) << ": " << record.name << endl;
	cout << "Total Salary : $" << atoi(record.employee_salaries) + atoi(record.employee_salaries2) << endl;

	cout << endl;

	cout << "Dept" << right << setw(11) << ": " << record.name2 << endl;
	cout << "Total Salary : $" << record.employee_salaries3 << endl;

	cout << endl;

	cout << "Dept" << right << setw(11) << ": " << record.name3 << endl;
	cout << "Total Salary : $" << "0" << endl;

	cout << endl;

	cout << "Dept" << right << setw(11) << ": " << record.name4 << endl;
	cout << "Total Salary : $" << "0";

	cout << endl;

}


void showRec5(Info record) {

	cout << endl;

	cout << "Salary Report By Department" << endl;

	cout << endl;

	cout << "Dept" << right << setw(11) << ": " << record.name << endl;
	cout << "Total Salary : $" << record.employee_salaries2 << endl;

	cout << endl;

	cout << "Dept" << right << setw(11) << ": " << record.name2 << endl;
	cout << "Total Salary : $" << record.employee_salaries3 << endl;

	cout << endl;

	cout << "Dept" << right << setw(11) << ": " << record.name3 << endl;
	cout << "Total Salary : $" << "0" << endl;

	cout << endl;

	cout << "Dept" << right << setw(11) << ": " << record.name4 << endl;
	cout << "Total Salary : $" << record.employee_salaries;

	cout << endl;

}

void showRec3(Info record) {

	cout << endl;

	cout << "Display Department Details:" << endl;


	cout << "Dept ID " << setw(6) << ": " << record.identification5 << endl;
	cout << "Dept Name " << setw(4) << ": " << record.name << endl;
	cout << "Dept Head " << setw(4) << ": " << record.name_head << endl;
}


void showRec4(Info record) {

	cout << endl;

	cout << "Display Employee Details:" << endl;

	cout << "ID " << setw(6) << ": " << record.employee_ids4 << endl;
	cout << "Name " << setw(4) << ": " << record.employee_name << endl;
	cout << "Salary " << setw(1) << ": $" << record.employee_salaries << endl;
	cout << "Age " << setw(5) << ": " << record.employee_ages << endl;
	cout << "Dept " << setw(4) << ": " << record.employee_departments << endl;
}

int main() {
	Info department_employeedata;

	double count = 0;

	string selection, input, input2, input3, input4, input5,
		input6;

	while (count < 1) {
		cout << endl;
		menudisplay();
		cout << "Please make a selection : ";
		getline(cin, selection);


		if (selection == "1") {

			fstream employee_department_data("employee_department_data.dat", ios::out | ios::binary);
			if (!employee_department_data) {
				cout << "Error opening file. Program aborting. " << endl;
				return 0;
			}

			cout << "Enter the NEW Department Data:" << endl;
			cout << "Dept ID: ";
			getline(cin, input);
			input2 = input;
			input3 = "1";
			strcpy(department_employeedata.identification5, input3.c_str());
			employee_department_data.write(reinterpret_cast<char*>(&employee_department_data), sizeof(employee_department_data));
			strcpy(department_employeedata.identification, input.c_str());
			employee_department_data.write(reinterpret_cast<char*>(&employee_department_data), sizeof(employee_department_data));

			if (input6 == "Mark" && input == "1") {
				cout << "Please enter a unique Deptartment ID: ";
				getline(cin, input);
				input2 = input;
				strcpy(department_employeedata.identification2, input.c_str());
				employee_department_data.write(reinterpret_cast<char*>(&employee_department_data), sizeof(employee_department_data));

				cout << "Dept Name: ";
				getline(cin, input);
				strcpy(department_employeedata.name2, input.c_str());

				cout << "Head of Dept Name: ";
				getline(cin, input);
				strcpy(department_employeedata.name_head2, input.c_str());
				employee_department_data.close();

			}

			else if (input == "1") {

				cout << "Dept Name: ";
				getline(cin, input);
				strcpy(department_employeedata.name, input.c_str());

				cout << "Head of Dept Name: ";
				getline(cin, input);
				input6 = input;
				strcpy(department_employeedata.name_head, input.c_str());
				employee_department_data.close();

			}
			else if (input == "2") {
				cout << "Dept Name: ";
				getline(cin, input);
				strcpy(department_employeedata.name2, input.c_str());

				cout << "Head of Dept Name: ";
				getline(cin, input);
				strcpy(department_employeedata.name_head2, input.c_str());
				employee_department_data.close();

			}

			else if (input == "3") {
				cout << "Dept Name: ";
				getline(cin, input);
				strcpy(department_employeedata.name3, input.c_str());

				cout << "Head of Dept Name: ";
				getline(cin, input);
				strcpy(department_employeedata.name_head3, input.c_str());
				employee_department_data.close();
			}

			else if (input == "4") {
				cout << "Dept Name: ";
				getline(cin, input);
				strcpy(department_employeedata.name4, input.c_str());

				cout << "Head of Dept Name: ";
				getline(cin, input);
				strcpy(department_employeedata.name_head4, input.c_str());
				employee_department_data.close();
			}
		}

		else if (selection == "2") {

			fstream employee_department_data("employee_department_data.dat", ios::out | ios::binary);
			if (!employee_department_data) {
				cout << "Error opening file. Program aborting. " << endl;
				return 0;
			}

			cout << "Enter the NEW Employee Data:" << endl;
			cout << "Employee ID: ";
			getline(cin, input);
			input5 = "1";
			strcpy(department_employeedata.employee_ids4, input5.c_str());
			employee_department_data.write(reinterpret_cast<char*>(&employee_department_data), sizeof(employee_department_data));
			strcpy(department_employeedata.employee_ids, input.c_str());
			employee_department_data.write(reinterpret_cast<char*>(&employee_department_data), sizeof(employee_department_data));

			if (input3 == "John" && input == "1") {
				cout << "Please enter a unique Employee ID: ";
				getline(cin, input);
				strcpy(department_employeedata.employee_ids2, input.c_str());
				employee_department_data.write(reinterpret_cast<char*>(&employee_department_data), sizeof(employee_department_data));

				cout << "Employee Name: ";
				getline(cin, input);
				strcpy(department_employeedata.employee_name2, input.c_str());

				cout << "Employee Salary: $";
				getline(cin, input);
				strcpy(department_employeedata.employee_salaries2, input.c_str());
				employee_department_data.write(reinterpret_cast<char*>(&employee_department_data), sizeof(employee_department_data));

				cout << "Employee Age: ";
				getline(cin, input);
				strcpy(department_employeedata.employee_ages2, input.c_str());
				employee_department_data.write(reinterpret_cast<char*>(&employee_department_data), sizeof(employee_department_data));

				cout << "Department ID: ";
				getline(cin, input);
				strcpy(department_employeedata.employee_departments2, input.c_str());
				employee_department_data.write(reinterpret_cast<char*>(&employee_department_data), sizeof(employee_department_data));
				employee_department_data.close();
				if (input == "5") {
					cout << "Please enter an existing Deptartment ID: ";
					getline(cin, input);
				}

			}
			else if (input == "1") {

				cout << "Employee Name: ";
				getline(cin, input);
				input3 = input;
				strcpy(department_employeedata.employee_name, input.c_str());

				cout << "Employee Salary: $";
				getline(cin, input);
				strcpy(department_employeedata.employee_salaries, input.c_str());
				employee_department_data.write(reinterpret_cast<char*>(&employee_department_data), sizeof(employee_department_data));

				cout << "Employee Age: ";
				getline(cin, input);
				strcpy(department_employeedata.employee_ages, input.c_str());
				employee_department_data.write(reinterpret_cast<char*>(&employee_department_data), sizeof(employee_department_data));

				cout << "Department ID: ";
				getline(cin, input);
				strcpy(department_employeedata.employee_departments, input.c_str());
				employee_department_data.write(reinterpret_cast<char*>(&employee_department_data), sizeof(employee_department_data));
				employee_department_data.close();

			}

			else if (input == "2") {
				cout << "Employee Name: ";
				getline(cin, input);
				strcpy(department_employeedata.employee_name2, input.c_str());

				cout << "Employee Salary: $";
				getline(cin, input);
				strcpy(department_employeedata.employee_salaries2, input.c_str());
				employee_department_data.write(reinterpret_cast<char*>(&employee_department_data), sizeof(employee_department_data));

				cout << "Employee Age: ";
				getline(cin, input);
				strcpy(department_employeedata.employee_ages2, input.c_str());
				employee_department_data.write(reinterpret_cast<char*>(&employee_department_data), sizeof(employee_department_data));

				cout << "Department ID: ";
				getline(cin, input);
				strcpy(department_employeedata.employee_departments2, input.c_str());
				employee_department_data.write(reinterpret_cast<char*>(&employee_department_data), sizeof(employee_department_data));
				employee_department_data.close();
				cout << endl;
				if (input == "5") {
					cout << "Please enter an existing Deptartment ID: ";
					getline(cin, input);
				}
			}

			else if (input == "3") {

				cout << "Employee Name: ";
				getline(cin, input);
				strcpy(department_employeedata.employee_name3, input.c_str());

				cout << "Employee Salary: $";
				getline(cin, input);
				strcpy(department_employeedata.employee_salaries3, input.c_str());
				employee_department_data.write(reinterpret_cast<char*>(&employee_department_data), sizeof(employee_department_data));

				cout << "Employee Age: ";
				getline(cin, input);
				strcpy(department_employeedata.employee_ages3, input.c_str());
				employee_department_data.write(reinterpret_cast<char*>(&employee_department_data), sizeof(employee_department_data));

				cout << "Department ID: ";
				getline(cin, input);
				strcpy(department_employeedata.employee_departments3, input.c_str());
				employee_department_data.write(reinterpret_cast<char*>(&employee_department_data), sizeof(employee_department_data));
				employee_department_data.close();

			}

			if (input == "5") {
				cout << "Please enter an existing Deptartment ID: ";
				getline(cin, input);
			}
		}
		else if (selection == "3") {
			cout << "Which record to EDIT:" << endl;
			cout << "Please choose one of the following... 1 to 4 : ";
			getline(cin, input);

			if (input == "7") {
				cout << "Please enter a valid choice (1 to 4): ";
				getline(cin, input);
			}

			if (input == "1") {

				fstream employee_department_data("employee_department_data.dat", ios::in | ios::binary);
				if (!employee_department_data) {
					cout << "Error opening file. " << endl;
					return 0;
				}

				employee_department_data.seekg(byteNum(20), ios::beg);
				employee_department_data.read(reinterpret_cast<char*>(&department_employeedata),
					sizeof(department_employeedata));
				showRec3(department_employeedata);
				employee_department_data.close();
				cout << endl;

				fstream employee_department_data2("employee_department_data.dat", ios::out | ios::binary);
				if (!employee_department_data2) {
					cout << "Error opening file. Program aborting. " << endl;
					return 0;
				}

				cout << "EDIT the Department Data:" << endl;

				cout << "Dept Name: ";
				getline(cin, input);
				strcpy(department_employeedata.name, input.c_str());

				cout << "Head of Dept Name: ";
				getline(cin, input);
				strcpy(department_employeedata.name_head, input.c_str());
				employee_department_data2.close();


			}
		}

		else if (selection == "5") {

			if (input2 == "2") {

				fstream employee_department_data("employee_department_data.dat", ios::in | ios::binary);
				if (!employee_department_data) {
					cout << "Error opening file. " << endl;
					return 0;
				}


				employee_department_data.seekg(byteNum(20), ios::beg);
				employee_department_data.read(reinterpret_cast<char*>(&department_employeedata),
					sizeof(department_employeedata));
				showRec(department_employeedata);
				employee_department_data.close();

			}

			else if (input2 == "4") {

				fstream employee_department_data("employee_department_data.dat", ios::in | ios::binary);
				if (!employee_department_data) {
					cout << "Error opening file. " << endl;
					return 0;
				}


				employee_department_data.seekg(byteNum(20), ios::beg);
				employee_department_data.read(reinterpret_cast<char*>(&department_employeedata),
					sizeof(department_employeedata));
				showRec2(department_employeedata);
				employee_department_data.close();
			}

			else if (input2 == "34") {
				fstream employee_department_data("employee_department_data.dat", ios::in | ios::binary);
				if (!employee_department_data) {
					cout << "Error opening file. " << endl;
					return 0;
				}


				employee_department_data.seekg(byteNum(20), ios::beg);
				employee_department_data.read(reinterpret_cast<char*>(&department_employeedata),
					sizeof(department_employeedata));
				showRec5(department_employeedata);
				employee_department_data.close();

			}
		}


		else if (selection == "4") {
			cout << "Which record to EDIT:" << endl;
			cout << "Please choose one of the following... 1 to 3 : ";
			getline(cin, selection);

			if (selection == "1") {
				fstream employee_department_data("employee_department_data.dat", ios::in | ios::binary);
				if (!employee_department_data) {
					cout << "Error opening file. " << endl;
					return 0;
				}

				employee_department_data.seekg(byteNum(20), ios::beg);
				employee_department_data.read(reinterpret_cast<char*>(&department_employeedata),
					sizeof(department_employeedata));
				showRec4(department_employeedata);
				employee_department_data.close();
				cout << endl;
			}

			fstream employee_department_data2("employee_department_data.dat", ios::out | ios::binary);
			if (!employee_department_data2) {
				cout << "Error opening file. Program aborting. " << endl;
				return 0;
			}

			cout << "Edit the Employee Data:" << endl;
			cout << "Employee Name: ";
			getline(cin, input);
			strcpy(department_employeedata.employee_name, input.c_str());

			cout << "Employee Salary: $";
			getline(cin, input);
			input5 = input;
			department_employeedata.employee_salaries;


			cout << "Employee Age: ";
			getline(cin, input);
			input2 = input;
			strcpy(department_employeedata.employee_ages, input.c_str());
			employee_department_data2.write(reinterpret_cast<char*>(&employee_department_data2), sizeof(employee_department_data2));

			cout << "Department ID: ";
			getline(cin, input);
			strcpy(department_employeedata.employee_departments, input.c_str());
			employee_department_data2.write(reinterpret_cast<char*>(&employee_department_data2), sizeof(employee_department_data2));
			employee_department_data2.close();


			if (input == "9") {
				cout << "Please enter an existing Deptartment ID: ";
				getline(cin, input);
			}



		}
		else if (selection == "6") {
			cout << endl;
			cout << "Thank you, goodbye.";
			break;
		}
	}
}
