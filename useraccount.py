NamesArray = []
AccountNumbersArray = []
BalanceArray = []

def usertypesP():
    for userchoice in range(5):
        username = input("Please enter a name: ")
        useraccountnumber = input("Please enter an account number: ")
        userbalance = input("Please enter a balance: ")
        NamesArray.append(username)
        AccountNumbersArray.append(int(useraccountnumber))
        BalanceArray.append(int(userbalance))
       
def usersearchS():
    useraccount = input("Please enter the account number to search: ")
    for userchoice in range(5):
        if useraccount == AccountNumbersArray[userchoice]:
            print("Name is: " + str(NamesArray[userchoice]))
            print(str(NamesArray[userchoice]) + " account has the balance of : $" + str(BalanceArray[userchoice]))
        elif useraccount != AccountNumbersArray[0] and useraccount != AccountNumbersArray[1] and useraccount != AccountNumbersArray[2] and useraccount != AccountNumbersArray[3] and useraccount!= AccountNumbersArray[4]:
            print("The account number not found!")
            break
            
        

count = 0
while count < 1:
    print("**** MENU OPTIONS ****")
    print("Type P to populate accounts")
    print("Type S to search for account")
    print("Type E to exit")
    userchoice = input("Please enter your choice: ")
    if userchoice == "P":
        usertypesP()
        continue
    
    elif userchoice == "S":
        usersearchS()
        continue
    
    elif userchoice == "E":
        print("Thank you for using the program.")
        print("Bye")
        break
   
    else:
        print("Invalid choice. Please try again!")
        continue