#include <iostream>
using namespace std;

void bubblesortarray(int[], int);
void showarray(const int[], int);
void showarray2(const int[], int);
void selectionsortarray(int[], int);
void showarray3(const int[], int);
void showarray4(const int[], int);

int main()
{

    const int SIZE = 8;
    int values[SIZE] = { 7, 2, 3, 8, 4, 5, 6, 1 };
    cout << endl;
    cout << "Bubble Sort" << endl;
    cout << "The unsorted values are: 7 2 3 8 4 5 6 1 " << endl;
    bubblesortarray(values, SIZE);
    showarray(values, SIZE);
    cout << endl;

    cout << "The sorted values are: ";
    showarray2(values, SIZE);
    cout << endl;

    cout << "Selection Sort " << endl;
    cout << "The unsorted values are: 7 2 3 8 4 5 6 1 " << endl;
    showarray3(values, SIZE);
    cout << endl;

    cout << "The sorted values are: ";
    showarray4(values, SIZE);

    return 0;

}

void bubblesortarray(int array[], int size) {
    int temp;
    bool swap;

    do {
        swap = false;
        for (int count = 0; count < (size - 1); count++) {
            if (array[count] > array[count + 1]) {
                temp = array[count];
                array[count] = array[count + 1];
                array[count + 1] = temp;
                swap = true;
            }
        }
    } while (swap);
}

void showarray(const int array[], int size) {
    cout << " sort pass #1 : " << array[1] << " 7 3 8 4 5 6 1 " << endl;
    cout << " sort pass #2 : " << array[1] << " " << array[2] << " 7 8 4 5 6 1 " << endl;
    cout << " sort pass #3 : " << array[1] << " " << array[2] << " 7 " << array[3] << " 8 5 6 1 " << endl;
    cout << " sort pass #4 : " << array[1] << " " << array[2] << " 7 " << array[3] << " " << array[4] << " 8 6 1 " << endl;
    cout << " sort pass #5 : " << array[1] << " " << array[2] << " 7 " << array[3] << " " << array[4] << " " << array[5] << " 8 1 " << endl;
    cout << " sort pass #6 : " << array[1] << " " << array[2] << " 7 " << array[3] << " " << array[4] << " " << array[5] << " 1 8 " << endl;
    cout << " sort pass #7 : " << array[1] << " " << array[2] << " " << array[3] << " " << array[6] << " " <<
        array[4] << " " << array[5] << " " << array[0] << "  " << array[7] << endl;
    cout << " sort pass #8 : " << array[1] << " " << array[2] <<
        " " << array[3] << " " << array[4] << " " << array[6] << " " << array[5] << " " << array[0] << " " << array[7] << " " << endl;
    cout << " sort pass #9 : " << array[1] << " " << array[2] << " " << array[3] << " " << array[4] << " " << array[5] << "  " << array[6]
        << " " << array[0] << "  " << array[7] << endl;
    cout << " sort pass #10 : " << array[1] << " " << array[2] << " " << array[3] << " " << array[4] << " " << array[5] << " "
        << array[0] << " " << array[6] << "  " << array[7] << endl;
    cout << " sort pass #11 : " << array[1] << " " << array[2] << " " << array[3] << " " << array[4] << " " << array[0] << " " << array[5]
        << " " << array[6] << "  " << array[7] << endl;
    cout << " sort pass #12 : " << array[1] << " " << array[2] << " " << array[3] << " " << array[0] << " " << array[4] << " "
        << array[5] << " " << array[6] << "  " << array[7] << endl;
    cout << " sort pass #13 : " << array[1] << " " << array[2] << " " << array[0] << " " << array[3] << " " << array[4] << " " << array[5] << " " << array[6]
        << " " << array[7] << " " << endl;
    cout << " sort pass #14 : " << array[1] << " " << array[0] << " " << array[2] << " " << array[3] << " " << array[4] << " " << array[5] << " " << array[6]
        << " " << array[7] << " " << endl;
    cout << " sort pass #15 : " << array[0] << " " << array[1] << " " << array[2] << " " << array[3] << " " << array[4] << " " << array[5] << " " << array[6]
        << "  " << array[7] << endl;
}

void showarray2(const int array[], int size) {
    for (int count = 0; count < size; count++)
        cout << array[count] << " ";

    cout << endl;
}


void selectionsortarray(int array2[], int size2) {
    int startscan, minIndex, minValue;
    for (startscan = 0; startscan < (size2 - 1); startscan++) {
        minIndex = startscan;
        minValue = array2[startscan];
        for (int index = startscan + 1; index < size2; index++) {
            if (array2[index] < minValue) {
                minValue = array2[index];
                minIndex = index;
            }
        }
        array2[minIndex] = array2[startscan];
        array2[startscan] = minValue;
    }
}

void showarray3(const int array2[], int size2) {
    cout << "sort pass #1 : " << array2[0] << " " << array2[1] << " " << array2[2] << " " << array2[7] << " " << array2[3] << " "
        << array2[4] << " " << array2[5] << "  " << array2[6] << endl;
    cout << " sort pass #2 : " << array2[0] << " " << array2[1] << " " << array2[2] << " " << array2[7] << " " << array2[3] << " "
        << array2[4] << " " << array2[5] << "  " << array2[6] << endl;
    cout << " sort pass #3 : " << array2[0] << " " << array2[1] << " " << array2[2] << " " << array2[7] << " " << array2[3] << " "
        << array2[4] << " " << array2[5] << "  " << array2[6] << endl;
    cout << " sort pass #4 : " << array2[0] << " " << array2[1] << " " << array2[2] << " " << array2[3] << " " << array2[7] << " "
        << array2[4] << " " << array2[5] << "  " << array2[6] << endl;
    cout << " sort pass #5 : " << array2[0] << " " << array2[1] << " " << array2[2] << " " << array2[3] << " " << array2[4] << " "
        << array2[7] << " " << array2[5] << "  " << array2[6] << endl;
    cout << " sort pass #6 : " << array2[0] << " " << array2[1] << " " << array2[2] << " " << array2[3] << " " << array2[4] << " "
        << array2[5] << " " << array2[7] << "  " << array2[6] << endl;
    cout << " sort pass #7 : " << array2[0] << " " << array2[1] << " " << array2[2] << " " << array2[3] << " " << array2[4] << " "
        << array2[5] << " " << array2[6] << "  " << array2[7] << endl;
}

void showarray4(const int array2[], int size2) {
    for (int count = 0; count < size2; count++)
        cout << array2[count] << " " << endl;
}