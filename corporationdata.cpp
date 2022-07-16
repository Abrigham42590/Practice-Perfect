#include <iostream>
#include <iomanip>
using namespace std;

struct CorpData {
	string corpWestname,
		corpEastname,
		corpNorthname,
		corpSouthname;
	double corpWest,
		corpEast,
		corpNorth,
		corpSouth;
	double firstwestquarterlysales,
		secondwestquarterlysales,
		thirdwestquarterlysales,
		fourthwestquarterlysales,
		firsteastquarterlysales,
		secondeastquarterlysales,
		thirdeastquarterlysales,
		firstnorthquarterlysales,
		secondnorthquarterlysales,
		thirdnorthquarterlysales,
		fourthnorthquarterlysales,
		firstsouthquarterlysales,
		secondsouthquarterlysales,
		thirdsouthquarterlysales,
		foruthsouthquarterlysales;
	CorpData() {
		corpWestname = "West";
		corpEastname = "East";
		corpNorthname = "North";
		corpSouthname = "South";
		firstwestquarterlysales = 10000;
		secondwestquarterlysales = 20000;
		thirdwestquarterlysales = 30000;
		fourthwestquarterlysales = 40000;
		firsteastquarterlysales = 90000;
		secondeastquarterlysales = 100000;
		thirdeastquarterlysales = 110000;
		firstnorthquarterlysales = 50000;
		secondnorthquarterlysales = 60000;
		thirdnorthquarterlysales = 70000;
		fourthnorthquarterlysales = 80000;
		firstsouthquarterlysales = 120000;
		secondsouthquarterlysales = 130000;
		thirdsouthquarterlysales = 140000;
		foruthsouthquarterlysales = 150000;
	}
};

void caculatesales(CorpData&);



void calculatesales(CorpData& westsales, CorpData& eastsales, CorpData& northsales, CorpData& southsales, CorpData& firstqwestsales,
	CorpData& secondqwestsales, CorpData& thirdqwestsales, CorpData& fourthqwestsales, CorpData& firstqeastsales, CorpData& secondqeastsales,
	CorpData& thirdqeastsales, CorpData& firstqnorthsales, CorpData& secondqnorthsales, CorpData& thirdqnorthsales, CorpData& fourthqnorthsales,
	CorpData& firstqsouthsales, CorpData& secondqsouthsales, CorpData& thirdqsouthsales, CorpData& fourthqsouthsales, CorpData& westname,
	CorpData& eastname, CorpData& northname, CorpData& southname) {
	string dollarsign = "$";

	double quarterlywestaverage,
		quarterlysouthaverage,
		quarterlynorthaverage,
		quarterlyeastaverage,
		totalannualwestsales,
		totalannualeastsales,
		totalannualsouthsales,
		totalannualnorthsales;

	totalannualwestsales = westsales.corpWest;
	totalannualeastsales = eastsales.corpEast;
	totalannualnorthsales = northsales.corpNorth;
	totalannualsouthsales = southsales.corpSouth;
	totalannualwestsales = (firstqwestsales.firstwestquarterlysales + secondqwestsales.secondwestquarterlysales +
		thirdqwestsales.thirdwestquarterlysales + fourthqwestsales.fourthwestquarterlysales);
	totalannualeastsales = (firstqeastsales.firsteastquarterlysales + secondqeastsales.secondeastquarterlysales +
		thirdqeastsales.thirdeastquarterlysales);
	totalannualnorthsales = (firstqnorthsales.firstnorthquarterlysales + secondqnorthsales.secondnorthquarterlysales +
		thirdqnorthsales.thirdnorthquarterlysales + fourthqnorthsales.fourthnorthquarterlysales);
	totalannualsouthsales = (firstqsouthsales.firstsouthquarterlysales + secondqsouthsales.secondsouthquarterlysales +
		thirdqsouthsales.thirdsouthquarterlysales + fourthqsouthsales.foruthsouthquarterlysales);


	quarterlywestaverage = (totalannualwestsales / 4);
	quarterlyeastaverage = (totalannualeastsales / 4);
	quarterlynorthaverage = (totalannualnorthsales / 4);
	quarterlysouthaverage = (totalannualsouthsales / 4);

	cout << endl;
	cout << "Division name: " << right << setw(13) << westname.corpWestname << endl;
	cout << "Annual Total: " << right << setw(11) << dollarsign << totalannualwestsales << endl;
	cout << "Annual Quarterly: " << right << setw(7) << dollarsign << quarterlywestaverage;

	cout << endl;
	cout << endl;


	cout << "Division name: " << right << setw(13) << eastname.corpEastname << endl;
	cout << "Annual Total: " << right << setw(11) << dollarsign << totalannualeastsales << endl;
	cout << "Annual Quarterly: " << right << setw(7) << dollarsign << quarterlyeastaverage;

	cout << endl;
	cout << endl;

	cout << "Division name: " << right << setw(14) << northname.corpNorthname << endl;
	cout << "Annual Total: " << right << setw(11) << dollarsign << totalannualnorthsales << endl;
	cout << "Annual Quarterly: " << right << setw(7) << dollarsign << quarterlynorthaverage;

	cout << endl;
	cout << endl;

	cout << "Division name: " << right << setw(14) << southname.corpSouthname << endl;
	cout << "Annual Total: " << right << setw(11) << dollarsign << totalannualsouthsales << endl;
	cout << "Annual Quarterly: " << right << setw(7) << dollarsign << quarterlysouthaverage << endl;

}

int main() {
	CorpData sales1,
		sales2, sales3, sales4, sales5, sales6, sales7, sales8, sales9, sales10, sales11, sales12, sales13,
		sales14, sales15, sales16, sales17, sales18, sales19, sales20, sales21, sales22, sales23;
	calculatesales(sales1, sales2, sales3, sales4, sales5, sales6, sales7, sales8, sales9, sales10, sales11,
		sales12, sales13, sales14, sales15, sales16, sales17, sales18, sales19, sales20, sales21, sales22, sales23);
	return 0;
}