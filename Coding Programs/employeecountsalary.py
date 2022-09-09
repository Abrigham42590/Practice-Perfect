employeecount = 1
employeecount2 =2
yearcount2 = 1
employeecount3 = 3
yearcount3 = 1
employeecount4 = 4
yearcount4 = 1
employeecount5 = 5
yearcount5 = 1
employeecount6 = 6
yearcount6 = 1
Sum1 = 0
Sum2 = 0
Sum3 = 0
Sum4 = 0
Sum5 = 0
Sum6 = 0
yearcount = 1
greatestsalary1 = 0
greatestsalary2 = 0
greatestsalary3 = 0
greatestsalary4 = 0
greatestsalary5 = 0
greatestsalary6 = 0

smallestsalary1 = 10000000000000
smallestsalary2 = 10000000000000
smallestsalary3 = 10000000000000
smallestsalary4 = 10000000000000
smallestsalary5 = 10000000000000
smallestsalary6 = 10000000000000

for greatsalary1 in range(1,6):
    greatsalary1 = input("Please enter employee " + str(employeecount) + " salary for year " + str(yearcount) + ": " )
    if (int(greatsalary1) < int(smallestsalary1)):
        smallestsalary1 = greatsalary1
    if(int(greatsalary1) > int(greatestsalary1)):
        greatestsalary1 = greatsalary1 
    Sum1 = Sum1 + int(greatsalary1)
    avg = float(Sum1) / 5
    for salary in range(1):
        yearcount = yearcount + 1
        
print("Employee 1 smallest salary is: $" + str(smallestsalary1))
print("Employee 1 highest salary is: $" + str(greatestsalary1))
print("Employee 1 average salary is: $" + str(avg))

print("**********")

for greatsalary2 in range(1,6):
    greatsalary2 = input("Please enter employee " + str(employeecount2) + " salary for year " + str(yearcount2) + ": " )
    if (int(greatsalary2) < int(smallestsalary2)):
        smallestsalary2 = greatsalary2
    if(int(greatsalary2) > int(greatestsalary2)):
        greatestsalary2 = greatsalary2 
    Sum2 = Sum2 + int(greatsalary2)
    avg = float(Sum2) / 5
    for salary in range(1):
        yearcount2 = yearcount2 + 1

print("Employee 2 smallest salary is: $" + str(smallestsalary2))
print("Employee 2 highest salary is: $" + str(greatestsalary2))
print("Employee 2 average salary is: $" + str(avg))

print("**********")

for greatsalary3 in range(1,6):
    greatsalary3 = input("Please enter employee " + str(employeecount3) + " salary for year " + str(yearcount3) + ": " )
    if (int(greatsalary3) < int(smallestsalary3)):
        smallestsalary3 = greatsalary3
    if(int(greatsalary3) > int(greatestsalary3)):
        greatestsalary3 = greatsalary3
    Sum3 = Sum3 + int(greatsalary3)
    avg = float(Sum3) / 5
    for salary in range(1):
        yearcount3 = yearcount3 + 1
        
print("Employee 3 smallest salary is: $" + str(smallestsalary3))
print("Employee 3 highest salary is: $" + str(greatestsalary3))
print("Employee 3 average salary is: $" + str(avg))

print("**********")


for greatsalary4 in range(1,6):
    greatsalary4 = input("Please enter employee " + str(employeecount4) + " salary for year " + str(yearcount4) + ": " )
    if (int(greatsalary4) < int(smallestsalary4)):
        smallestsalary4 = greatsalary4
    if(int(greatsalary4) > int(greatestsalary4)):
        greatestsalary4 = greatsalary4 
    Sum4 = Sum4 + int(greatsalary4)
    avg = float(Sum4) / 5
    for salary in range(1):
        yearcount4 = yearcount4 + 1

print("Employee 4 smallest salary is: $" + str(smallestsalary4))
print("Employee 4 highest salary is: $" + str(greatestsalary4))
print("Employee 4 average salary is: $" + str(avg))

print("**********")


for greatsalary5 in range(1,6):
    greatsalary5 = input("Please enter employee " + str(employeecount5) + " salary for year " + str(yearcount5) + ": " )
    if (int(greatsalary5) < int(smallestsalary5)):
        smallestsalary5 = greatsalary5
    if(int(greatsalary5) > int(greatestsalary5)):
        greatestsalary5 = greatsalary5 
    Sum5 = Sum5 + int(greatsalary5)
    avg = float(Sum5) / 5
    for salary in range(1):
        yearcount5 = yearcount5 + 1
        
print("Employee 5 smallest salary is: $" + str(smallestsalary5))
print("Employee 5 highest salary is: $" + str(greatestsalary5))
print("Employee 5 average salary is: $" + str(avg))

print("**********")


for greatsalary6 in range(1,6):
    greatsalary6 = input("Please enter employee " + str(employeecount6) + " salary for year " + str(yearcount6) + ": " )
    if (int(greatsalary6) < int(smallestsalary6)):
        smallestsalary6 = greatsalary6
    if(int(greatsalary6) > int(greatestsalary6)):
        greatestsalary6 = greatsalary6 
    Sum6 = Sum6 + int(greatsalary6)
    avg = float(Sum6) / 5
    for salary in range(1):
        yearcount6 = yearcount6 + 1
        
print("Employee 6 smallest salary is: $" + str(smallestsalary6))
print("Employee 6 highest salary is: $" + str(greatestsalary6))
print("Employee 6 average salary is: $" + str(avg))

print("**********")
