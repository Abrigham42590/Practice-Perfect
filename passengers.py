def totalnumberofpassangers():
    total = int(totalpassengers) + int(totalpassengers2) + int(totalpassengers3)
    return total
    
    
    
def totalfare():
    fare = 2.50
    totalfare = totalnumberofpassangers() * fare
    return totalfare

def netprofit():
    farededecution = .50
    operatingcost = totalfare() * farededecution
    profit = totalfare() - operatingcost
    return profit

totalpassengers = input("Please enter the number of passengers for bus1 :")
totalpassengers2 = input("Please enter the number of passengers for bus2 :")
totalpassengers3 = input("Please enter the number of passengers for bus3 :")

print("***********")

print("There are total " + str(totalnumberofpassangers()) + " passengers from three buses.")
print("The total fare earned is: $" + str(totalfare()))
print("The net profit is: $" + str(netprofit()))

print("***********")