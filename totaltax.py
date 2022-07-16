count = 0
federaltax = 20
federaltax1 = 15
statetax = 5
salary1count = 0
salary2count = 0
salary3count = 0
salary4count = 0
totalstatetax = 0
totalfederaltax = 0

while count < 1:
    salary = input("Please one persons salary: ")
    tax1 = (int(salary) * federaltax) / 100
    tax2 = (int(salary) * federaltax1) / 100
    tax3 = (int(salary) * statetax) / 100
    netsalary = int(salary) - (tax1 + tax3)
    netsalary1 = int(salary) - (tax2 + tax3)
    if int(salary) > 100000:
        print("Your federal tax is :" + str(tax1))
        print("Your state tax is :" + str(tax3))
        print("Your net salaryis: " + str(netsalary))
        salary1count = salary1count + 1
        totalstatetax = totalstatetax + tax3
        totalfederaltax = totalfederaltax + tax1
    
    elif int(salary) >= 50000 and int(salary) < 100000:
        print("Your federal tax is :" + str(tax2))
        print("Your state tax is :" + str(tax3))
        print("Your net salaryis: " + str(netsalary1))
        salary2count = salary2count + 1
        totalstatetax = totalstatetax + tax3
        totalfederaltax = totalfederaltax + tax2
    
    elif int(salary) >= 25000 and int(salary) < 50000:
        print("Your federal tax is :" + str(tax2))
        print("Your state tax is :" + str(tax3))
        print("Your net salaryis: " + str(netsalary1))
        salary3count = salary3count + 1
        totalstatetax = totalstatetax + tax3
        totalfederaltax = totalfederaltax + tax2
        
    elif int(salary) < 25000:
        print("Your federal tax is :" + str(tax2))
        print("Your state tax is :" + str(tax3))
        print("Your net salaryis: " + str(netsalary1))  
        salary4count = salary4count + 1
        totalstatetax = totalstatetax + tax3
        totalfederaltax = totalfederaltax + tax2
    
    user = input("Would you like to continue?(yes/no): ")
    if user == "YES" or user == "yes":
        continue
    elif user == "NO" or user =="no":
        break
    count = count + 1

print("*****")
print("The number of pepole who earned more than 100000 is:  " + str(salary1count))
print("The number of pepole who earned More than or equal to 50000 and less than 100000 is:  " + str(salary2count))
print("The number of pepole who earned More than or equal to 25000 and less than 50000 is:  " +str(salary3count))
print("The number of pepole who earned Below 25000 is:  " + str(salary4count))
print("The total state tax is: " + str(totalstatetax))
print("The total federa tax is: " + str(totalfederaltax))
