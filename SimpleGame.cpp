#include <iostream>
#include <iomanip>
using namespace std;


void getJudgeData(double&, double&, double&, double&, double&);
double findLowest(double&, double&, double&, double&, double&);
void calscore(double&, double&, double&, double&, double&);
double findLargest(double&, double&, double&, double&, double&);



int main()
{
    double judge1, judge2, judge3, judge4, judge5;
    getJudgeData(judge1, judge2, judge3, judge4, judge5);
    findLowest(judge1, judge2, judge3, judge4, judge5);
    calscore(judge1, judge2, judge3, judge4, judge5);
    findLargest(judge1, judge2, judge3, judge4, judge5);


    return 0;
}


void getJudgeData(double& data1, double& data2, double& data3, double& data4, double& data5) {
    int count = 0;
    cout << "Judge #1 - Please enter a score between 0.0 and 10.0 : ";
    cin >> data1;
    while (count < 1) {
        if (data1 > 10 || data1 < 0) {
            cout << "Score must be between 0.0 and 10.0 : ";
            cin >> data1;
            continue;
        }
        if (data1 <= 10 && data1 >= 0) {
            break;
        }
    }
    cout << endl;
    cout << "Judge #2 - Please enter a score between 0.0 and 10.0 : ";
    cin >> data2;
    while (count < 1) {
        if (data2 > 10 || data2 < 0) {
            cout << "Score must be between 0.0 and 10.0 : ";
            cin >> data2;
            continue;
        }
        if (data2 <= 10 && data2 >= 0) {
            break;
        }
    }
    cout << endl;
    cout << "Judge #3 - Please enter a score between 0.0 and 10.0 : ";
    cin >> data3;
    while (count < 1) {
        if (data3 > 10 || data3 < 0) {
            cout << "Score must be between 0.0 and 10.0 : ";
            cin >> data3;
            continue;
        }
        if (data3 <= 10 && data3 >= 0) {
            break;
        }
    }
    cout << endl;
    cout << "Judge #4 - Please enter a score between 0.0 and 10.0 : ";
    cin >> data4;
    while (count < 1) {
        if (data4 >= 10 || data4 <= 0) {
            cout << "Score must be between 0.0 and 10.0 : ";
            cin >> data4;
            continue;
        }
        if (data4 <= 10 && data4 >= 0) {
            break;
        }
    }
    cout << endl;
    cout << "Judge #5 - Please enter a score between 0.0 and 10.0 : ";
    cin >> data5;
    while (count < 1) {
        if (data5 >= 10 || data5 <= 0) {
            cout << "Score must be between 0.0 and 10.0 : ";
            cin >> data5;
            continue;
        }
        if (data5 <= 10 && data5 >= 0) {
            break;
        }
    }
}


double findLowest(double& numberdata1, double& numberdata2, double& numberdata3, double& numberdata4, double& numberdata5) {
    double lowest = 0;
    if (numberdata1 <= numberdata2 && numberdata1 <= numberdata3 && numberdata1 <= numberdata4 && numberdata1 <= numberdata5) {
        lowest = lowest + numberdata1;
    }
    else if (numberdata2 <= numberdata1 && numberdata2 <= numberdata3 && numberdata2 <= numberdata4 && numberdata2 <= numberdata5) {
        lowest = lowest + numberdata2;
    }
    else if (numberdata3 <= numberdata1 && numberdata3 <= numberdata2 && numberdata3 <= numberdata4 && numberdata3 <= numberdata5) {
        lowest = lowest + numberdata3;
    }
    else if (numberdata4 <= numberdata1 && numberdata4 <= numberdata2 && numberdata4 <= numberdata3 && numberdata4 <= numberdata5) {
        lowest = lowest + numberdata4;
    }
    else if (numberdata5 <= numberdata1 && numberdata5 <= numberdata2 && numberdata5 <= numberdata3 && numberdata5 <= numberdata4) {
        lowest = lowest + numberdata5;
    }
    return lowest;
}


void calscore(double& specialdata1, double& specialdata2, double& specialdata3, double& specialdata4, double& specialdata5) {
    double lowestjudgedata1 = specialdata1, lowestjudgedata2 = specialdata2, lowestjudgedata3 = specialdata3, lowestjudgedata4 = specialdata4, lowestjudgedata5 = specialdata5,
        largestdata1 = specialdata1, largestdata2 = specialdata2, largestdata3 = specialdata3, largestdata4 = specialdata4, largestdata5 = specialdata5, totaldata = 0, average;
    if (findLowest(lowestjudgedata1, lowestjudgedata2, lowestjudgedata3, lowestjudgedata4, lowestjudgedata5) != specialdata1 &&
        (findLargest(largestdata1, largestdata2, largestdata3, largestdata4, largestdata5) != specialdata1)) {
        totaldata += specialdata1;

    }
    if (findLowest(lowestjudgedata1, lowestjudgedata2, lowestjudgedata3, lowestjudgedata4, lowestjudgedata5) == specialdata1) {
        totaldata += specialdata1;
    }
    if (findLowest(lowestjudgedata1, lowestjudgedata2, lowestjudgedata3, lowestjudgedata4, lowestjudgedata5) != specialdata2 &&
        (findLargest(largestdata1, largestdata2, largestdata3, largestdata4, largestdata5) != specialdata2)) {
        totaldata += specialdata2;
    }

    if (findLowest(lowestjudgedata1, lowestjudgedata2, lowestjudgedata3, lowestjudgedata4, lowestjudgedata5) != specialdata3 &&
        (findLargest(largestdata1, largestdata2, largestdata3, largestdata4, largestdata5) != specialdata3)) {
        totaldata += specialdata3;
    }
    if (findLowest(lowestjudgedata1, lowestjudgedata2, lowestjudgedata3, lowestjudgedata4, lowestjudgedata5) != specialdata4 &&
        (findLargest(largestdata1, largestdata2, largestdata3, largestdata4, largestdata5) != specialdata4)) {
        totaldata += specialdata4;
    }
    if (findLowest(lowestjudgedata1, lowestjudgedata2, lowestjudgedata3, lowestjudgedata4, lowestjudgedata5) != specialdata5 &&
        (findLargest(largestdata1, largestdata2, largestdata3, largestdata4, largestdata5) != specialdata5)) {
        totaldata += specialdata5;
    }

    average = (totaldata) / (3);
    cout << endl;
    cout << "Final Score : " << average;
}

double findLargest(double& numbersdata1, double& numbersdata2, double& numbersdata3, double& numbersdata4, double& numbersdata5) {
    double largest = 0;
    if (numbersdata1 >= numbersdata2 && numbersdata1 >= numbersdata3 && numbersdata1 >= numbersdata4 && numbersdata1 >= numbersdata5) {
        largest += numbersdata1;
    }
    else if (numbersdata2 >= numbersdata1 && numbersdata2 >= numbersdata3 && numbersdata2 >= numbersdata4 && numbersdata2 >= numbersdata5) {
        largest += numbersdata2;
    }
    else if (numbersdata3 >= numbersdata1 && numbersdata3 >= numbersdata2 && numbersdata3 >= numbersdata4 && numbersdata3 >= numbersdata5) {
        largest += numbersdata3;
    }
    else if (numbersdata4 >= numbersdata1 && numbersdata4 >= numbersdata2 && numbersdata4 >= numbersdata3 && numbersdata4 >= numbersdata5) {
        largest += numbersdata4;
    }
    else if (numbersdata5 >= numbersdata1 && numbersdata5 >= numbersdata2 && numbersdata5 >= numbersdata3 && numbersdata5 >= numbersdata4) {
        largest += numbersdata5;
    }
    return largest;
}