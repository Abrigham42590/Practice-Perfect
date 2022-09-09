#include <iostream>
#include <fstream>
#include <iomanip>
using namespace std;

int main() {
    ifstream inputFile;
    inputFile.open("Rainfall.txt");
    double rainfall, countrainfall = 0, totalrainfall = 0;
    string month1, month2;
    inputFile >> month1;
    inputFile >> month2;
    while (inputFile >> rainfall) {
        totalrainfall += rainfall;
        countrainfall++;
    }
    inputFile.close();

    cout << "During the months of " << month1 << "-" << month2 << " the total" << endl;
    cout << "rainfall was " << totalrainfall << " inches" << " and the average monthly" << endl;
    cout << "rainfall was " << fixed << setprecision(2) << (totalrainfall) / (countrainfall) << " inches." << endl;

    return 0;
}
