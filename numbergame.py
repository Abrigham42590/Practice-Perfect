Sum = 0
count = 1
usernumbers = input("How many numbers do you want to enter?: ")
Sum = smallestnumber = input("Please enter your number: ")
while(count < int(usernumbers)):
    numberenter = int(input("Please enter your number: "))
    Sum = Sum + numberenter
    count = count + 1
    if (int(numberenter) < int(smallestnumber)):
        smallestnumber = numberenter
    
    
print("*****")
print("The smallest number is: " +str(smallestnumber))
print("The average is: " + str(float(Sum)/count))
 