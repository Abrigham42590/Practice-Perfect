food_spent_count = 0
gas_spent_count = 0

user_monday_food = input("Please enter the amount spent on food on Monday :")
if user_monday_food > 20:
    food_spent_count = food_spent_count + 1

user_monday_gas = input("Please enter the amount spent on gas on Monday :")
if user_monday_gas > 10:
    gas_spent_count = gas_spent_count + 1
    
user_tuesday_food = input("Please enter the amount spent on food on Tuesday :")
if user_tuesday_food > 20:
    food_spent_count = food_spent_count + 1
    
user_tuesday_gas = input("Please enter the amount spent on gas on Tuesday :")
if user_tuesday_gas > 10:
    gas_spent_count = gas_spent_count + 1

user_wednesday_food = input("Please enter the amount spent on food on Wednesday :")
if user_wednesday_food > 20:
    food_spent_count = food_spent_count + 1

user_wednesday_gas = input("Please enter the amount spent on gas on Wednesday :")
if user_wednesday_gas > 10:
    gas_spent_count = gas_spent_count + 1
    
user_thursday_food = input("Please enter the amount spent on food on Thursday :")
if user_thursday_food > 20:
    food_spent_count = food_spent_count + 1
    
user_thrusday_gas = input("Please enter the amount spent on gas on Thursday :")
if user_thrusday_gas > 10:
    gas_spent_count = gas_spent_count + 1

user_friday_food = input("Please enter the amount spent on food on Friday :")
if user_friday_food > 20:
    food_spent_count = food_spent_count + 1
    
user_friday_gas = input("Please enter the amount spent on gas on Friday :")
if user_friday_gas > 10:
    gas_spent_count = gas_spent_count + 1

user_saturday_food = input("Please enter the amount spent on food on Saturday :")
if user_saturday_food > 20:
    food_spent_count = food_spent_count + 1
    
user_saturday_gas = input ("Please enter the amount spent on gas on Saturday :")
if user_saturday_gas > 10:
    gas_spent_count = gas_spent_count + 1
    
user_sunday_food = input("Please enter the amount spent on food on Sunday :")
if user_sunday_food > 20:
    food_spent_count = food_spent_count + 1
    
user_sunday_gas = input("Please enter the amount spent on gas on Sunday :")
if user_sunday_gas > 10:
    gas_spent_count = gas_spent_count + 1 

print("You spent more than 20 dollars per day on food in " + str(food_spent_count) + " days of the week.")
print("You spent more than 10 dollars per day on gas in " + str(gas_spent_count) + " days of the week.")