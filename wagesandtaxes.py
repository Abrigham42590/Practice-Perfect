federaltax = 20 
federaltax2 = 25
federaltax3 = 22
statetax = 8
statetax1 = 7
statetax2 = 6
statetax3 = 5

def calculatewages(num1, num2):
    return num1 * num2




def calculatefederaltaxes():
    if maritalstatus  == "Married":
        return (calculatewages(workhours, hourlyrate) * federaltax) / 100
    elif maritalstatus == "Single":
        return (calculatewages(workhours, hourlyrate) * federaltax2) / 100
    else:
        return (calculatewages(workhours, hourlyrate) * federaltax3) / 100
        
def calculatestatetaxes():
    if stateofresident == "CA" or stateofresident == "NV" or stateofresident == "SD" or stateofresident == "WA" or stateofresident == "AZ":
        return(calculatewages(workhours, hourlyrate) * statetax) / 100
    elif stateofresident == "TX" or stateofresident == "IL" or stateofresident == "MO" or stateofresident == "OH" or stateofresident == "VA":
        return(calculatewages(workhours, hourlyrate) * statetax1) / 100
    elif stateofresident == "NM" or stateofresident == "OR" or stateofresident == "IN":
        return(calculatewages(workhours, hourlyrate) * statetax2) / 100
    else:
        return(calculatewages(workhours, hourlyrate) * statetax3) / 100

def calculatenet():
    totalwage = calculatewages(workhours, hourlyrate)
    totalfederaltax = calculatefederaltaxes()
    totalstatetax = calculatestatetaxes()
    return (totalwage) - (totalfederaltax + totalstatetax)
    
#main function begins here
workhours = input("Please enter your work hours: ")
hourlyrate = input("Please enter your hourly rate: ")
stateofresident = input("Please enter your state of resident: ")
maritalstatus = input("Please enter your marital status: ")


totalwages = calculatewages(workhours, hourlyrate)

print("**********")
print("Your wage is: $" + str(totalwages))
print("Your federal tax is: $" + str(calculatefederaltaxes()))
print("Your state tax is: $" + str(calculatestatetaxes()))
print("Your net wage is: $" + str(calculatenet()))
print("**********")

