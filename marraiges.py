count = 0
marriageagecount50 = 0
marriageagecount40 = 0 
marriageagecount30 = 0 
marriageagecount20 = 0
singleagecount50 = 0
singleagecount40 = 0
singleagecount30 = 0 
singleagecount20 = 0
divorceagecount50 = 0
divorceagecount40 = 0
divorceagecount30 = 0
divorceagecount20 = 0
separatedagecount50 = 0
separatedagecount40 = 0
separatedagecount30 = 0
separatedagecount20 = 0
marriagecount = 0
singlecount = 0
divorcecount = 0
separatedcount = 0

while count < 6:
    usermarital = input("Please enter persons marital status: ")
    count = count + 1
    if usermarital == "MARRIED" or usermarital == "married":
        marriagecount = marriagecount + 1
    elif usermarital == "SINGLE" or usermarital == "single":
        singlecount = singlecount + 1
    elif usermarital == "DIVORCED" or usermarital == "divorced":
        divorcecount = divorcecount + 1
    elif usermarital == "SEPARATED" or usermarital =="separated":
        separatedcount = separatedcount + 1
   
    userage = input("Please enter perons age: ")
    if userage >= 50 and usermarital == "MARRIED" or userage >= 50 and usermarital == "married":
        marriageagecount50 = marriageagecount50 + 1
    elif userage < 20:
        print("Sorry ! The person does not belong to any group")
    elif usermarital != "MARRIED" and usermarital != "married" and usermarital != "SINGLE" and usermarital != "single" and usermarital != "DIVORCED" and usermarital != "divorced" and usermarital != "SEPARATED" and usermarital != "separated":
         print("Sorry ! The marital status does not belong to one of the known statuses")
    elif userage >= 50 and usermarital == "SINGLE" or userage >= 50 and usermarital == "single":
        singleagecount50 = singleagecount50 + 1
    elif userage >= 50 and usermarital == "DIVORCED"  or userage >= 50 and usermarital == "divorced":
        divorceagecount50 = divorceagecount50 + 1
    elif userage >= 50 and usermarital == "SEPARATED" or userage >= 50 and usermarital == "separated":
        separatedagecount50 = separatedagecount50 + 1
    elif userage >= 40 and userage < 50 and usermarital == "MARRIED" or userage >= 40 and userage < 50 and usermarital == "married":
        marriageagecount40 = marriageagecount40 + 1
    elif userage >= 40 and userage < 50 and usermarital == "SINGLE" or  userage >= 40 and userage < 50 and usermarital == "single":
        singleagecount40 = singleagecount40 + 1
    elif userage >= 40 and userage < 50 and usermarital == "DIVORCED" or userage>= 40 and userage < 50 and usermarital == "divorced":
        divorceagecount40 = divorceagecount40 + 1
    elif userage >= 40 and userage < 50 and usermarital == "SEPARATED" or userage >= 40 and userage < 50 and usermarital == "separated":
        separatedagecount40 = separatedagecount40 + 1
    elif userage >= 30 and userage < 40 and usermarital == "MARRIED" or userage >= 30 and userage < 40 and usermarital == "married":
        marriageagecount30 = marriageagecount30 + 1
    elif userage >= 30 and userage < 40 and usermarital == "SINGLE" or userage >= 30 and userage < 40 and usermarital == "single":
        singleagecount30 = singleagecount30 + 1
    elif userage >= 30 and userage < 40 and usermarital == "DIVORCED" or userage >=30 and userage < 40 and usermarital == "divorced":
        divorceagecount30 = divorceagecount30 + 1
    elif userage >= 30 and userage < 40 and usermarital == "SEPARATED" or userage >= 30 and userage < 40 and usermarital == "separated":
        separatedagecount30 = separatedagecount30 + 1
    elif userage >=20 and userage < 30 and usermarital == "MARRIED" or userage >=20 and userage < 30 and usermarital == "married":
        marriageagecount20 = marriageagecount20 + 1
    elif userage >= 20 and userage < 30 and usermarital == "SINGLE" or userage>= 20 and userage < 30 and usermarital == "single":
        singleagecount20 = singleagecount20 + 1
    elif userage >= 20 and userage < 30 and usermarital == "DIVORCED" or userage >= 20 and userage < 30 and usermarital == "divorced":
        divorceagecount20 = divorceagecount20 + 1
    elif userage >= 20 and userage < 30 and usermarital == "SEPARATED" or userage >= 20 and userage < 30 and usermarital == "separated":
        separatedagecount20 = separatedagecount20 + 1
    
print("*****")        

print("The number of pepole who are married is: " + str(marriagecount))
print("The number of pepole who are married and over the 50 is: " + str(marriageagecount50))
print("The number of pepole who are married and in the age group of 40's is: " + str(marriageagecount40))
print("The number of pepole who are married and in the age group of 30's is: " + str(marriageagecount30))
print("The number of pepole who are married and in the age group of 20's is: " + str(marriageagecount20))

print("*****")

print("The number of pepole who are single is: " + str(singlecount))
print("The number of pepole who are single and over the 50 is: " + str(singleagecount50))
print("The number of pepole who are single and in the age group of 40's is: " + str(singleagecount40))
print("The number of pepole who are single and in the age group of 30's is: " + str(singleagecount30))
print("The number of pepole who are single and in the age group of 20's is: " + str(singleagecount20))

print("*****")

print("The number of pepole who are divorced is: " + str(divorcecount))
print("The number of pepole who are divorced and over the 50 is: " + str(divorceagecount50))
print("The number of pepole who are divorced and in the age group of 40's is: " + str(divorceagecount40))
print("The number of pepole who are divorced and in the age group of 30's is: " + str(divorceagecount30))
print("The number of pepole who are divorced and in the age group of 20's is: " + str(divorceagecount20))

print("*****")

print("The number of pepole who are separated is: " + str(separatedcount))
print("The number of pepole who are separated and over the 50 is: " + str(separatedagecount50))
print("The number of pepole who are separated and in the age group of 40's is: " + str(separatedagecount40))
print("The number of pepole who are separated and in the age group of 30's is: " + str(separatedagecount30))
print("The number of pepole who are separated and in the age group of 20's is: " + str(separatedagecount20))
print("*****")

