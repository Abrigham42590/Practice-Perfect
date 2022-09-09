Names = []
ID = []
Score1 = []
Score2 = []
Score3 = []


def usertypesP():
    for userchoice in range(4):
        usernames = input("Please enter a student's name: ")
        userid = input("Please enter the student's ID: ")
        userscore1 = input("Please enter first score: ")
        userscore2 = input("Please enter second score: ")
        userscore3 = input("Please enter third score: ")
        Names.append(usernames)
        ID.append(userid)
        Score1.append(userscore1)
        Score2.append(userscore2)
        Score3.append(userscore3)
        
def usersearchD():
    userstudentID = input("Please enter the ID of the student: ")
    for userchoice in range(4):
        if userstudentID == ID[userchoice]:
            print("The student name is: " + str(Names[userchoice]))
            print("ID is: " + str(ID[userchoice]))
            print("First score is: " + str(Score1[userchoice]))
            print("Second score is: " + str(Score2[userchoice]))
            print("Third score is: " + str(Score3[userchoice]))
        elif userstudentID != ID[0] and userstudentID != ID[1] and userstudentID != ID[2] and userstudentID != ID[3]:
            print("The ID is not found!")
            break
            

def userupdateU():
    userstudentIDs = input("Please enter the ID of the student: ")
    for userchoice in range(4):
        if userstudentIDs == ID[userchoice]:
            print("The student name is : " + str(Names[userchoice]))
            print("ID is: " + str(ID[userchoice]))
            print("First score is: " + str(Score1[userchoice]))
            print("Second score is: " + str(Score2[userchoice]))
            print("Third score is: " + str(Score3[userchoice]))
            userupdate1 = input("Please enter the first score: ")
            userupdate2 = input("Please enter the second score: ")
            userupdate3 = input("Please enter the third score: ")
            Score1[userchoice] = userupdate1
            Score2[userchoice] = userupdate2
            Score3[userchoice] = userupdate3
        elif userstudentIDs != ID[0] and userstudentIDs != ID[1] and userstudentIDs != ID[2] and userstudentIDs != ID[3]:
            print("The ID is not found!")
            break
        

def useravgcalculationC():
    usercalculation = input("Please enter the ID of the student: ")
    for userchoice in range(4):
        if usercalculation == ID[userchoice]:
            average = (Score1[userchoice] + Score2[userchoice] + Score3[userchoice]) / 3
            if average >= 90 and average <= 100:
                print("The average is: " + str(float(average)))
                print("The grade is: A")
            elif average >= 80 and average <= 89:
                print("The average is: " + str(float(average)))
                print("The grade is: B")
            elif average >= 70 and average <= 79:
                print("The average is: " + str(float(average)))
                print("The grade is: C")
            elif average >= 60 and average <= 69:
                print("The average is: " + str(float(average)))
                print("The grade is: D")
            elif average >= 50 and average <= 59:
                print("The average is: " + str(float(average)))
                print("The grade is: F")
        elif usercalculation != ID[0] and usercalculation != ID[1] and usercalculation != ID[2] and usercalculation != ID[3]:
            print("The ID is not found!")
            break
        
    


count = 0
while count < 1:
    print("**** MENU OPTIONS ****")
    print("Type P to populate the student information.")
    print("Type U to update student information")
    print("Type D to display the student information.")
    print("Type C to calculate the Grade.")
    print("Type E to exit")
    userchoice = input("Please enter your choice: ")
    if userchoice == "P":
        usertypesP()
        continue
    
    elif userchoice == "U":
        userupdateU()
        continue
    
    elif userchoice == "D":
        usersearchD()
        continue
    
    elif userchoice == "C":
        useravgcalculationC()
        continue
    
    elif userchoice == "E":
        print("Thank you for using the program.")
        print("Bye")
        break
    
    else:
        print("Invalid choice. Please try again!")
        continue
