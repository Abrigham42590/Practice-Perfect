statetax = 9
statetax2 = 10
statetax3 = 8
federaltax = 20
federaltax2 = 15
statetax4 = 12
for employee in range(1):
    employee = input("Please enter employee Name: ")
    salary = input("Please enter employee salary: ")
    if int(salary) > 100000:
        governmenttax = federaltax * int(salary) / 100
    else:
        governmenttax = federaltax2 * int(salary) / 100

    state = input("Please enter employee state: ")
    if state == "California" or state == "Nevada" or state == "Arizona" or state == "Washington":
        tax = statetax2 * int(salary) / 100
    elif state == "Texas" or state == "NewMexico" or state == "Alabama":
        tax = statetax * int(salary) / 100
    elif state == "Newyork" or state == "Illinois" or state == "Wisconsin" or state == "Delaware":
        tax = statetax3 * int(salary) / 100
    else:
        tax = statetax4 * int(salary) / 100
    netsalary = (int(salary)) - (governmenttax + tax)

print(str(employee) + " federal tax is: " + str(governmenttax))
print(str(employee) + " state tax is: " + str(tax))
print(str(employee) + " net salary is: " + str(netsalary))
print("*****")

for employee2 in range(1):
    employee2 = input("Please enter employee Name: ")
    salary2 = input("Please enter employee salary: ")
    if int(salary2) > 100000:
        governmenttax2 = federaltax * int(salary2) / 100
    else:
        governmenttax2 = federaltax2 * int(salary2) / 100
    
    state2 = input("Please enter employee state: ")
    if state2 == "California" or state2 == "Nevada" or state2 == "Arizona" or state2 == "Washington":
        tax2 = statetax2 * int(salary2) / 100
    elif state2 == "Texas" or state2 == "NewMexico" or state2 == "Alabama":
        tax2 = statetax * int(salary2) / 100
    elif state2 == "Newyork" or state2 == "Illinois" or state2 == "Wisconsin" or state2 == "Delaware":
        tax2 = statetax3 * int(salary2) / 100
    else:
        tax2 = statetax4 * int(salary2) / 100
    netsalary2 = (int(salary2)) - (governmenttax2 + tax2)

print(str(employee2) + " federal tax is: " + str(governmenttax2))
print(str(employee2) + " state tax is: " + str(tax2))
print(str(employee2) + " net salary is: " + str(netsalary2))
print("*****")

    
for employee3 in range(1):
    employee3 = input("Please enter employee Name: ")
    salary3 = input("Please enter employee salary: ")
    if int(salary3) > 100000:
        governmenttax3 = federaltax * int(salary3) / 100
    else:
        governmenttax3 = federaltax2 * int(salary3) / 100
    
    state3 = input("Please enter employee state: ")
    if state3 == "California" or state3 == "Nevada" or state3 == "Arizona" or state3 == "Washington":
        tax3 = statetax2 * int(salary3) / 100
    elif state3 == "Texas" or state3 == "NewMexico" or state3 == "Alabama":
        tax3 = statetax * int(salary3) / 100
    elif state3 == "Newyork" or state3 == "Illinois" or state3 == "Wisconsin" or state3 == "Delaware":
        tax3 = statetax3 * int(salary3) / 100
    else:
        tax3 = statetax4 * int(salary3) / 100
    netsalary3 = (int(salary3)) - (governmenttax3 + tax3)

print(str(employee3) + " federal tax is: " + str(governmenttax3))
print(str(employee3) + " state tax is: " + str(tax3))
print(str(employee3) + " net salary is: " + str(netsalary3))
print("*****")

for employee4 in range(1):
    employee4 = input("Please enter employee Name: ")
    salary4 = input("Please enter employee salary: ")
    if int(salary4) > 100000:
        governmenttax4 = federaltax * int(salary4) / 100
    else:
        governmenttax4 = federaltax2 * int(salary4) / 100

    state4 = input("Please enter employee state: ")
    if state4 == "California" or state4 == "Nevada" or state4 == "Arizona" or state4 == "Washington":
        tax4 = statetax2 * int(salary4) / 100
    elif state4 == "Texas" or state4 == "NewMexico" or state4 == "Alabama":
        tax4 = statetax * int(salary4) / 100
    elif state4 == "Newyork" or state4 == "Illinois" or state4 == "Wisconsin" or state4 == "Delaware":
        tax4 = statetax3 * int(salary4) / 100
    else:
        tax4 = statetax4 * int(salary4) / 100
    netsalary4 = (int(salary4)) - (governmenttax4 + tax4)

print(str(employee4) + " federal tax is: " + str(governmenttax4))
print(str(employee4) + " state tax is: " + str(tax4))
print(str(employee4) + " net salary is: " + str(netsalary4))
print("*****")
    
for employee5 in range(1):
    employee5 = input("Please enter employee Name: ")
    salary5 = input("Please enter employee salary: ")
    if int(salary5) > 100000:
        governmenttax5 = federaltax * int(salary5) / 100
    else:
        governmenttax5 = federaltax2 * int(salary5) / 100
    
    state5 = input("Please enter employee state: ")
    if state5 == "California" or state5 == "Nevada" or state5 == "Arizona" or state5 == "Washington":
        tax5 = statetax2 * int(salary5) / 100
    elif state5 == "Texas" or state5 == "NewMexico" or state5 == "Alabama":
        tax5 = statetax * int(salary5) / 100
    elif state5 == "Newyork" or state5 == "Illinois" or state5 == "Wisconsin" or state5 == "Delaware":
        tax5 = statetax3 * int(salary5) / 100
    else:
        tax5 = statetax4 * int(salary5) / 100
    netsalary5 = (int(salary5)) - (governmenttax5 + tax5)
    
print(str(employee5) + " federal tax is: " + str(governmenttax5))
print(str(employee5) + " state tax is: " + str(tax5))
print(str(employee5) + " net salary is: " + str(netsalary5))
print("*****")