Monthname = []
MilesDriven = []
usernumber = 1
userchoices=  0



def usertypesP():
    for userchoice in range(12):
        usermonthname = input("Please enter a month name: ")
        usermilesdrivenformonth = input("Please enter miles driven for the month: ")
        Monthname.append(usermonthname)
        MilesDriven.append(usermilesdrivenformonth)
   

def usersearchS():
    usermonthsearch = input("Please enter the month name to serach: ")
    for userchoice in range(12):
        if usermonthsearch == Monthname[userchoice]:
            print("The month name is: " + str(Monthname[userchoice]) + " and the miles driven for the month is: " + str(MilesDriven[userchoice])) 
        elif usermonthsearch != Monthname[0] and usermonthsearch != Monthname[1] and usermonthsearch != Monthname[2] and usermonthsearch != Monthname[3] and usermonthsearch != Monthname[4] and usermonthsearch != Monthname[5] and usermonthsearch != Monthname[6] and usermonthsearch != Monthname[7] and usermonthsearch != Monthname[8] and usermonthsearch != Monthname[9] and usermonthsearch != Monthname[10] and usermonthsearch != Monthname[11]:
            print("The month name not found!")
            break


def usersmallestmilesM():
    for userchoices in range(12):
        if MilesDriven[userchoices] < MilesDriven[usernumber]:
            Monthname[usernumber] = Monthname[userchoices]
    return Monthname[usernumber]      
            

def usersmallestmilesMM():
    for userchoices in range(12):
        if MilesDriven[userchoices] < MilesDriven[usernumber]:
            MilesDriven[usernumber] = MilesDriven[userchoices]
    return MilesDriven[usernumber] 


def userlargestmilesM():
    for usernumber in range(12):
        if MilesDriven[usernumber] > MilesDriven[userchoices]:
            MilesDriven[userchoices] = MilesDriven[usernumber]
            Monthname[userchoices] = Monthname[usernumber]
    return Monthname[userchoices]

def userlargestmilesMM():
    for usernumber in range(12):
        if MilesDriven[usernumber] > MilesDriven[userchoices]:
            MilesDriven[userchoices] = MilesDriven[usernumber]
    return MilesDriven[userchoices]

count = 0
while count < 1:
    print("**** MENU OPTIONS ****")
    print("Type P to populate miles and month name.")
    print("Type S to search for Month")
    print("Type M to search for Month name with smallest Miles")
    print("Type L to search for Month Name with Largest Miles")
    print("Type E to exit")
    userchoice = input("Please enter your choice: ")
    if userchoice == "P":
        usertypesP()
        continue
    
    elif userchoice == "S":
        usersearchS()
        continue
        
    elif userchoice == "M":
        usersmallestmilesM()
        usersmallestmilesMM()
        print("The result for searching the smallest miles: ")
        print("The month name is: " + str(usersmallestmilesM()) + " and the miles driven for the month is: " + str(usersmallestmilesMM()))
        continue
    
    elif userchoice == "L":
        userlargestmilesM()
        userlargestmilesMM()
        print("The result for searching the largest miles: ")
        print("The month name is: " + str(userlargestmilesM()) + " and the miles driven for the month is: " + str(userlargestmilesMM()))
        continue
        
    elif userchoice == "E":
        print("Thank you for using the program.")
        print("Bye")
        break
   
    else:
        print("Invalid choice. Please try again!")
        continue

        
