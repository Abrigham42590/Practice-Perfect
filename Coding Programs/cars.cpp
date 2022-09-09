#include <iostream>

using namespace std;

class Car {
public:
    int speed;
    string model;

    double getaccelerate1() {
        double finalspeed;
        finalspeed = static_cast<double>(speed) + 5;
        return finalspeed;
    }

    double getaccelerate2() {
        double finalspeed1;
        finalspeed1 = static_cast<double>(speed) + 10;
        return finalspeed1;
    }

    double getaccelerate3() {
        double finalspeed2;
        finalspeed2 = static_cast<double>(speed) + 15;
        return finalspeed2;
    }

    double getaccelerate4() {
        double finalspeed3;
        finalspeed3 = static_cast<double>(speed) + 20;
        return finalspeed3;
    }

    double getaccelerate5() {
        double finalspeed4;
        finalspeed4 = static_cast<double>(speed) + 25;
        return finalspeed4;
    }

    double getbrake1() {
        double finalbrake;
        speed = 25;
        finalbrake = static_cast<double>(speed) - 5;
        return finalbrake;
    }
    double getbrake2() {
        double finalbrake1;
        speed = 20;
        finalbrake1 = static_cast<double>(speed) - 5;
        return finalbrake1;
    }

    double getbrake3() {
        double finalbrake2;
        speed = 15;
        finalbrake2 = static_cast<double>(speed) - 5;
        return finalbrake2;
    }

    double getbrake4() {
        double finalbrake3;
        speed = 10;
        finalbrake3 = static_cast<double>(speed) - 5;
        return finalbrake3;
    }

    double getbrake5() {
        double finalbrake4;
        speed = 5;
        finalbrake4 = static_cast<double>(speed) - 5;
        return finalbrake4;
    }

    double getyear() {
        double year = 1967;
        return year;
    }

    string getmodel() {
        string model = " Ford Mustang";
        return model;
    }

    Car();

private:
    int year;
};


Car::Car() {
    speed = 0;
    year = 0;
}



int main()
{
    Car acceleratecar1,
        brakecar1;

    cout << acceleratecar1.getyear() << acceleratecar1.getmodel() << " - " << "current speed : " << acceleratecar1.getaccelerate1() << endl;
    cout << acceleratecar1.getyear() << acceleratecar1.getmodel() << " - " << "current speed : " << acceleratecar1.getaccelerate2() << endl;
    cout << acceleratecar1.getyear() << acceleratecar1.getmodel() << " - " << "current speed : " << acceleratecar1.getaccelerate3() << endl;
    cout << acceleratecar1.getyear() << acceleratecar1.getmodel() << " - " << "current speed : " << acceleratecar1.getaccelerate4() << endl;
    cout << acceleratecar1.getyear() << acceleratecar1.getmodel() << " - " << "current speed : " << acceleratecar1.getaccelerate5();
    cout << endl;
    cout << endl;
    cout << brakecar1.getyear() << brakecar1.getmodel() << " - " << "current speed : " << brakecar1.getbrake1() << endl;
    cout << brakecar1.getyear() << brakecar1.getmodel() << " - " << "current speed : " << brakecar1.getbrake2() << endl;
    cout << brakecar1.getyear() << brakecar1.getmodel() << " - " << "current speed : " << brakecar1.getbrake3() << endl;
    cout << brakecar1.getyear() << brakecar1.getmodel() << " - " << "current speed : " << brakecar1.getbrake4() << endl;
    cout << brakecar1.getyear() << brakecar1.getmodel() << " - " << "current speed : " << brakecar1.getbrake5() << endl;
    return 0;
}
