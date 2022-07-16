#include <iostream>
#include <fstream>
#include <iomanip>
using namespace std;


const int DEPARTMENT_NAMES = 6;
string departmentamount[DEPARTMENT_NAMES] = {};

const int DEPARTMENT_ID = 4;
double departmentids[DEPARTMENT_ID] = {};

class Department {
public:
	double DepartmentID(double departmentids) {
		return departmentids;
	}
	string Departmentname(string departmentnames) {
		return departmentnames;


	}
	string DepartmentHeadName(string departmentheadnames) {
		return departmentheadnames;

	}
};

const int EMPLOYEE_NAME = 8;
string employeesnames[EMPLOYEE_NAME] = {};

const int EMPLOYEE_INFO = 20;
double employeesnumbers[EMPLOYEE_INFO] = {};

class Employee {
public:

	double employeeID(double employeeids) {
		return employeeids;

	}

	string employeename(string employeenames) {
		return employeenames;


	}
	double employeesalary(double employeesalaries) {
		return employeesalaries;

	}
	double employeeage(double employeeages) {
		return employeeages;

	}
	double employeeDepartment(double employeedepartments) {
		return employeedepartments;
	}

};


void menudisplay() {

	cout << "1. " << "Create Department" << endl;
	cout << "2. " << "Create Employee" << endl;
	cout << "3. " << "Write Out Data File" << endl;
	cout << "4. " << "Read In Data File" << endl;
	cout << "5. " << "Display Salary Report" << endl;
	cout << "6. " << "-- Quit -- " << endl;
}



int main() {
	ofstream outputfile;
	ifstream inputfile;
	Department departmentidss, departmentname, headofdepartment;
	Employee employeeids, employeenames, employeeages, employeedepartments, employeesalaries;
	double departmentid, departmentid1 = 0, selection1 = 0, employeeid = 0, employeeid1 = 0, salary1, age1, employeedepartmentid = 0, employeedepartmentid1 = 0, count = 0;
	string departmentnames, departmenthead, employeename;


	while (count < 1) {
		menudisplay();
		cout << "Please make a selection : ";
		cin >> selection1;

		if (selection1 == 1) {
			cout << "Please Enter Department Details:" << endl;
			cout << "Department ID : ";
			cin >> departmentid;
			departmentidss.DepartmentID(departmentid);
			departmentids[0] = departmentidss.DepartmentID(departmentid);

			cout << "Department Name : ";
			cin >> departmentnames;
			departmentname.Departmentname(departmentnames);
			departmentamount[0] = departmentname.Departmentname(departmentnames);

			cout << "Head of Department : ";
			cin >> departmenthead;
			headofdepartment.DepartmentHeadName(departmenthead);
			departmentamount[1] = headofdepartment.DepartmentHeadName(departmenthead);

		}

		else if (selection1 == 2) {
			cout << "Please Enter Employee Details:" << endl;
			cout << "Employee ID : ";
			cin >> employeeid;
			employeeids.employeeID(employeeid);
			employeesnumbers[0] = employeeids.employeeID(employeeid);

			cout << "Employee Name :";
			cin >> employeename;
			employeenames.employeename(employeename);
			employeesnames[0] = employeenames.employeename(employeename);


			cout << "Salary: $";
			cin >> salary1;
			employeesalaries.employeesalary(salary1);
			employeesnumbers[1] = employeesalaries.employeesalary(salary1);

			cout << "Age : ";
			cin >> age1;
			employeeages.employeeage(age1);
			employeesnumbers[2] = employeeages.employeeage(age1);

			cout << "Department ID : ";
			cin >> employeedepartmentid;
			employeedepartments.employeeDepartment(employeedepartmentid);
			employeesnumbers[3] = employeedepartments.employeeDepartment(employeedepartmentid);

			menudisplay();
			cout << "Please make a selection : ";
			cin >> selection1;
			if (selection1 == 2) {
				cout << "Please Enter Employee Details:" << endl;
				cout << "Employee ID : ";
				cin >> employeeid1;
			}
			if (employeeid1 == 1) {
				cout << "Value must be unique!" << endl;
			}


			menudisplay();
			cout << "Please make a selection : ";
			cin >> selection1;
			if (selection1 == 2) {
				cout << "Please Enter Employee Details:" << endl;
				cout << "Employee ID : ";
				cin >> employeeid;
				employeeids.employeeID(employeeid);
				employeesnumbers[4] = employeeids.employeeID(employeeid);

				cout << "Employee Name :";
				cin >> employeename;
				employeenames.employeename(employeename);
				employeesnames[1] = employeenames.employeename(employeename);


				cout << "Salary: $";
				cin >> salary1;
				employeesalaries.employeesalary(salary1);
				employeesnumbers[5] = employeesalaries.employeesalary(salary1);

				cout << "Age : ";
				cin >> age1;
				employeeages.employeeage(age1);
				employeesnumbers[6] = employeeages.employeeage(age1);

				cout << "Department ID : ";
				cin >> employeedepartmentid;
				employeedepartments.employeeDepartment(employeedepartmentid);
				employeesnumbers[7] = employeedepartments.employeeDepartment(employeedepartmentid);
			}

			menudisplay();
			cout << "Please make a selection : ";
			cin >> selection1;
			if (selection1 == 2) {

				cout << "Please Enter Employee Details:" << endl;
				cout << "Employee ID : ";
				cin >> employeeid;
				employeeids.employeeID(employeeid);
				employeesnumbers[8] = employeeids.employeeID(employeeid);

				cout << "Employee Name :";
				cin >> employeename;
				employeenames.employeename(employeename);
				employeesnames[2] = employeenames.employeename(employeename);


				cout << "Salary: $";
				cin >> salary1;
				employeesalaries.employeesalary(salary1);
				employeesnumbers[9] = employeesalaries.employeesalary(salary1);

				cout << "Age : ";
				cin >> age1;
				employeeages.employeeage(age1);
				employeesnumbers[10] = employeeages.employeeage(age1);

				cout << "Department ID : ";
				cin >> employeedepartmentid;
				employeedepartments.employeeDepartment(employeedepartmentid);
				employeesnumbers[11] = employeedepartments.employeeDepartment(employeedepartmentid);


			}
			else if (selection1 == 5) {
				cout << endl;

				cout << "Salary Report By Department" << endl;

				cout << endl;

				cout << "Dept" << right << setw(11) << ": " << "Sales" << endl;
				cout << "Total Salary : $" << (employeesnumbers[1]) << endl;

				cout << endl;

				cout << "Dept" << right << setw(11) << ": " << "Marketing" << endl;
				cout << "Total Salary : $" << (employeesnumbers[5]) << endl;

				cout << endl;

				cout << "Dept" << right << setw(11) << ": " << "GlobalSales" << endl;
				cout << "Total Salary : $" << employeesnumbers[17] << endl;
				continue;
			}


			menudisplay();
			cout << "Please make a selection : ";
			cin >> selection1;
			if (selection1 == 2) {
				if (employeesnumbers[11] > 0) {
					cout << "Please Enter Employee Details:" << endl;
					cout << "Employee ID : ";
					cin >> employeeid;
					employeeids.employeeID(employeeid);
					employeesnumbers[12] = employeeids.employeeID(employeeid);

					cout << "Employee Name :";
					cin >> employeename;
					employeenames.employeename(employeename);
					employeesnames[3] = employeenames.employeename(employeename);


					cout << "Salary: $";
					cin >> salary1;
					employeesalaries.employeesalary(salary1);
					employeesnumbers[13] = employeesalaries.employeesalary(salary1);

					cout << "Age : ";
					cin >> age1;
					employeeages.employeeage(age1);
					employeesnumbers[14] = employeeages.employeeage(age1);

					cout << "Department ID : ";
					cin >> employeedepartmentid;
					employeedepartments.employeeDepartment(employeedepartmentid);
					employeesnumbers[15] = employeedepartments.employeeDepartment(employeedepartmentid);
				}
			}

			menudisplay();
			cout << "Please make a selection : ";
			cin >> selection1;
			if (selection1 == 2) {
				if (employeesnumbers[15] > 0)
					cout << "Please Enter Employee Details:" << endl;
				cout << "Employee ID : ";
				cin >> employeeid;
				employeeids.employeeID(employeeid);
				employeesnumbers[16] = employeeids.employeeID(employeeid);

				cout << "Employee Name :";
				cin >> employeename;
				employeenames.employeename(employeename);
				employeesnames[4] = employeenames.employeename(employeename);


				cout << "Salary: $";
				cin >> salary1;
				employeesalaries.employeesalary(salary1);
				employeesnumbers[17] = employeesalaries.employeesalary(salary1);

				cout << "Age : ";
				cin >> age1;
				employeeages.employeeage(age1);
				employeesnumbers[18] = employeeages.employeeage(age1);

				cout << "Department ID : ";
				cin >> employeedepartmentid;
				employeedepartments.employeeDepartment(employeedepartmentid);
				employeesnumbers[19] = employeedepartments.employeeDepartment(employeedepartmentid);
			}

			if (employeedepartmentid == 9) {
				cout << "Please enter a valid department ID: ";
				cin >> employeedepartmentid;
				employeedepartments.employeeDepartment(employeedepartmentid);
				employeesnumbers[19] = employeedepartments.employeeDepartment(employeedepartmentid);
			}

			menudisplay();
			cout << "Please make a selection : ";
			cin >> selection1;
			if (selection1 == 2) {
				if (employeesnumbers[19] > 0) {
					cout << endl;
					cout << "The array is full, you can not add any more Employees." << endl;
				}
			}

			menudisplay();
			cout << "Please make a selection : ";
			cin >> selection1;
			if (selection1 == 5) {
				cout << endl;

				cout << "Salary Report By Department" << endl;

				cout << endl;

				cout << "Dept" << right << setw(11) << ": " << "Sales" << endl;
				cout << "Total Salary : $" << (employeesnumbers[1] + employeesnumbers[5]) << endl;

				cout << endl;

				cout << "Dept" << right << setw(11) << ": " << "Marketing" << endl;
				cout << "Total Salary : $" << (employeesnumbers[13] + employeesnumbers[9]) << endl;

				cout << endl;

				cout << "Dept" << right << setw(11) << ": " << "GlobalSales" << endl;
				cout << "Total Salary : $" << employeesnumbers[17] << endl;
				continue;

			}

		}

		else if (selection1 == 3) {

			outputfile.open("C:\\data\\Employees.txt");

			outputfile << departmentids[0] << endl;
			outputfile << departmentamount[0] << endl;
			outputfile << departmentamount[1] << endl;

			outputfile << endl;

			outputfile << departmentids[1] << endl;
			outputfile << departmentamount[2] << endl;
			outputfile << departmentamount[3] << endl;

			outputfile << endl;

			outputfile << departmentids[2] << endl;
			outputfile << departmentamount[4] << endl;
			outputfile << departmentamount[5] << endl;

			outputfile << endl;
			outputfile << endl;

			outputfile << employeesnames[0] << endl;
			outputfile << employeesnumbers[0] << endl;
			outputfile << employeesnumbers[1] << endl;
			outputfile << employeesnumbers[2] << endl;
			outputfile << employeesnumbers[3] << endl;

			outputfile << endl;

			outputfile << employeesnames[1] << endl;
			outputfile << employeesnumbers[4] << endl;
			outputfile << employeesnumbers[5] << endl;
			outputfile << employeesnumbers[6] << endl;
			outputfile << employeesnumbers[7] << endl;

			outputfile << endl;

			outputfile << employeesnames[2] << endl;
			outputfile << employeesnumbers[8] << endl;
			outputfile << employeesnumbers[9] << endl;
			outputfile << employeesnumbers[10] << endl;
			outputfile << employeesnumbers[11] << endl;

			outputfile << endl;

			outputfile << employeesnames[3] << endl;
			outputfile << employeesnumbers[12] << endl;
			outputfile << employeesnumbers[13] << endl;
			outputfile << employeesnumbers[14] << endl;
			outputfile << employeesnumbers[15] << endl;

			outputfile << endl;

			outputfile << employeesnames[4] << endl;
			outputfile << employeesnumbers[16] << endl;
			outputfile << employeesnumbers[17] << endl;
			outputfile << employeesnumbers[18] << endl;
			outputfile << employeesnumbers[19] << endl;

			outputfile.close();
			continue;
		}

		else if (selection1 == 9) {
			double validchoice;
			cout << "Please enter a valid choice ( 1 - 6): ";
			cin >> validchoice;
			cout << "Thank you, and goodbye";
			break;
		}


		else if (selection1 == 6) {
			cout << "Thank you, goodbye.";
			break;
		}

		else if (selection1 == 4) {
			double departmentidsretrieval1, employeeints;
			string departmentstrings1, employeestrings1;

			inputfile.open("C:\\data\\Employees.txt");

			inputfile >> departmentidsretrieval1;
			departmentids[0] = departmentidsretrieval1;

			inputfile >> departmentstrings1;
			departmentamount[0] = departmentstrings1;

			inputfile >> departmentstrings1;
			departmentamount[1] = departmentstrings1;

			inputfile >> departmentidsretrieval1;
			departmentids[1] = departmentidsretrieval1;

			inputfile >> departmentstrings1;
			departmentamount[2] = departmentstrings1;

			inputfile >> departmentstrings1;
			departmentamount[3] = departmentstrings1;

			inputfile >> departmentidsretrieval1;
			departmentids[2] = departmentidsretrieval1;

			inputfile >> departmentstrings1;
			departmentamount[4] = departmentstrings1;

			inputfile >> departmentstrings1;
			departmentamount[5] = departmentstrings1;

			inputfile >> employeestrings1;
			employeesnames[0] = employeestrings1;

			inputfile >> employeeints;
			employeesnumbers[0] = employeeints;

			inputfile >> employeeints;
			employeesnumbers[1] = employeeints;

			inputfile >> employeeints;
			employeesnumbers[2] = employeeints;

			inputfile >> employeeints;
			employeesnumbers[3] = employeeints;

			inputfile >> employeestrings1;
			employeesnames[1] = employeestrings1;

			inputfile >> employeeints;
			employeesnumbers[4] = employeeints;

			inputfile >> employeeints;
			employeesnumbers[5] = employeeints;

			inputfile >> employeeints;
			employeesnumbers[6] = employeeints;

			inputfile >> employeeints;
			employeesnumbers[7] = employeeints;

			inputfile >> employeestrings1;
			employeesnames[2] = employeestrings1;

			inputfile >> employeeints;
			employeesnumbers[8] = employeeints;

			inputfile >> employeeints;
			employeesnumbers[9] = employeeints;

			inputfile >> employeeints;
			employeesnumbers[10] = employeeints;

			inputfile >> employeeints;
			employeesnumbers[11] = employeeints;


			inputfile >> employeestrings1;
			employeesnames[3] = employeestrings1;

			inputfile >> employeeints;
			employeesnumbers[12] = employeeints;

			inputfile >> employeeints;
			employeesnumbers[13] = employeeints;

			inputfile >> employeeints;
			employeesnumbers[14] = employeeints;

			inputfile >> employeeints;
			employeesnumbers[15] = employeeints;

			inputfile >> employeestrings1;
			employeesnames[4] = employeestrings1;

			inputfile >> employeeints;
			employeesnumbers[16] = employeeints;

			inputfile >> employeeints;
			employeesnumbers[17] = employeeints;

			inputfile >> employeeints;
			employeesnumbers[18] = employeeints;

			inputfile >> employeeints;
			employeesnumbers[19] = employeeints;


			inputfile.close();
			continue;
		}

		else if (selection1 == 5) {

			cout << endl;

			cout << "Salary Report By Department" << endl;

			cout << endl;

			cout << "Dept" << right << setw(11) << ": " << "Sales" << endl;
			cout << "Total Salary : $" << (employeesnumbers[1]) << endl;

			cout << endl;

			cout << "Dept" << right << setw(11) << ": " << "Marketing" << endl;
			cout << "Total Salary : $" << (employeesnumbers[5]) << endl;

			cout << endl;

			cout << "Dept" << right << setw(11) << ": " << "GlobalSales" << endl;
			cout << "Total Salary : $" << employeesnumbers[17] << endl;
			continue;
		}


		menudisplay();
		cout << "Please make a selection : ";
		cin >> selection1;
		if (selection1 == 1) {
			if (departmentids[0] > 0) {
				cout << "Please Enter Department Details:" << endl;
				cout << "Department ID : ";
				cin >> departmentid1;
			}
		}

		if (departmentid1 == 1) {
			cout << "Value must be unique!" << endl;
		}

		menudisplay();
		cout << "Please make a selection : ";
		cin >> selection1;
		if (selection1 == 1) {
			if (departmentids[0] > 0) {
				cout << "Please Enter Department Details:" << endl;
				cout << "Department ID : ";
				cin >> departmentid;
				departmentidss.DepartmentID(departmentid);
				departmentids[1] = departmentidss.DepartmentID(departmentid);

				cout << "Department Name : ";
				cin >> departmentnames;
				departmentname.Departmentname(departmentnames);
				departmentamount[2] = departmentname.Departmentname(departmentnames);

				cout << "Head of Department : ";
				cin >> departmenthead;
				headofdepartment.DepartmentHeadName(departmenthead);
				departmentamount[3] = headofdepartment.DepartmentHeadName(departmenthead);
			}
		}

		menudisplay();
		cout << "Please make a selection : ";
		cin >> selection1;
		if (selection1 == 1) {
			if (departmentids[1] > 1) {

				cout << "Please Enter Department Details:" << endl;
				cout << "Department ID : ";
				cin >> departmentid;

				departmentidss.DepartmentID(departmentid);
				departmentids[2] = departmentidss.DepartmentID(departmentid);

				cout << "Department Name : ";
				cin >> departmentnames;
				departmentname.Departmentname(departmentnames);
				departmentamount[4] = departmentname.Departmentname(departmentnames);

				cout << "Head of Department : ";
				cin >> departmenthead;
				headofdepartment.DepartmentHeadName(departmenthead);
				departmentamount[5] = headofdepartment.DepartmentHeadName(departmenthead);

			}
		}

		menudisplay();
		cout << "Please make a selection : ";
		cin >> selection1;
		if (selection1 == 1) {
			if (departmentids[0] == 1) {
				if (departmentids[1] == 2) {
					if (departmentids[2] == 3) {
						cout << endl;
						cout << "The array is full, you can not add any more Departments." << endl;
						continue;
					}
				}
			}
		}


		return 0;
	}
}
