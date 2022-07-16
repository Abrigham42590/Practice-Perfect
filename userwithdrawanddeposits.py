NamesArray = []
AccountNumbersArray = []
BalanceArray = []
totaldeposit = 0


def usertypesP():
    for userchoice in range(5):
        username = input("Please enter a name: ")
        useraccountnumber = input("Please enter an account number: ")
        userbalance = input("Please enter a balance: ")
        NamesArray.append(username)
        AccountNumbersArray.append(int(useraccountnumber))
        BalanceArray.append(int(userbalance))
        

def userdepositD():
    userdeposit = input("Please enter the account number to add deposit: ")
    for userchoice in range(5):
        if userdeposit == AccountNumbersArray[userchoice]:
            userdeposits = input("Please enter the amount to be deposited: ")
            totaldeposit = int(userdeposits) + BalanceArray[userchoice]
            BalanceArray[userchoice] = totaldeposit

def userwithdrawW():
    userwithdraw = input("Please enter the account number to withdraw: ")
    for userchoice in range(5):
        if userwithdraw == AccountNumbersArray[userchoice]:
            userwithdraws = input("Please enter the amount to be withdraw: ")
            totalwithdraw = BalanceArray[userchoice] - userwithdraws
            BalanceArray[userchoice] = totalwithdraw
            if int(userwithdraws) > BalanceArray[userchoice]:
                withdrawaddback = BalanceArray[userchoice] + userwithdraws
                BalanceArray[userchoice] = withdrawaddback
                print("ERROR: Not enough balance")
             


def usersearchS():
    useraccount = input("Please enter the account number to search: ")
    for userchoice in range(5):
        if useraccount == AccountNumbersArray[userchoice]:
            print("Name is: " + str(NamesArray[userchoice]) + " and the balance is: " + str(BalanceArray[userchoice]))           


count = 0
while count < 1:
    print("**** MENU OPTIONS ****")
    print("Type P to populate accounts")
    print("Type S to search for account")
    print("Type D to deposit Amount")
    print("Type W to withdraw Amount")
    print("Type E to exit")
    userchoice = input("Please enter your choice: ")
    if userchoice == "P":
        usertypesP()
        continue
    
    elif userchoice == "S":
        usersearchS()
        continue
    
    elif userchoice == "D":
        userdepositD()
        continue
    
    elif userchoice == "W":
        userwithdrawW()
        continue
    
    elif userchoice == "E":
        print("Thank you for using the program")
        print("Bye")
        break
   
    else:
        print("Invalid choice. Please try again")
        continue
