user_name = input("Please enter your name :")

user_salary = input("Please enter your salary :")

federal_tax=(int(user_salary)*20)/100
federal_tax2=(int(user_salary)*15)/100
state_tax=(int(user_salary)*5)/100
net_salary = int(user_salary) - (float(federal_tax) + float(state_tax))
net_salary2 = int(user_salary) - (float(federal_tax2) + float(state_tax))


if(int(user_salary) > 100000):
    print("Your Federal Tax is :" + str(federal_tax))
    print("Your State Tax is :" + str(state_tax))
    print("Your net salary is :" + str(int(net_salary)))

if(int(user_salary) < 100000):
    print("Your Federal Tax is :" + str(federal_tax2))
    print("Your State Tax is :" + str(state_tax))
    print("Your net salary is :" +str(int(net_salary2)))