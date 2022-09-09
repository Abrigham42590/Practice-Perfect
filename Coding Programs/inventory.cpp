#include <iostream>
#include <iomanip>
using namespace std;

class Inventory {

private:
    int itemnumber;
    int quantity;
    double cost;

public:
    Inventory() {
        itemnumber = 0;
        quantity = 0;
        cost = 0;
    }
    Inventory(int i, int q, double p) {
        setItemNumber(i);
        setQuantity(q);
        setCost(p);
        setTotalCost(q, p);
        cout << "Part Number : " << setItemNumber(i) << endl;
        cout << "Units On Hand : " << fixed << setprecision(0) << setQuantity(q) << endl;
        cout << "Price : $" << fixed << setprecision(2) << setCost(p) << endl;
        cout << "Total Cost : $" << fixed << setprecision(2) << (setTotalCost(q, p));
    }

    int setItemNumber(int i) {
        itemnumber = i;
        return i;
    }
    double setQuantity(int q) {
        double newquanity;
        quantity = q;
        newquanity = static_cast<double>(q);
        return newquanity;
    }

    double setCost(double p) {
        cost = p;
        return p;
    }

    double setTotalCost(int q, double p) {
        double totalcost = static_cast<double>(setCost(p) * setQuantity(q));
        return totalcost;
    }

    int getitemNumber() {
        return itemnumber;
    }
    int getQuantity() {
        return quantity;
    }
    double getCost() {
        return cost;
    }
    double getTotalCost() {
        return (static_cast<double>(quantity) * cost);
    }
};


int main()
{
    int itemnumber, itemnumber1 = 0;
    int quantity, quantity1 = 0;
    double cost, cost1 = 0, totalcost1 = 0;

    cout << "Enter data for the new item " << endl;
    cout << "Item number: ";
    cin >> itemnumber;
    cout << "Quantity: ";
    cin >> quantity;
    if (quantity < 0) {
        cout << "Value must be greater than zero: ";
        cin >> quantity;
    }
    cout << "Price: ";
    cin >> cost;
    if (cost < 0) {
        cout << "Value must be greater than zero: ";
        cin >> cost;
    }

    cout << endl;

    Inventory part1, calculation;
    cout << "Part Number : " << itemnumber1 << endl;
    cout << "Units On Hand : " << quantity1 << endl;
    cout << "Price : $" << fixed << setprecision(2) << cost1 << endl;
    cout << "Total Cost : $" << fixed << setprecision(2) << totalcost1 << endl;
    cout << endl;
    Inventory part2(1234, 10, 2.5);
    cout << endl;
    cout << endl;

    calculation.setItemNumber(itemnumber);
    calculation.setQuantity(quantity);
    calculation.setCost(cost);

    cout << "Part Number : " << calculation.getitemNumber() << endl;
    cout << "Units On Hand : " << calculation.getQuantity() << endl;
    cout << "Price : $" << fixed << setprecision(2) << calculation.getCost() << endl;
    cout << "Total Cost : $" << fixed << setprecision(2) << calculation.getTotalCost() << endl;

}
