count = 0
depositcount = 0
depositcount2 = 0
depositcount3 = 0
depositcount4 = 0
sum = 0
for deposit in range(1,8):
    deposit = input("Please enter your deposit amount: ")
    count = count + 1
    if int(deposit) >= 1000:
        depositcount = depositcount + 1
    elif int(deposit) >= 500 and int(deposit) <= 999:
        depositcount2 = depositcount2 + 1
    elif int(deposit) >= 100 and int(deposit) <= 499:
        depositcount3 = depositcount3 + 1
    elif int(deposit) >= 0 and int(deposit) <= 99:
        depositcount4 = depositcount4 + 1
    else:
        print("You entered the wrong amount!")
    sum = sum + int(deposit)
        
print("You have " + str(depositcount) + " deposit over or equal to 1000 dollars.")
print("You have " + str(depositcount2) + " deposit between 500 and 999 dollars.")
print("You have " + str(depositcount3) + " deposit between 100 and 499 dollars. ")
print("You have " + str(depositcount4) + " deposit below 100 dollars.")
print("Your balance is : " + str(sum))
