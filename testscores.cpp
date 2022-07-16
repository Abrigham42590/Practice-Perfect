#include <iostream>
using namespace std;


void testscoresarray(int[], int);
void scoresdisplay(const int[], int);
int averagescore(const int[], int);
void scoresdisplay2(const int[], int);
int averagescore2(const int[], int);

int main()
{
    double scores;
    const int SIZE = 5;
    int TestScores[SIZE];

    const int SCORE = 7;
    int TestScores1[SCORE];

    cout << "How many test scores do you have? ";
    cin >> scores;
    if (scores == 5) {
        cout << "Test Score #1: ";
        cin >> TestScores[0];
        if (TestScores[0] < 0) {
            cout << "Value must be one or greater: ";
            cin >> TestScores[0];
        }
        cout << "Test Score #2: ";
        cin >> TestScores[1];
        if (TestScores[1] < 0) {
            cout << "Value must be one or greater: ";
            cin >> TestScores[1];
        }
        cout << "Test Score #3: ";
        cin >> TestScores[2];
        if (TestScores[2] < 0) {
            cout << "Value must be one or greater: ";
            cin >> TestScores[2];
        }
        cout << "Test Score #4: ";
        cin >> TestScores[3];
        if (TestScores[3] < 0) {
            cout << "Value must be one or greater: ";
            cin >> TestScores[3];
        }
        cout << "Test Score #5: ";
        cin >> TestScores[4];
        if (TestScores[4] < 0) {
            cout << "Value must be one or greater: ";
            cin >> TestScores[4];
        }

        cout << "The numbers in set are:" << endl;
        testscoresarray(TestScores, SIZE);
        scoresdisplay(TestScores, SIZE);

        cout << "Average Score: " << averagescore(TestScores, SIZE);
    }

    else if (scores == 7) {
        cout << "Test Score #1: ";
        cin >> TestScores1[0];
        if (TestScores1[0] < 0) {
            cout << "Value must be one or greater: ";
            cin >> TestScores1[0];
        }
        cout << "Test Score #2: ";
        cin >> TestScores1[1];
        if (TestScores1[1] < 0) {
            cout << "Value must be one or greater: ";
            cin >> TestScores1[1];
        }
        cout << "Test Score #3: ";
        cin >> TestScores1[2];
        if (TestScores1[2] < 0) {
            cout << "Value must be one or greater: ";
            cin >> TestScores1[2];
        }
        cout << "Test Score #4: ";
        cin >> TestScores1[3];
        if (TestScores1[3] < 0) {
            cout << "Value must be one or greater: ";
            cin >> TestScores1[3];
        }
        cout << "Test Score #5: ";
        cin >> TestScores1[4];
        if (TestScores1[4] < 0) {
            cout << "Value must be one or greater: ";
            cin >> TestScores1[4];
        }
        cout << "Test Score #6: ";
        cin >> TestScores1[5];
        if (TestScores1[5] < 0) {
            cout << "Value must be one or greater: ";
            cin >> TestScores1[5];
        }
        cout << "Test Score #7: ";
        cin >> TestScores1[6];
        if (TestScores1[6] < 0) {
            cout << "Value must be one or greater: ";
            cin >> TestScores1[6];
        }

        cout << "The numbers in set are:" << endl;
        testscoresarray(TestScores1, SCORE);
        scoresdisplay2(TestScores1, SCORE);

        cout << "Average Score: " << averagescore2(TestScores1, SCORE);

    }

}

void testscoresarray(int array[], int size) {
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

void scoresdisplay(const int array2[], int size2) {
    for (int count = 0; count < 5; count++) {
        const int* scorePtr;
        scorePtr = &array2[count];
        cout << *scorePtr << " ";

    }
    cout << endl;
}


void scoresdisplay2(const int array4[], int size4) {
    for (int count = 0; count < 7; count++) {
        const int* scorePtr;
        scorePtr = &array4[count];
        cout << *scorePtr << " ";

    }
    cout << endl;
}

int averagescore(const int array3[], int size3) {
    const int* scorePtr1 = &array3[0], * scorePtr2 = &array3[1], * scorePtr3 = &array3[2], * scorePtr4 = &array3[3],
        * scorePtr5 = &array3[4];
    int average = (*scorePtr1 + *scorePtr2 + *scorePtr3 + *scorePtr4 + *scorePtr5) / 5;
    return average;
}


int averagescore2(const int array5[], int size5) {
    const int* scorePtr1 = &array5[0], * scorePtr2 = &array5[1], * scorePtr3 = &array5[2], * scorePtr4 = &array5[3],
        * scorePtr5 = &array5[4], * scorePtr7 = &array5[6], * scorePtr6 = &array5[5];
    int average = (*scorePtr1 + *scorePtr2 + *scorePtr3 + *scorePtr4 + *scorePtr5 + *scorePtr6 + *scorePtr7) / 7;
    return average;
}