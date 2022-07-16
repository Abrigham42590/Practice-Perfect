count = 0
totaldeposit = 0
totalwithdraw = 0 
while count < 1:
    print("Type D to deposit money")
    print("Type W to withdraw money")
    print("Type B to display Balance")
    print("Type E to exit")
    userchoice = input("Enter your choice now: ")
    if userchoice == "D":
        userdeposit = input("Please enter your amount to deposit: ")
        totaldeposit= totaldeposit + userdeposit
        print("*****")
        continue
    
    
    elif userchoice  == "W":
        userwithdraw = input("Please enter the amount you want to withdraw: ")
        totalwithdraw = totalwithdraw + userwithdraw
        if int(totalwithdraw) > int(totaldeposit):
            print("Not enough balance")
        print("*****")
        continue
    
    
    elif userchoice == "B":
        if int(totalwithdraw) > int(totaldeposit):
            print("Your balance is: " + str(int(totaldeposit)))
        else:
            print("Your balance is: " + str(int(totaldeposit) - int(totalwithdraw)))
        print("*****")
        continue
    
 
    elif userchoice == "E":
        break
    
    else:
        print("Invalid Choice. Try Again")
        print("*****")
        continue
    