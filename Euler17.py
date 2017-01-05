import sys
import math

sys.setrecursionlimit(1200)

def test(x):
    print("test function")
    return


def printNumbers(num):
    if (num == 0 ):
        return 0 #Base case
    if (num == 1000):
        print("onethousand "+str(len("onethousand")))
        return len("onethousand")+printNumbers(num-1)
    hundred = 0
    tens = 0
    units = 0
    if (num > 99):
        hundred = int(math.floor(num/100))
    if (num > 9):
        tens = int(math.floor(num/10) % 10 )
    units = int( num % 10 )

    # Independent digits sets, start print code
    # Handling less than 100 in  the next 2 blocks
    if (tens < 2): #get special syntax
        val = int(str(tens)+str(units)) #get value of 2 last digits
        s = smallToString(val)
    else:
        s = tensToString(tens)+unitsToString(units)

    #Handling hundreds
    if(hundred != 0):
        hval = unitsToString(hundred)
        if(tens == 0 and units == 0):
            s = hval+"hundred"
        else:
            s =hval+"hundred"+"and"+s 
    print(s) + " " + str(len(s))
    return len(s)+printNumbers(num-1)

def smallToString(num):
    if(num < 0 or num > 19):
        raise ValueError(str(num)+': Not a little number')
    return {
        0:'',
        1:'one',
        2:'two',
        3:'three',
        4:'four',
        5:'five',
        6:'six',
        7:'seven',
        8:'eight',
        9:'nine',
        10:'ten',
        11:'eleven',
        12:'twelve',
        13:'thirteen',
        14:'fourteen',
        15:'fifteen',
        16:'sixteen',
        17:'seventeen',
        18:'eighteen',
        19:'nineteen'
    }[num]

def tensToString(tens):
    if(tens < 0 or tens > 9 ):
        raise ValueError(str(ten)+'is not one digit')
    elif(tens == 1):
        raise ValueError("Use special syntax for tens value of 1")
    return {
        2:'twenty',
        3:'thirty',
        4:'forty',
        5:'fifty',
        6:'sixty',
        7:'seventy',
        8:'eighty',
        9:'ninety'
    }[tens]

def unitsToString(units):
    if(units < 0 or units > 9):
        raise ValueError(str(units)+ 'is not one digit')
    return smallToString(units)

print("Answer: "+str(printNumbers(1000)))
