century = [x+1900 for x in range(0,101)]
months = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
targetCount = 0
dayCount = 1
for year in century:
    isLeapYear = True if (year % 4 == 0 and not ( year % 100 == 0 and year % 400 != 0 )) else False
    cmonths = months
    cmonths[1] = 29 if isLeapYear else 28
    
    for month in cmonths:
        for i in range(1,month+1):
            if (i == 1 and dayCount % 7 == 6 and year > 1900):
                print "> year %d" % year
                targetCount+=1
            dayCount+=1

print targetCount

