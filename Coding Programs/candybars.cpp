#include <iostream>
using namespace std;

int main() {
	int candybars, total;
	cout << "Please enter the number of candy bars sold :";
	cin >> candybars;
	int organization;
	cout << " what is the amount the organization earns for each candy bar sold? :";
	cin >> organization;
	total = (candybars * organization);
	cout << "The total amount earned " << total;
	return 0;

}
