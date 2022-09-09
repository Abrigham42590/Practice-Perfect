number_of_people_yearly_income1 = 0
number_of_people_yearly_income2 = 0
number_of_people_yearly_income3 = 0
number_of_people_yearly_income4 = 0
user_firstperson_yearly_income = input("Please enter yearly income of first person :")
if int(user_firstperson_yearly_income) <= 30000:
    number_of_people_yearly_income1 = number_of_people_yearly_income1 + 1
elif int(user_firstperson_yearly_income) > 30000 and int(user_firstperson_yearly_income) <= 50000:
    number_of_people_yearly_income2 = number_of_people_yearly_income2 + 1
elif int(user_firstperson_yearly_income) > 50000 and int(user_firstperson_yearly_income) <= 75000:
    number_of_people_yearly_income3 = number_of_people_yearly_income3 + 1
elif int(user_firstperson_yearly_income) > 75000:
    number_of_people_yearly_income4 = number_of_people_yearly_income4 + 1

user_secondperson_yearly_income = input("Please enter yearly income of second person :")
if int(user_secondperson_yearly_income) <= 30000:
    number_of_people_yearly_income1 = number_of_people_yearly_income1 + 1
elif int(user_secondperson_yearly_income) > 30000 and int(user_secondperson_yearly_income) <= 50000:
    number_of_people_yearly_income2 = number_of_people_yearly_income2 + 1
elif int(user_secondperson_yearly_income) > 50000 and int(user_secondperson_yearly_income) <= 75000:
    number_of_people_yearly_income3 = number_of_people_yearly_income3 + 1
elif int(user_secondperson_yearly_income) > 75000:
    number_of_people_yearly_income4 = number_of_people_yearly_income4 + 1
    
user_thirdperson_yearly_income = input("Please enter yearly income of third person :")
if int(user_thirdperson_yearly_income) <= 30000:
    number_of_people_yearly_income1 = number_of_people_yearly_income1 + 1
elif int(user_thirdperson_yearly_income) > 30000 and int(user_thirdperson_yearly_income) <= 50000:
    number_of_people_yearly_income2 = number_of_people_yearly_income2 + 1
elif int(user_thirdperson_yearly_income) > 50000 and int(user_thirdperson_yearly_income) <= 75000:
    number_of_people_yearly_income3 = number_of_people_yearly_income3 + 1
elif int(user_thirdperson_yearly_income) > 75000:
    number_of_people_yearly_income4 = number_of_people_yearly_income4 + 1


user_fourthperson_yearly_income = input("Please enter yearly income of fourth person :")
if int(user_fourthperson_yearly_income) <= 30000:
    number_of_people_yearly_income1 = number_of_people_yearly_income1 + 1
elif int(user_fourthperson_yearly_income) > 30000 and int(user_fourthperson_yearly_income) <= 50000:
    number_of_people_yearly_income2 = number_of_people_yearly_income2 + 1
elif int(user_fourthperson_yearly_income) > 50000 and int(user_fourthperson_yearly_income) <= 75000:
    number_of_people_yearly_income3 = number_of_people_yearly_income3 + 1
elif int(user_fourthperson_yearly_income) > 75000: 
    number_of_people_yearly_income4 = number_of_people_yearly_income4 + 1

user_fifthperson_yearly_income = input("Please enter yearly income of fifth person :")
if int(user_fifthperson_yearly_income) <= 30000:
    number_of_people_yearly_income1 = number_of_people_yearly_income1 + 1
elif int(user_fifthperson_yearly_income) > 30000 and int(user_fifthperson_yearly_income) <= 50000:
    number_of_people_yearly_income2 = number_of_people_yearly_income2 + 1
elif int(user_fifthperson_yearly_income) > 50000 and int(user_fifthperson_yearly_income) <= 75000:
    number_of_people_yearly_income3 = number_of_people_yearly_income3 + 1
elif int(user_fifthperson_yearly_income) > 75000:
    number_of_people_yearly_income4 = number_of_people_yearly_income4 + 1
    
user_sixthperson_yearly_income = input("Please enter yearly income of sixth person :")
if int(user_sixthperson_yearly_income) <= 30000:
    number_of_people_yearly_income1 = number_of_people_yearly_income1 + 1
elif int(user_sixthperson_yearly_income) > 30000 and int(user_sixthperson_yearly_income) <= 50000:
    number_of_people_yearly_income2 = number_of_people_yearly_income2 + 1
elif int(user_sixthperson_yearly_income) > 50000 and int(user_sixthperson_yearly_income) <= 75000:
    number_of_people_yearly_income3 = number_of_people_yearly_income3 + 1
elif int(user_sixthperson_yearly_income) > 75000:
    number_of_people_yearly_income4 = number_of_people_yearly_income4 + 1

user_seventhperson_yearly_income = input("Please enter yearly income of seventh person :")
if int(user_seventhperson_yearly_income) <= 30000:
    number_of_people_yearly_income1 = number_of_people_yearly_income1 + 1
elif int(user_seventhperson_yearly_income) > 30000 and int(user_seventhperson_yearly_income) <= 50000:
    number_of_people_yearly_income2 = number_of_people_yearly_income2 + 1
elif int(user_seventhperson_yearly_income) > 50000 and int(user_seventhperson_yearly_income) <= 75000:
    number_of_people_yearly_income3 = number_of_people_yearly_income3 + 1
elif int(user_seventhperson_yearly_income) > 75000:
    number_of_people_yearly_income4 = number_of_people_yearly_income4 + 1
print("Number of people who made less than  or equal to 30000 is :" + str(number_of_people_yearly_income1))
print("Number of people who made above 30000 and  less than or equal to 50000 is :" + str(number_of_people_yearly_income2))
print("Number of people who made  above 50000 and less than or equal to 75000 is :" +str(number_of_people_yearly_income3))
print("Number of people who made  above 75000 is :" + str(number_of_people_yearly_income4))
total = int(user_firstperson_yearly_income) + int(user_secondperson_yearly_income) + int(user_thirdperson_yearly_income) + int(user_fourthperson_yearly_income) + int(user_fifthperson_yearly_income) + int(user_sixthperson_yearly_income) + int(user_seventhperson_yearly_income)
print("The total(Combined) earning made by all people is :" + str(total))
