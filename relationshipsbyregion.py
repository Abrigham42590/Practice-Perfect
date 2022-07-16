westernregion = 0
easternregion = 0 
southernregion = 0
westernmarried = 0
easternmarried = 0
southernmarried = 0
westerndivorce = 0
easterndivorce = 0
southerndivorce = 0
westernsingle = 0
easternsingle = 0
southernsingle = 0 
westernseparated = 0
easternseparated = 0 
southernseparated = 0

state = input("please enter the state where the first person resides :")
if str(state) == "CA" or str(state) == "ca" or str(state) == "NV" or str(state) == "nv" or str(state) == "AR" or str(state) == "ar" or str(state) == "WA" or str(state) == "wa":
    westernregion = westernregion + 1
elif str(state) == "NY" or str(state) == "ny" or str(state) == "MA" or str(state) == "ma" or str(state) == "FL" or str(state) == "fl":
    easternregion = easternregion + 1
elif str(state) == "TX" or str(state) == "tx" or str(state) == "AL" or str(state) == "al" or str(state) == "GA" or str(state) == "ga":
    southernregion = southernregion + 1
else:
    print("The person is not counted towards Any of the following states. TX, AL, GA, NY, MA, FL, CA, NV, AR or WA")

relationship = input("Please enter marital status of first person :")
if str(relationship) == "Married" and str(state) == "CA" or str(relationship) == "Married" and str(state) == "ca" or str(relationship) == "married" and str(state) == "CA" or str(relationship) == "married" and str(state) == "ca":
    westernmarried = westernmarried + 1
elif str(relationship) == "Married" and str(state) == "NV" or str(relationship) == "Married" and str(state) == "nv" or str(relationship) == "married" and str(state) == "NV" or str(relationship) == "married" and str(state) == "nv":
    westernmarried = westernmarried + 1 
elif str(relationship) == "Married" and str(state) == "AR" or str(relationship) == "Married" and str(state) == "ar" or str(relationship) == "married" and str(state) == "AR" or str(relationship) == "married" and str(state) == "ar":
    westernmarried = westernmarried + 1
elif str(relationship) == "Married" and str(state) == "WA" or str(relationship) == "Married" and str(state) == "wa" or str(relationship) == "married" and str(state) == "WA" or str(relationship) == "married" and str(state) == "wa":
    westernmarried = westernmarried + 1
elif str(relationship) == "Married" and str(state) == "NY" or str(relationship) == "Married" and str(state) == "ny" or str(relationship) == "married" and str(state) == "NY"  or str(relationship) == "married" and str(state) == "ny":
    esternmarried = easternmarried + 1
elif str(relationship) == "Married" and str(state) == "MA" or str(relationship) == "Married" and str(state) == "ma" or str(relationship) == "married" and str(state) == "MA" or str(relationship) == "married" and str(state) =="ma":
    easternmarried = easternmarried + 1
elif str(relationship) == "Married" and str(state) == "FL" or str(relationship) == "Married" and str(state) == "fl" or str(relationship) == "married" and str(state) == "Fl" or str(relationship) == "married" and str(state) == "fl":
    easternmarried = easternmarried + 1
elif str(relationship) == "Married" and str(state) == "TX" or str(relationship) == "Married" and str(state) == "tx" or str(relationship) == "married" and str(state) == "TX" or str(relationship) == "married" and str(state) == "tx":
    southernmarried = southernmarried + 1
elif str(relationship) == "Married" and str(state) == "AL" or str(relationship) == "Married" and str(state) == "al" or str(relationship) == "married" and str(state) == "AL" or str(relationship) == "married" and str(state) == "al":
    southernmarried = southernmarried + 1
elif str(relationship) == "Married" and str(state) == "GA" or str(relationship) == "Married" and str(state) == "ga" or str(relationship) == "married" and str(state) == "GA" or str(relationship) == "married" and str(state) == "ga":
    southernmarried = southernmarried + 1
elif str(relationship) == "Single" and str(state) == "CA" or str(relationship) == "Single" and str(state) == "ca" or str(relationship) == "single" and str(state) == "CA" or str(relationship) == "single" and str(state) == "ca":
    westernsingle = westernsingle + 1
elif str(relationship) == "Single" and str(state) == "NV" or str(relationship) == "Single" and str(state) == "nv" or str(relationship) == "single" and str(state) == "NV" or str(relationship) == "single" and str(state) == "nv":
    westernsingle = westernsingle + 1
elif str(relationship) == "Single" and str(state) == "AR" or str(relationship) == "Single" and str(state) == "ar" or str(relationship) == "single" and str(state) == "AR" or str(relationship) == "single" and str(state) == "ar":
    westernsingle = westernsingle + 1
elif str(relationship) == "Single" and str(state) == "WA" or str(relationship) == "Single" and str(state) == "wa" or str(relationship) == "single" and str(state) == "AR" or str(relationship) == "single" and str(state) == "ar":
    westernsingle = westernsingle + 1 
elif str(relationship) == "Single" and str(state) == "NY" or str(relationship) == "Single" and str(state) == "ny" or str(relationship) == "single" and str(state) == "NY" or str(relationship) == "single" and str(state) == "ny":
    easternsingle = easternsingle + 1
elif str(relationship) == "Single" and str(state) == "MA" or str(relationship) == "Single" and str(state) == "ma" or str(relationship) == "single" and str(state) == "MA" or str(relationship) == "single" and str(state) == "ma":
    easternsingle = easternsingle + 1
elif str(relationship) == "Single" and str(state) == "FL" or str(relationship) == "Single" and str(state) == "fl" or str(relationship) == "single" and str(state) == "FL" or str(relationship) == "single" and str(state) == "fl":
    easternsingle = easternsingle + 1
elif str(relationship) == "Single" and str(state) == "TX" or str(relationship) == "Single" and str(state) == "tx" or str(relationship) == "single" and str(state) == "TX" or str(relationship) == "single" and str(state) == "tx":
    southernsingle = southernsingle + 1 
elif str(relationship) == "Single" and str(state) == "AL" or str(relationship) == "Single" and str(state) == "al" or str(relationship) == "single" and str(state) == "AL" or str(relationship) == "single" and str(state) == "al":
    southernsingle = southernsingle + 1
elif str(relationship) == "Single" and str(state) == "GA" or str(relationship) == "Single" and str(state) == "ga" or str(relationship) == "single" and str(state) == "GA" or str(relationship)== "single" and str(state) == "ga":
    southernsingle = southernsingle + 1
elif str(relationship) == "Divorced" and str(state) == "CA" or str(relationship) == "Divorced" and str(state) == "ca" or str(relationship) == "divorced" and str(state) == "CA" or str(relationship) =="divorced" and str(state) == "ca":
    westerndivorce = westerndivorce + 1
elif str(relationship) == "Divorced" and str(state) == "NV" or str(relationship) == "Divorced" and str(state) == "nv" or str(relationship) == "divorced" and str(state) ==" NV" or str(relationship) == "divorced" and str(state) == "nv":
    westerndivorce = westerndivorce + 1
elif str(relationship) == "Divorced" and str(state) == "AR" or str(relationship) == "Divorced" and str(state) == "ar" or str(relationship) == "divorced" and str(state) == "AR" or str(relationship) == "divorced" and str(state) == "ar":
    westerndivorce = westerndivorce + 1
elif str(relationship) == "Divorced" and str(state) == "WA" or str(relationship) == "Divorced" and str(state) == "wa" or str(relationship) == "divorced" and str(state) == "WA" or str(relationship) == "divorced" and str(state) == "wa":
    westerndivorce == westerndivorce + 1 
elif str(relationship) == "Divorced" and str(state) == "NY" or str(relationship) == "Divorced" and str(state) == "ny" or str(relationship) == "divorced" and str(state) == "NY" or str(relationship) == "divroced" and str(state) == "ny":
    easterndivorce = easterndivorce + 1
elif str(relationship) == "Divorced" and str(state) == "MA" or str(relationship) == "Divorced" and str(state) == "ma" or str(relationship) == "divorced" and str(state) == "MA" or str(relationship) == "divorced" and str(state) == "ma":
    easterndivorce = easterndivorce + 1
elif str(relationship) == "Divorced" and str(state) == "FL" or str(relationship) == "Divorced" and str(state) == "fl" or str(relationship) == "divorced" and str(state) == "FL" or str(relationship) == "divorced" and str(state) == "fl":
    easterndivorce = easterndivorce + 1
elif str(relationship) == "Divorced" and str(state) == "TX" or str(relationship) == "Divorced" and str(state) == "tx" or str(relationship) == "divorced" and str(state) == "TX" or str(relationship) == "divorced" and str(state) == "tx":
    southerndivorce = southerndivorce + 1
elif str(relationship) == "Divorced" and str(state) == "AL" or str(relationship) == "Divorced" and str(state) == "al" or str(relationship) == "divorced" and str(state) == "AL" or str(relationship) == "divorced" and str(state) == "al":
    southerndivorce = southerndivorce + 1
elif str(relationship) == "Divorced" and str(state) == "GA" or str(relationship) == "Divorced" and str(state) == "ga" or str(relationship) == "divorced" and str(state) == "GA" or str(relationship) == "divorced" and str(state) == "ga":
    southerndivorce = southerndivorce + 1
elif str(relationship) == "Separated" and str(state) == "CA" or str(relationship) == "Separated" and str(state) == "ca" or str(relationship) == "separated" and str(state) == "CA" or str(relationship) == "separated" and str(state) == "ca": 
    westernseparated = westernseparated + 1
elif str(relationship) == "Separated" and str(state) == "NV" or str(relationship) == "Separated" and str(state) == "nv" or str(relationship) == "separated" and str(state) == "NV" or str(relationship) == "separated" and str(state) == "nv":
    westernseparated = westernseparated + 1
elif str(relationship) == "Separated" and str(state) == "AR" or str(relationship) == "Separated" and str(state) == "ar" or str(relationship) == "separated" and str(state) == "AR" or str(relationship) == "separated" and str(state) == "ar":
    westernseparated = westernseparated + 1
elif str(relationship) == "Separated" and str(state) == "WA" or str(relationship) == "Separated" and str(state) == "wa" or str(relationship) == "separated" and str(state) == "WA" or str(relationship) == "separated" and str(state) == "wa":
    westernseparated = westernseparated + 1
elif str(relationship) == "Separated" and str(state) == "NY" or str(relationship) == "Separated" and str(state) == "ny" or str(relationship) == "separated" and str(state) == "NY" or str(relationship) == "separated" and str(state) == "ny":
    easternseparated = easternseparated + 1
elif str(relationship) == "Separated" and str(state) == "MA" or str(relationship) == "Separated" and str(state) == "ma" or str(relationship) == "separated" and str(state) == "MA" or str(relationship) == "separated" and str(state) == "ma":
    easternseparated = easternseparated + 1
elif str(relationship) == "Separated" and str(state) == "FL" or str(relationship) == "Separated" and str(state) == "fl" or str(relationship) == "separated" and str(state) == "FL" or str(relationship) == "separated" and str(state) == "fl":
    easternseparated = easternseparated + 1
elif str(relationship) == "Separated" and str(state) == "TX" or str(relationship) == "Separated" and str(state) == "tx" or str(relationship) == "separated" and str(state) == "TX" or str(relationship) == "separated" and str(state) == "tx":
    southernseparated = southernseparated + 1 
elif str(relationship) == "Separated" and str(state) == "AL" or str(relationship) == "Separated" and str(state) == "al" or str(relationship) == "separated" and str(state) == "AL" or str(relationship) == "separated" and str(state) == "al":
    southernseparated = southernseparated + 1 
elif str(relationship) == "Separated" and str(state) == "GA" or str(relationship) == "Separated" and str(state) == "ga" or str(relationship) == "separated" and str(state) == "GA" or str(relationship) == "separated" and str(state) == "ga":
    southernseparated = southernseparated + 1 
else:
    print("The person is not counted towards any marital group ")


state2 = input("please enter the state where the second person resides :")
if str(state2) == "CA" or str(state2) == "ca" or str(state2) == "NV" or str(state2) == "nv" or str(state2) == "AR" or str(state2) == "ar" or str(state2) == "WA" or str(state2) == "wa":
    westernregion = westernregion + 1
elif str(state2) == "NY" or str(state2) == "ny" or str(state2) == "MA" or str(state2) == "ma" or str(state2) == "FL" or str(state2) == "fl":
    easternregion = easternregion + 1
elif str(state2) == "TX" or str(state2) == "tx" or str(state2) == "AL" or str(state2) == "al" or str(state2) == "GA" or str(state2) == "ga":
    southernregion = southernregion + 1
else:
    print("The person is not counted towards Any of the following states. TX, AL, GA, NY, MA, FL, CA, NV, AR, or WA")

relationship2 = input("Please enter marital status of second person :")
if str(relationship2) == "Married" and str(state2) == "CA" or str(relationship2) == "Married" and str(state2) == "ca" or str(relationship2) == "married" and str(state2) == "CA" or str(relationship2) == "married" and str(state2) == "ca":
    westernmarried = westernmarried + 1
elif str(relationship2) == "Married" and str(state2) == "NV" or str(relationship2) == "Married" and str(state) == "nv" or str(relationship2) == "married" and str(state2) == "NV" or str(relationship2) == "married" and str(state2) == "nv":
    westernmarried = westernmarried + 1 
elif str(relationship) == "Married" and str(state2) == "AR" or str(relationship2) == "Married" and str(state2) == "ar" or str(relationship2) == "married" and str(state2) == "AR" or str(relationship2) == "married" and str(state2) == "ar":
    westernmarried = westernmarried + 1
elif str(relationship) == "Married" and str(state2) == "WA" or str(relationship2) == "Married" and str(state2) == "wa" or str(relationship2) == "married" and str(state2) == "WA" or str(relationship2) == "married" and str(state2) == "wa":
    westernmarried = westernmarried + 1
elif str(relationship) == "Married" and str(state2) == "NY" or str(relationship2) == "Married" and str(state2) == "ny" or str(relationship2) == "married" and str(state2) == "NY"  or str(relationship2) == "married" and str(state2) == "ny":
    esternmarried = easternmarried + 1
elif str(relationship2) == "Married" and str(state2) == "MA" or str(relationship2) == "Married" and str(state2) == "ma" or str(relationship2) == "married" and str(state2) == "MA" or str(relationship2) == "married" and str(state2) =="ma":
    easternmarried = easternmarried + 1
elif str(relationship2) == "Married" and str(state2) == "FL" or str(relationship2) == "Married" and str(state2) == "fl" or str(relationship2) == "married" and str(state2) == "Fl" or str(relationship2) == "married" and str(state2) == "fl":
    easternmarried = easternmarried + 1
elif str(relationship2) == "Married" and str(state2) == "TX" or str(relationship2) == "Married" and str(state2) == "tx" or str(relationship2) == "married" and str(state2) == "TX" or str(relationship2) == "married" and str(state2) == "tx":
    southernmarried = southernmarried + 1
elif str(relationship2) == "Married" and str(state2) == "AL" or str(relationship2) == "Married" and str(state2) == "al" or str(relationship2) == "married" and str(state2) == "AL" or str(relationship2) == "married" and str(state2) == "al":
    southernmarried = southernmarried + 1
elif str(relationship2) == "Married" and str(state2) == "GA" or str(relationship2) == "Married" and str(state2) == "ga" or str(relationship2) == "married" and str(state2) == "GA" or str(relationship2) == "married" and str(state2) == "ga":
    southernmarried = southernmarried + 1
elif str(relationship2) == "Single" and str(state2) == "CA" or str(relationship2) == "Single" and str(state2) == "ca" or str(relationship2) == "single" and str(state2) == "CA" or str(relationship2) == "single" and str(state2) == "ca":
    westernsingle = westernsingle + 1
elif str(relationship2) == "Single" and str(state2) == "NV" or str(relationship2) == "Single" and str(state2) == "nv" or str(relationship2) == "single" and str(state2) == "NV" or str(relationship2) == "single" and str(state2) == "nv":
    westernsingle = westernsingle + 1
elif str(relationship2) == "Single" and str(state2) == "AR" or str(relationship2) == "Single" and str(state2) == "ar" or str(relationship2) == "single" and str(state2) == "AR" or str(relationship2) == "single" and str(state2) == "ar":
    westernsingle = westernsingle + 1
elif str(relationship2) == "Single" and str(state2) == "WA" or str(relationship2) == "Single" and str(state2) == "wa" or str(relationship2) == "single" and str(state2) == "AR" or str(relationship2) == "single" and str(state2) == "ar":
    westernsingle = westernsingle + 1 
elif str(relationship2) == "Single" and str(state2) == "NY" or str(relationship2) == "Single" and str(state2) == "ny" or str(relationship2) == "single" and str(state2) == "NY" or str(relationship2) == "single" and str(state2) == "ny":
    easternsingle = easternsingle + 1
elif str(relationship2) == "Single" and str(state2) == "MA" or str(relationship2) == "Single" and str(state2) == "ma" or str(relationship2) == "single" and str(state2) == "MA" or str(relationship2) == "single" and str(state2) == "ma":
    easternsingle = easternsingle + 1
elif str(relationship2) == "Single" and str(state2) == "FL" or str(relationship2) == "Single" and str(state2) == "fl" or str(relationship2) == "single" and str(state2) == "FL" or str(relationship2) == "single" and str(state2) == "fl":
    easternsingle = easternsingle + 1
elif str(relationship2) == "Single" and str(state2) == "TX" or str(relationship2) == "Single" and str(state2) == "tx" or str(relationship2) == "single" and str(state2) == "TX" or str(relationship2) == "single" and str(state2) == "tx":
    southernsingle = southernsingle + 1 
elif str(relationship2) == "Single" and str(state2) == "AL" or str(relationship2) == "Single" and str(state2) == "al" or str(relationship2) == "single" and str(state2) == "AL" or str(relationship2) == "single" and str(state2) == "al":
    southernsingle = southernsingle + 1
elif str(relationship2) == "Single" and str(state2) == "GA" or str(relationship2) == "Single" and str(state2) == "ga" or str(relationship2) == "single" and str(state2) == "GA" or str(relationship2)== "single" and str(state2) == "ga":
    southernsingle = southernsingle + 1
elif str(relationship2) == "Divorced" and str(state2) == "CA" or str(relationship2) == "Divorced" and str(state2) == "ca" or str(relationship2) == "divorced" and str(state2) == "CA" or str(relationship2) =="divorced" and str(state2) == "ca":
    westerndivorce = westerndivorce + 1
elif str(relationship2) == "Divorced" and str(state2) == "NV" or str(relationship2) == "Divorced" and str(state2) == "nv" or str(relationship2) == "divorced" and str(state2) ==" NV" or str(relationship2) == "divorced" and str(state2) == "nv":
    westerndivorce = westerndivorce + 1
elif str(relationship2) == "Divorced" and str(state2) == "AR" or str(relationship2) == "Divorced" and str(state2) == "ar" or str(relationship2) == "divorced" and str(state2) == "AR" or str(relationship2) == "divorced" and str(state2) == "ar":
    westerndivorce = westerndivorce + 1
elif str(relationship2) == "Divorced" and str(state2) == "WA" or str(relationship2) == "Divorced" and str(state2) == "wa" or str(relationship2) == "divorced" and str(state2) == "WA" or str(relationship2) == "divorced" and str(state2) == "wa":
    westerndivorce = westerndivorce + 1 
elif str(relationship2) == "Divorced" and str(state2) == "NY" or str(relationship2) == "Divorced" and str(state2) == "ny" or str(relationship2) == "divorced" and str(state2) == "NY" or str(relationship2) == "divroced" and str(state2) == "ny":
    easterndivorce = easterndivorce + 1
elif str(relationship2) == "Divorced" and str(state2) == "MA" or str(relationship2) == "Divorced" and str(state2) == "ma" or str(relationship2) == "divorced" and str(state2) == "MA" or str(relationship2) == "divorced" and str(state2) == "ma":
    easterndivorce = easterndivorce + 1
elif str(relationship2) == "Divorced" and str(state2) == "FL" or str(relationship2) == "Divorced" and str(state2) == "fl" or str(relationship2) == "divorced" and str(state2) == "FL" or str(relationship2) == "divorced" and str(state2) == "fl":
    easterndivorce = easterndivorce + 1
elif str(relationship2) == "Divorced" and str(state2) == "TX" or str(relationship2) == "Divorced" and str(state2) == "tx" or str(relationship2) == "divorced" and str(state2) == "TX" or str(relationship2) == "divorced" and str(state2) == "tx":
    southerndivorce = southerndivorce + 1
elif str(relationship2) == "Divorced" and str(state2) == "AL" or str(relationship2) == "Divorced" and str(state2) == "al" or str(relationship2) == "divorced" and str(state2) == "AL" or str(relationship2) == "divorced" and str(state2) == "al":
    southerndivorce = southerndivorce + 1
elif str(relationship2) == "Divorced" and str(state2) == "GA" or str(relationship2) == "Divorced" and str(state2) == "ga" or str(relationship2) == "divorced" and str(state2) == "GA" or str(relationship2) == "divorced" and str(state2) == "ga":
    southerndivorce = southerndivorce + 1
elif str(relationship2) == "Separated" and str(state2) == "CA" or str(relationship2) == "Separated" and str(state2) == "ca" or str(relationship2) == "separated" and str(state2) == "CA" or str(relationship2) == "separated" and str(state2) == "ca": 
    westernseparated = westernseparated + 1
elif str(relationship2) == "Separated" and str(state2) == "NV" or str(relationship2) == "Separated" and str(state2) == "nv" or str(relationship2) == "separated" and str(state2) == "NV" or str(relationship2) == "separated" and str(state2) == "nv":
    westernseparated = westernseparated + 1
elif str(relationship2) == "Separated" and str(state2) == "AR" or str(relationship2) == "Separated" and str(state2) == "ar" or str(relationship2) == "separated" and str(state2) == "AR" or str(relationship2) == "separated" and str(state2) == "ar":
    westernseparated = westernseparated + 1
elif str(relationship2) == "Separated" and str(state2) == "WA" or str(relationship2) == "Separated" and str(state2) == "wa" or str(relationship2) == "separated" and str(state2) == "WA" or str(relationship2) == "separated" and str(state2) == "wa":
    westernseparated = westernseparated + 1
elif str(relationship2) == "Separated" and str(state2) == "NY" or str(relationship2) == "Separated" and str(state2) == "ny" or str(relationship2) == "separated" and str(state2) == "NY" or str(relationship2) == "separated" and str(state2) == "ny":
    easternseparated = easternseparated + 1
elif str(relationship2) == "Separated" and str(state2) == "MA" or str(relationship2) == "Separated" and str(state2) == "ma" or str(relationship2) == "separated" and str(state2) == "MA" or str(relationship2) == "separated" and str(state2) == "ma":
    easternseparated = easternseparated + 1
elif str(relationship2) == "Separated" and str(state2) == "FL" or str(relationship2) == "Separated" and str(state2) == "fl" or str(relationship2) == "separated" and str(state2) == "FL" or str(relationship2) == "separated" and str(state2) == "fl":
    easternseparated = easternseparated + 1
elif str(relationship2) == "Separated" and str(state2) == "TX" or str(relationship2) == "Separated" and str(state2) == "tx" or str(relationship2) == "separated" and str(state2) == "TX" or str(relationship2) == "separated" and str(state2) == "tx":
    southernseparated = southernseparated + 1 
elif str(relationship2) == "Separated" and str(state2) == "AL" or str(relationship2) == "Separated" and str(state2) == "al" or str(relationship2) == "separated" and str(state2) == "AL" or str(relationship2) == "separated" and str(state2) == "al":
    southernseparated = southernseparated + 1 
elif str(relationship2) == "Separated" and str(state2) == "GA" or str(relationship2) == "Separated" and str(state2) == "ga" or str(relationship2) == "separated" and str(state2) == "GA" or str(relationship2) == "separated" and str(state2) == "ga":
    southernseparated = southernseparated + 1 
else:
    print("The person is not counted towards any marital group ")


state3 = input("please enter the state where the third person resides :")
if str(state3) == "CA" or str(state3) == "ca" or str(state3) == "NV" or str(state3) == "nv" or str(state3) == "AR" or str(state3) == "ar" or str(state3) == "WA" or str(state3) == "wa":
    westernregion = westernregion + 1
elif str(state3) == "NY" or str(state3) == "ny" or str(state3) == "MA" or str(state3) == "ma" or str(state3) == "FL" or str(state3) == "fl":
    easternregion = easternregion + 1
elif str(state3) == "TX" or str(state3) == "tx" or str(state3) == "AL" or str(state3) == "al" or str(state3) == "GA" or str(state3) == "ga":
    southernregion = southernregion + 1
else:
    print("The person is not counted towards Any of the following states. TX, AL, GA, NY, MA, FL, CA, NV, AR or WA")

relationship3 = input("Please enter marital status of third person :")
if str(relationship3) == "Married" and str(state3) == "CA" or str(relationship3) == "Married" and str(state3) == "ca" or str(relationship3) == "married" and str(state3) == "CA" or str(relationship3) == "married" and str(state3) == "ca":
    westernmarried = westernmarried + 1
elif str(relationship3) == "Married" and str(state3) == "NV" or str(relationship3) == "Married" and str(state3) == "nv" or str(relationship3) == "married" and str(state3) == "NV" or str(relationship3) == "married" and str(state3) == "nv":
    westernmarried = westernmarried + 1 
elif str(relationship3) == "Married" and str(state3) == "AR" or str(relationship3) == "Married" and str(state3) == "ar" or str(relationship3) == "married" and str(state3) == "AR" or str(relationship3) == "married" and str(state3) == "ar":
    westernmarried = westernmarried + 1
elif str(relationship3) == "Married" and str(state3) == "WA" or str(relationship3) == "Married" and str(state3) == "wa" or str(relationship3) == "married" and str(state3) == "WA" or str(relationship3) == "married" and str(state3) == "wa":
    westernmarried = westernmarried + 1
elif str(relationship3) == "Married" and str(state3) == "NY" or str(relationship3) == "Married" and str(state3) == "ny" or str(relationship3) == "married" and str(state3) == "NY"  or str(relationship3) == "married" and str(state3) == "ny":
    esternmarried = easternmarried + 1
elif str(relationship3) == "Married" and str(state3) == "MA" or str(relationship3) == "Married" and str(state3) == "ma" or str(relationship3) == "married" and str(state3) == "MA" or str(relationship3) == "married" and str(state3) =="ma":
    easternmarried = easternmarried + 1
elif str(relationship3) == "Married" and str(state3) == "FL" or str(relationship3) == "Married" and str(state3) == "fl" or str(relationship3) == "married" and str(state3) == "Fl" or str(relationship3) == "married" and str(state3) == "fl":
    easternmarried = easternmarried + 1
elif str(relationship3) == "Married" and str(state3) == "TX" or str(relationship3) == "Married" and str(state3) == "tx" or str(relationship3) == "married" and str(state3) == "TX" or str(relationship3) == "married" and str(state3) == "tx":
    southernmarried = southernmarried + 1
elif str(relationship3) == "Married" and str(state3) == "AL" or str(relationship3) == "Married" and str(state3) == "al" or str(relationship3) == "married" and str(state3) == "AL" or str(relationship3) == "married" and str(state3) == "al":
    southernmarried = southernmarried + 1
elif str(relationship3) == "Married" and str(state3) == "GA" or str(relationship3) == "Married" and str(state3) == "ga" or str(relationship3) == "married" and str(state3) == "GA" or str(relationship3) == "married" and str(state3) == "ga":
    southernmarried = southernmarried + 1
elif str(relationship3) == "Single" and str(state3) == "CA" or str(relationship3) == "Single" and str(state3) == "ca" or str(relationship3) == "single" and str(state3) == "CA" or str(relationship3) == "single" and str(state3) == "ca":
    westernsingle = westernsingle + 1
elif str(relationship3) == "Single" and str(state3) == "NV" or str(relationship3) == "Single" and str(state3) == "nv" or str(relationship3) == "single" and str(state3) == "NV" or str(relationship3) == "single" and str(state3) == "nv":
    westernsingle = westernsingle + 1
elif str(relationship3) == "Single" and str(state3) == "AR" or str(relationship3) == "Single" and str(state3) == "ar" or str(relationship3) == "single" and str(state3) == "AR" or str(relationship3) == "single" and str(state3) == "ar":
    westernsingle = westernsingle + 1
elif str(relationship3) == "Single" and str(state3) == "WA" or str(relationship3) == "Single" and str(state3) == "wa" or str(relationship3) == "single" and str(state3) == "AR" or str(relationship3) == "single" and str(state3) == "ar":
    westernsingle = westernsingle + 1 
elif str(relationship3) == "Single" and str(state3) == "NY" or str(relationship3) == "Single" and str(state3) == "ny" or str(relationship3) == "single" and str(state3) == "NY" or str(relationship3) == "single" and str(state3) == "ny":
    easternsingle = easternsingle + 1
elif str(relationship3) == "Single" and str(state3) == "MA" or str(relationship3) == "Single" and str(state3) == "ma" or str(relationship3) == "single" and str(state3) == "MA" or str(relationship3) == "single" and str(state3) == "ma":
    easternsingle = easternsingle + 1
elif str(relationship3) == "Single" and str(state3) == "FL" or str(relationship3) == "Single" and str(state3) == "fl" or str(relationship3) == "single" and str(state3) == "FL" or str(relationship3) == "single" and str(state3) == "fl":
    easternsingle = easternsingle + 1
elif str(relationship3) == "Single" and str(state3) == "TX" or str(relationship3) == "Single" and str(state3) == "tx" or str(relationship3) == "single" and str(state3) == "TX" or str(relationship3) == "single" and str(state3) == "tx":
    southernsingle = southernsingle + 1 
elif str(relationship3) == "Single" and str(state3) == "AL" or str(relationship3) == "Single" and str(state3) == "al" or str(relationship3) == "single" and str(state3) == "AL" or str(relationship3) == "single" and str(state3) == "al":
    southernsingle = southernsingle + 1
elif str(relationship3) == "Single" and str(state3) == "GA" or str(relationship3) == "Single" and str(state3) == "ga" or str(relationship3) == "single" and str(state3) == "GA" or str(relationship3)== "single" and str(state3) == "ga":
    southernsingle = southernsingle + 1
elif str(relationship3) == "Divorced" and str(state3) == "CA" or str(relationship3) == "Divorced" and str(state3) == "ca" or str(relationship3) == "divorced" and str(state3) == "CA" or str(relationship3) =="divorced" and str(state3) == "ca":
    westerndivorce = westerndivorce + 1
elif str(relationship3) == "Divorced" and str(state3) == "NV" or str(relationship3) == "Divorced" and str(state3) == "nv" or str(relationship3) == "divorced" and str(state3) ==" NV" or str(relationship3) == "divorced" and str(state3) == "nv":
    westerndivorce = westerndivorce + 1
elif str(relationship3) == "Divorced" and str(state3) == "AR" or str(relationship3) == "Divorced" and str(state3) == "ar" or str(relationship3) == "divorced" and str(state3) == "AR" or str(relationship3) == "divorced" and str(state3) == "ar":
    westerndivorce = westerndivorce + 1
elif str(relationship3) == "Divorced" and str(state3) == "WA" or str(relationship3) == "Divorced" and str(state3) == "wa" or str(relationship3) == "divorced" and str(state3) == "WA" or str(relationship3) == "divorced" and str(state3) == "wa":
    westerndivorce = westerndivorce + 1 
elif str(relationship3) == "Divorced" and str(state3) == "NY" or str(relationship3) == "Divorced" and str(state3) == "ny" or str(relationship3) == "divorced" and str(state3) == "NY" or str(relationship3) == "divroced" and str(state3) == "ny":
    easterndivorce = easterndivorce + 1
elif str(relationship3) == "Divorced" and str(state3) == "MA" or str(relationship3) == "Divorced" and str(state3) == "ma" or str(relationship3) == "divorced" and str(state3) == "MA" or str(relationship3) == "divorced" and str(state3) == "ma":
    easterndivorce = easterndivorce + 1
elif str(relationship3) == "Divorced" and str(state3) == "FL" or str(relationship3) == "Divorced" and str(state3) == "fl" or str(relationship3) == "divorced" and str(state3) == "FL" or str(relationship3) == "divorced" and str(state3) == "fl":
    easterndivorce = easterndivorce + 1
elif str(relationship3) == "Divorced" and str(state3) == "TX" or str(relationship3) == "Divorced" and str(state3) == "tx" or str(relationship3) == "divorced" and str(state3) == "TX" or str(relationship3) == "divorced" and str(state3) == "tx":
    southerndivorce = southerndivorce + 1
elif str(relationship3) == "Divorced" and str(state3) == "AL" or str(relationship3) == "Divorced" and str(state3) == "al" or str(relationship3) == "divorced" and str(state3) == "AL" or str(relationship3) == "divorced" and str(state3) == "al":
    southerndivorce = southerndivorce + 1
elif str(relationship3) == "Divorced" and str(state3) == "GA" or str(relationship3) == "Divorced" and str(state3) == "ga" or str(relationship3) == "divorced" and str(state3) == "GA" or str(relationship3) == "divorced" and str(state3) == "ga":
    southerndivorce = southerndivorce + 1
elif str(relationship3) == "Separated" and str(state3) == "CA" or str(relationship3) == "Separated" and str(state3) == "ca" or str(relationship3) == "separated" and str(state3) == "CA" or str(relationship3) == "separated" and str(state3) == "ca": 
    westernseparated = westernseparated + 1
elif str(relationship3) == "Separated" and str(state3) == "NV" or str(relationship3) == "Separated" and str(state3) == "nv" or str(relationship3) == "separated" and str(state3) == "NV" or str(relationship3) == "separated" and str(state3) == "nv":
    westernseparated = westernseparated + 1
elif str(relationship3) == "Separated" and str(state3) == "AR" or str(relationship3) == "Separated" and str(state3) == "ar" or str(relationship3) == "separated" and str(state3) == "AR" or str(relationship3) == "separated" and str(state3) == "ar":
    westernseparated = westernseparated + 1
elif str(relationship3) == "Separated" and str(state3) == "WA" or str(relationship3) == "Separated" and str(state3) == "wa" or str(relationship3) == "separated" and str(state3) == "WA" or str(relationship3) == "separated" and str(state3) == "wa":
    westernseparated = westernseparated + 1
elif str(relationship3) == "Separated" and str(state3) == "NY" or str(relationship3) == "Separated" and str(state3) == "ny" or str(relationship3) == "separated" and str(state3) == "NY" or str(relationship3) == "separated" and str(state3) == "ny":
    easternseparated = easternseparated + 1
elif str(relationship3) == "Separated" and str(state3) == "MA" or str(relationship3) == "Separated" and str(state3) == "ma" or str(relationship3) == "separated" and str(state3) == "MA" or str(relationship3) == "separated" and str(state3) == "ma":
    easternseparated = easternseparated + 1
elif str(relationship3) == "Separated" and str(state3) == "FL" or str(relationship3) == "Separated" and str(state3) == "fl" or str(relationship3) == "separated" and str(state3) == "FL" or str(relationship3) == "separated" and str(state3) == "fl":
    easternseparated = easternseparated + 1
elif str(relationship3) == "Separated" and str(state3) == "TX" or str(relationship3) == "Separated" and str(state3) == "tx" or str(relationship3) == "separated" and str(state3) == "TX" or str(relationship3) == "separated" and str(state3) == "tx":
    southernseparated = southernseparated + 1 
elif str(relationship3) == "Separated" and str(state3) == "AL" or str(relationship3) == "Separated" and str(state3) == "al" or str(relationship3) == "separated" and str(state3) == "AL" or str(relationship3) == "separated" and str(state3) == "al":
    southernseparated = southernseparated + 1 
elif str(relationship3) == "Separated" and str(state3) == "GA" or str(relationship3) == "Separated" and str(state3) == "ga" or str(relationship3) == "separated" and str(state3) == "GA" or str(relationship3) == "separated" and str(state3) == "ga":
    southernseparated = southernseparated + 1 
else:
    print("The person is not counted towards any marital group ")
    


state4 = input("please enter the state where the fourth person resides :")
if str(state4) == "CA" or str(state4) == "ca" or str(state4) == "NV" or str(state4) == "nv" or str(state4) == "AR" or str(state4) == "ar" or str(state4) == "WA" or str(state4) == "wa":
    westernregion = westernregion + 1
elif str(state4) == "NY" or str(state4) == "ny" or str(state4) == "MA" or str(state4) == "ma" or str(state4) == "FL" or str(state4) == "fl":
    easternregion = easternregion + 1
elif str(state4) == "TX" or str(state4) == "tx" or str(state4) == "AL" or str(state4) == "al" or str(state4) == "GA" or str(state4) == "ga":
    southernregion = southernregion + 1
else:
    print("The person is not counted towards Any of the following states. TX, AL, GA, NY, MA, FL, CA, NV, AR or WA")
    
relationship4 = input("Please enter marital status of fourth person :")
if str(relationship4) == "Married" and str(state4) == "CA" or str(relationship4) == "Married" and str(state4) == "ca" or str(relationship4) == "married" and str(state4) == "CA" or str(relationship4) == "married" and str(state4) == "ca":
    westernmarried = westernmarried + 1
elif str(relationship4) == "Married" and str(state4) == "NV" or str(relationship4) == "Married" and str(state4) == "nv" or str(relationship4) == "married" and str(state4) == "NV" or str(relationship4) == "married" and str(state4) == "nv":
    westernmarried = westernmarried + 1 
elif str(relationship4) == "Married" and str(state4) == "AR" or str(relationship4) == "Married" and str(state4) == "ar" or str(relationship4) == "married" and str(state4) == "AR" or str(relationship4) == "married" and str(state4) == "ar":
    westernmarried = westernmarried + 1
elif str(relationship4) == "Married" and str(state4) == "WA" or str(relationship4) == "Married" and str(state4) == "wa" or str(relationship4) == "married" and str(state4) == "WA" or str(relationship4) == "married" and str(state4) == "wa":
    westernmarried = westernmarried + 1
elif str(relationship4) == "Married" and str(state4) == "NY" or str(relationship4) == "Married" and str(state4) == "ny" or str(relationship4) == "married" and str(state4) == "NY"  or str(relationship4) == "married" and str(state4) == "ny":
    esternmarried = easternmarried + 1
elif str(relationship4) == "Married" and str(state4) == "MA" or str(relationship4) == "Married" and str(state4) == "ma" or str(relationship4) == "married" and str(state4) == "MA" or str(relationship4) == "married" and str(state4) =="ma":
    easternmarried = easternmarried + 1
elif str(relationship4) == "Married" and str(state4) == "FL" or str(relationship4) == "Married" and str(state4) == "fl" or str(relationship4) == "married" and str(state4) == "Fl" or str(relationship4) == "married" and str(state4) == "fl":
    easternmarried = easternmarried + 1
elif str(relationship4) == "Married" and str(state4) == "TX" or str(relationship4) == "Married" and str(state4) == "tx" or str(relationship4) == "married" and str(state4) == "TX" or str(relationship4) == "married" and str(state4) == "tx":
    southernmarried = southernmarried + 1
elif str(relationship4) == "Married" and str(state4) == "AL" or str(relationship4) == "Married" and str(state4) == "al" or str(relationship4) == "married" and str(state4) == "AL" or str(relationship4) == "married" and str(state4) == "al":
    southernmarried = southernmarried + 1
elif str(relationship4) == "Married" and str(state4) == "GA" or str(relationship4) == "Married" and str(state4) == "ga" or str(relationship4) == "married" and str(state4) == "GA" or str(relationship4) == "married" and str(state4) == "ga":
    southernmarried = southernmarried + 1
elif str(relationship4) == "Single" and str(state4) == "CA" or str(relationship4) == "Single" and str(state4) == "ca" or str(relationship4) == "single" and str(state4) == "CA" or str(relationship4) == "single" and str(state4) == "ca":
    westernsingle = westernsingle + 1
elif str(relationship4) == "Single" and str(state4) == "NV" or str(relationship4) == "Single" and str(state4) == "nv" or str(relationship4) == "single" and str(state4) == "NV" or str(relationship4) == "single" and str(state4) == "nv":
    westernsingle = westernsingle + 1
elif str(relationship4) == "Single" and str(state4) == "AR" or str(relationship4) == "Single" and str(state4) == "ar" or str(relationship4) == "single" and str(state4) == "AR" or str(relationship4) == "single" and str(state4) == "ar":
    westernsingle = westernsingle + 1
elif str(relationship4) == "Single" and str(state4) == "WA" or str(relationship4) == "Single" and str(state4) == "wa" or str(relationship4) == "single" and str(state4) == "AR" or str(relationship4) == "single" and str(state4) == "ar":
    westernsingle = westernsingle + 1 
elif str(relationship4) == "Single" and str(state4) == "NY" or str(relationship4) == "Single" and str(state4) == "ny" or str(relationship4) == "single" and str(state4) == "NY" or str(relationship4) == "single" and str(state4) == "ny":
    easternsingle = easternsingle + 1
elif str(relationship4) == "Single" and str(state4) == "MA" or str(relationship4) == "Single" and str(state4) == "ma" or str(relationship4) == "single" and str(state4) == "MA" or str(relationship4) == "single" and str(state4) == "ma":
    easternsingle = easternsingle + 1
elif str(relationship4) == "Single" and str(state4) == "FL" or str(relationship4) == "Single" and str(state4) == "fl" or str(relationship4) == "single" and str(state4) == "FL" or str(relationship4) == "single" and str(state4) == "fl":
    easternsingle = easternsingle + 1
elif str(relationship4) == "Single" and str(state4) == "TX" or str(relationship4) == "Single" and str(state4) == "tx" or str(relationship4) == "single" and str(state4) == "TX" or str(relationship4) == "single" and str(state4) == "tx":
    southernsingle = southernsingle + 1 
elif str(relationship4) == "Single" and str(state4) == "AL" or str(relationship4) == "Single" and str(state4) == "al" or str(relationship4) == "single" and str(state4) == "AL" or str(relationship4) == "single" and str(state4) == "al":
    southernsingle = southernsingle + 1
elif str(relationship4) == "Single" and str(state4) == "GA" or str(relationship4) == "Single" and str(state4) == "ga" or str(relationship4) == "single" and str(state4) == "GA" or str(relationship4)== "single" and str(state4) == "ga":
    southernsingle = southernsingle + 1
elif str(relationship4) == "Divorced" and str(state4) == "CA" or str(relationship4) == "Divorced" and str(state4) == "ca" or str(relationship4) == "divorced" and str(state4) == "CA" or str(relationship4) =="divorced" and str(state4) == "ca":
    westerndivorce = westerndivorce + 1
elif str(relationship4) == "Divorced" and str(state4) == "NV" or str(relationship4) == "Divorced" and str(state4) == "nv" or str(relationship4) == "divorced" and str(state4) ==" NV" or str(relationship4) == "divorced" and str(state4) == "nv":
    westerndivorce = westerndivorce + 1
elif str(relationship4) == "Divorced" and str(state4) == "AR" or str(relationship4) == "Divorced" and str(state4) == "ar" or str(relationship4) == "divorced" and str(state4) == "AR" or str(relationship4) == "divorced" and str(state4) == "ar":
    westerndivorce = westerndivorce + 1
elif str(relationship4) == "Divorced" and str(state4) == "WA" or str(relationship4) == "Divorced" and str(state4) == "wa" or str(relationship4) == "divorced" and str(state4) == "WA" or str(relationship4) == "divorced" and str(state4) == "wa":
    westerndivorce = westerndivorce + 1 
elif str(relationship4) == "Divorced" and str(state4) == "NY" or str(relationship4) == "Divorced" and str(state4) == "ny" or str(relationship4) == "divorced" and str(state4) == "NY" or str(relationship4) == "divroced" and str(state4) == "ny":
    easterndivorce = easterndivorce + 1
elif str(relationship4) == "Divorced" and str(state4) == "MA" or str(relationship4) == "Divorced" and str(state4) == "ma" or str(relationship4) == "divorced" and str(state4) == "MA" or str(relationship4) == "divorced" and str(state4) == "ma":
    easterndivorce = easterndivorce + 1
elif str(relationship4) == "Divorced" and str(state4) == "FL" or str(relationship4) == "Divorced" and str(state4) == "fl" or str(relationship4) == "divorced" and str(state4) == "FL" or str(relationship4) == "divorced" and str(state4) == "fl":
    easterndivorce = easterndivorce + 1
elif str(relationship4) == "Divorced" and str(state4) == "TX" or str(relationship4) == "Divorced" and str(state4) == "tx" or str(relationship4) == "divorced" and str(state4) == "TX" or str(relationship4) == "divorced" and str(state4) == "tx":
    southerndivorce = southerndivorce + 1
elif str(relationship4) == "Divorced" and str(state4) == "AL" or str(relationship4) == "Divorced" and str(state4) == "al" or str(relationship4) == "divorced" and str(state4) == "AL" or str(relationship4) == "divorced" and str(state4) == "al":
    southerndivorce = southerndivorce + 1
elif str(relationship4) == "Divorced" and str(state4) == "GA" or str(relationship4) == "Divorced" and str(state4) == "ga" or str(relationship4) == "divorced" and str(state4) == "GA" or str(relationship4) == "divorced" and str(state4) == "ga":
    southerndivorce = southerndivorce + 1
elif str(relationship4) == "Separated" and str(state4) == "CA" or str(relationship4) == "Separated" and str(state4) == "ca" or str(relationship4) == "separated" and str(state4) == "CA" or str(relationship4) == "separated" and str(state4) == "ca": 
    westernseparated = westernseparated + 1
elif str(relationship4) == "Separated" and str(state4) == "NV" or str(relationship4) == "Separated" and str(state4) == "nv" or str(relationship4) == "separated" and str(state4) == "NV" or str(relationship4) == "separated" and str(state4) == "nv":
    westernseparated = westernseparated + 1
elif str(relationship4) == "Separated" and str(state4) == "AR" or str(relationship4) == "Separated" and str(state4) == "ar" or str(relationship4) == "separated" and str(state4) == "AR" or str(relationship4) == "separated" and str(state4) == "ar":
    westernseparated = westernseparated + 1
elif str(relationship4) == "Separated" and str(state4) == "WA" or str(relationship4) == "Separated" and str(state4) == "wa" or str(relationship4) == "separated" and str(state4) == "WA" or str(relationship4) == "separated" and str(state4) == "wa":
    westernseparated = westernseparated + 1
elif str(relationship4) == "Separated" and str(state4) == "NY" or str(relationship4) == "Separated" and str(state4) == "ny" or str(relationship4) == "separated" and str(state4) == "NY" or str(relationship4) == "separated" and str(state4) == "ny":
    easternseparated = easternseparated + 1
elif str(relationship4) == "Separated" and str(state4) == "MA" or str(relationship4) == "Separated" and str(state4) == "ma" or str(relationship4) == "separated" and str(state4) == "MA" or str(relationship4) == "separated" and str(state4) == "ma":
    easternseparated = easternseparated + 1
elif str(relationship4) == "Separated" and str(state4) == "FL" or str(relationship4) == "Separated" and str(state4) == "fl" or str(relationship4) == "separated" and str(state4) == "FL" or str(relationship4) == "separated" and str(state4) == "fl":
    easternseparated = easternseparated + 1
elif str(relationship4) == "Separated" and str(state4) == "TX" or str(relationship4) == "Separated" and str(state4) == "tx" or str(relationship4) == "separated" and str(state4) == "TX" or str(relationship4) == "separated" and str(state4) == "tx":
    southernseparated = southernseparated + 1 
elif str(relationship4) == "Separated" and str(state4) == "AL" or str(relationship4) == "Separated" and str(state4) == "al" or str(relationship4) == "separated" and str(state4) == "AL" or str(relationship4) == "separated" and str(state4) == "al":
    southernseparated = southernseparated + 1 
elif str(relationship4) == "Separated" and str(state4) == "GA" or str(relationship4) == "Separated" and str(state4) == "ga" or str(relationship4) == "separated" and str(state4) == "GA" or str(relationship4) == "separated" and str(state4) == "ga":
    southernseparated = southernseparated + 1 
else:
    print("The person is not counted towards any marital group ")

state5 = input("please enter the state where the fifth person resides :")
if str(state5) == "CA" or str(state5) == "ca" or str(state5) == "NV" or str(state5) == "nv" or str(state5) == "AR" or str(state5) == "ar" or str(state5) == "WA" or str(state5) == "wa":
    westernregion = westernregion + 1
elif str(state5) == "NY" or str(state5) == "ny" or str(state5) == "MA" or str(state5) == "ma" or str(state5) == "FL" or str(state5) == "fl":
    easternregion = easternregion + 1
elif str(state5) == "TX" or str(state5) == "tx" or str(state5) == "AL" or str(state5) == "al" or str(state5) == "GA" or str(state5) == "ga":
    southernregion = southernregion + 1
else:
    print("The person is not counted towards Any of the following states. TX, AL, GA, NY, MA, FL, CA, NV, AR or WA")

relationship5 = input("Please enter marital status of fifth person :")
if str(relationship5) == "Married" and str(state5) == "CA" or str(relationship5) == "Married" and str(state5) == "ca" or str(relationship5) == "married" and str(state5) == "CA" or str(relationship5) == "married" and str(state5) == "ca":
    westernmarried = westernmarried + 1
elif str(relationship5) == "Married" and str(state5) == "NV" or str(relationship5) == "Married" and str(state5) == "nv" or str(relationship5) == "married" and str(state5) == "NV" or str(relationship5) == "married" and str(state5) == "nv":
    westernmarried = westernmarried + 1 
elif str(relationship5) == "Married" and str(state5) == "AR" or str(relationship5) == "Married" and str(state5) == "ar" or str(relationship5) == "married" and str(state5) == "AR" or str(relationship5) == "married" and str(state5) == "ar":
    westernmarried = westernmarried + 1
elif str(relationship5) == "Married" and str(state5) == "WA" or str(relationship5) == "Married" and str(state5) == "wa" or str(relationship5) == "married" and str(state5) == "WA" or str(relationship5) == "married" and str(state5) == "wa":
    westernmarried = westernmarried + 1
elif str(relationship5) == "Married" and str(state5) == "NY" or str(relationship5) == "Married" and str(state5) == "ny" or str(relationship5) == "married" and str(state5) == "NY"  or str(relationship5) == "married" and str(state5) == "ny":
    esternmarried = easternmarried + 1
elif str(relationship5) == "Married" and str(state5) == "MA" or str(relationship5) == "Married" and str(state5) == "ma" or str(relationship5) == "married" and str(state5) == "MA" or str(relationship5) == "married" and str(state5) =="ma":
    easternmarried = easternmarried + 1
elif str(relationship5) == "Married" and str(state5) == "FL" or str(relationship5) == "Married" and str(state5) == "fl" or str(relationship5) == "married" and str(state5) == "Fl" or str(relationship5) == "married" and str(state5) == "fl":
    easternmarried = easternmarried + 1
elif str(relationship5) == "Married" and str(state5) == "TX" or str(relationship5) == "Married" and str(state5) == "tx" or str(relationship5) == "married" and str(state5) == "TX" or str(relationship5) == "married" and str(state5) == "tx":
    southernmarried = southernmarried + 1
elif str(relationship5) == "Married" and str(state5) == "AL" or str(relationship5) == "Married" and str(state5) == "al" or str(relationship5) == "married" and str(state5) == "AL" or str(relationship5) == "married" and str(state5) == "al":
    southernmarried = southernmarried + 1
elif str(relationship5) == "Married" and str(state5) == "GA" or str(relationship5) == "Married" and str(state5) == "ga" or str(relationship5) == "married" and str(state5) == "GA" or str(relationship5) == "married" and str(state5) == "ga":
    southernmarried = southernmarried + 1
elif str(relationship5) == "Single" and str(state5) == "CA" or str(relationship5) == "Single" and str(state5) == "ca" or str(relationship5) == "single" and str(state5) == "CA" or str(relationship5) == "single" and str(state5) == "ca":
    westernsingle = westernsingle + 1
elif str(relationship5) == "Single" and str(state5) == "NV" or str(relationship5) == "Single" and str(state5) == "nv" or str(relationship5) == "single" and str(state5) == "NV" or str(relationship5) == "single" and str(state5) == "nv":
    westernsingle = westernsingle + 1
elif str(relationship5) == "Single" and str(state5) == "AR" or str(relationship5) == "Single" and str(state5) == "ar" or str(relationship5) == "single" and str(state5) == "AR" or str(relationship5) == "single" and str(state5) == "ar":
    westernsingle = westernsingle + 1
elif str(relationship5) == "Single" and str(state5) == "WA" or str(relationship5) == "Single" and str(state5) == "wa" or str(relationship5) == "single" and str(state5) == "AR" or str(relationship5) == "single" and str(state5) == "ar":
    westernsingle = westernsingle + 1 
elif str(relationship5) == "Single" and str(state5) == "NY" or str(relationship5) == "Single" and str(state5) == "ny" or str(relationship5) == "single" and str(state5) == "NY" or str(relationship5) == "single" and str(state5) == "ny":
    easternsingle = easternsingle + 1
elif str(relationship5) == "Single" and str(state5) == "MA" or str(relationship5) == "Single" and str(state5) == "ma" or str(relationship5) == "single" and str(state5) == "MA" or str(relationship5) == "single" and str(state5) == "ma":
    easternsingle = easternsingle + 1
elif str(relationship5) == "Single" and str(state5) == "FL" or str(relationship5) == "Single" and str(state5) == "fl" or str(relationship5) == "single" and str(state5) == "FL" or str(relationship5) == "single" and str(state5) == "fl":
    easternsingle = easternsingle + 1
elif str(relationship5) == "Single" and str(state5) == "TX" or str(relationship5) == "Single" and str(state5) == "tx" or str(relationship5) == "single" and str(state5) == "TX" or str(relationship5) == "single" and str(state5) == "tx":
    southernsingle = southernsingle + 1 
elif str(relationship5) == "Single" and str(state5) == "AL" or str(relationship5) == "Single" and str(state5) == "al" or str(relationship5) == "single" and str(state5) == "AL" or str(relationship5) == "single" and str(state5) == "al":
    southernsingle = southernsingle + 1
elif str(relationship5) == "Single" and str(state5) == "GA" or str(relationship5) == "Single" and str(state5) == "ga" or str(relationship5) == "single" and str(state5) == "GA" or str(relationship5)== "single" and str(state5) == "ga":
    southernsingle = southernsingle + 1
elif str(relationship5) == "Divorced" and str(state5) == "CA" or str(relationship5) == "Divorced" and str(state5) == "ca" or str(relationship5) == "divorced" and str(state5) == "CA" or str(relationship5) =="divorced" and str(state5) == "ca":
    westerndivorce = westerndivorce + 1
elif str(relationship5) == "Divorced" and str(state5) == "NV" or str(relationship5) == "Divorced" and str(state5) == "nv" or str(relationship5) == "divorced" and str(state5) ==" NV" or str(relationship5) == "divorced" and str(state5) == "nv":
    westerndivorce = westerndivorce + 1
elif str(relationship5) == "Divorced" and str(state5) == "AR" or str(relationship5) == "Divorced" and str(state5) == "ar" or str(relationship5) == "divorced" and str(state5) == "AR" or str(relationship5) == "divorced" and str(state5) == "ar":
    westerndivorce = westerndivorce + 1
elif str(relationship5) == "Divorced" and str(state5) == "WA" or str(relationship5) == "Divorced" and str(state5) == "wa" or str(relationship5) == "divorced" and str(state5) == "WA" or str(relationship5) == "divorced" and str(state5) == "wa":
    westerndivorce = westerndivorce + 1 
elif str(relationship5) == "Divorced" and str(state5) == "NY" or str(relationship5) == "Divorced" and str(state5) == "ny" or str(relationship5) == "divorced" and str(state5) == "NY" or str(relationship5) == "divroced" and str(state5) == "ny":
    easterndivorce = easterndivorce + 1
elif str(relationship5) == "Divorced" and str(state5) == "MA" or str(relationship5) == "Divorced" and str(state5) == "ma" or str(relationship5) == "divorced" and str(state5) == "MA" or str(relationship5) == "divorced" and str(state5) == "ma":
    easterndivorce = easterndivorce + 1
elif str(relationship5) == "Divorced" and str(state5) == "FL" or str(relationship5) == "Divorced" and str(state5) == "fl" or str(relationship5) == "divorced" and str(state5) == "FL" or str(relationship5) == "divorced" and str(state5) == "fl":
    easterndivorce = easterndivorce + 1
elif str(relationship5) == "Divorced" and str(state5) == "TX" or str(relationship5) == "Divorced" and str(state5) == "tx" or str(relationship5) == "divorced" and str(state5) == "TX" or str(relationship5) == "divorced" and str(state5) == "tx":
    southerndivorce = southerndivorce + 1
elif str(relationship5) == "Divorced" and str(state5) == "AL" or str(relationship5) == "Divorced" and str(state5) == "al" or str(relationship5) == "divorced" and str(state5) == "AL" or str(relationship5) == "divorced" and str(state5) == "al":
    southerndivorce = southerndivorce + 1
elif str(relationship5) == "Divorced" and str(state5) == "GA" or str(relationship5) == "Divorced" and str(state5) == "ga" or str(relationship5) == "divorced" and str(state5) == "GA" or str(relationship5) == "divorced" and str(state5) == "ga":
    southerndivorce = southerndivorce + 1
elif str(relationship5) == "Separated" and str(state5) == "CA" or str(relationship5) == "Separated" and str(state5) == "ca" or str(relationship5) == "separated" and str(state5) == "CA" or str(relationship5) == "separated" and str(state5) == "ca": 
    westernseparated = westernseparated + 1
elif str(relationship5) == "Separated" and str(state5) == "NV" or str(relationship5) == "Separated" and str(state5) == "nv" or str(relationship5) == "separated" and str(state5) == "NV" or str(relationship5) == "separated" and str(state5) == "nv":
    westernseparated = westernseparated + 1
elif str(relationship5) == "Separated" and str(state5) == "AR" or str(relationship5) == "Separated" and str(state5) == "ar" or str(relationship5) == "separated" and str(state5) == "AR" or str(relationship5) == "separated" and str(state5) == "ar":
    westernseparated = westernseparated + 1
elif str(relationship5) == "Separated" and str(state5) == "WA" or str(relationship5) == "Separated" and str(state5) == "wa" or str(relationship5) == "separated" and str(state5) == "WA" or str(relationship5) == "separated" and str(state5) == "wa":
    westernseparated = westernseparated + 1
elif str(relationship5) == "Separated" and str(state5) == "NY" or str(relationship5) == "Separated" and str(state5) == "ny" or str(relationship5) == "separated" and str(state5) == "NY" or str(relationship5) == "separated" and str(state5) == "ny":
    easternseparated = easternseparated + 1
elif str(relationship5) == "Separated" and str(state5) == "MA" or str(relationship5) == "Separated" and str(state5) == "ma" or str(relationship5) == "separated" and str(state5) == "MA" or str(relationship5) == "separated" and str(state5) == "ma":
    easternseparated = easternseparated + 1
elif str(relationship5) == "Separated" and str(state5) == "FL" or str(relationship5) == "Separated" and str(state5) == "fl" or str(relationship5) == "separated" and str(state5) == "FL" or str(relationship5) == "separated" and str(state5) == "fl":
    easternseparated = easternseparated + 1
elif str(relationship5) == "Separated" and str(state5) == "TX" or str(relationship5) == "Separated" and str(state5) == "tx" or str(relationship5) == "separated" and str(state5) == "TX" or str(relationship5) == "separated" and str(state5) == "tx":
    southernseparated = southernseparated + 1 
elif str(relationship5) == "Separated" and str(state5) == "AL" or str(relationship5) == "Separated" and str(state5) == "al" or str(relationship5) == "separated" and str(state5) == "AL" or str(relationship5) == "separated" and str(state5) == "al":
    southernseparated = southernseparated + 1 
elif str(relationship5) == "Separated" and str(state5) == "GA" or str(relationship5) == "Separated" and str(state5) == "ga" or str(relationship5) == "separated" and str(state5) == "GA" or str(relationship5) == "separated" and str(state5) == "ga":
    southernseparated = southernseparated + 1 
else:
    print("The person is not counted towards any marital group ")
print("***************************************************************************************")
print("The number of people who belong to Western region is :" + str(westernregion))
print("The number of people who are married in Western region is :" + str(westernmarried))
print("The number of people who are single in Western region is :" + str(westernsingle))
print("The number of people who are divorced in Western region is :" + str(westerndivorce))
print("The number of people who are separated in Western region is :" + str(westernseparated))
print("*****")
print("The number of people who belong to Eastern region is :" +str(easternregion))
print("The number of people who are married in Eastern region is :" + str(easternmarried))
print("The number of people who are single in Eastern region is :" + str(easternsingle))
print("The number of people who are divorced in Eastern region is :" + str(easterndivorce))
print("The number of people who are separated in Eastern region is :" + str(easternseparated))
print("*****")
print("The number of people who belong to Soutern region is:" + str(southernregion))
print("The number of people who are married in Soutern region is :" + str(southernmarried))
print("The number of people who are single in Soutern region is :" + str(southernsingle))
print("The number of people who are divorced in Soutern region is :" + str(southerndivorce))
print("The number of people who are separated in Soutern region is :" + str(southernseparated))
print("*****")