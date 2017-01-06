def fact(x):
    if x == 1 :
        return 1
    return x*fact(x-1)

target = 0
for digit in str(fact(100)):
    target+=int(digit)

print target
