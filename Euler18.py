values = """75
 95 64
 17 47 82
 18 35 87 10
 20 04 82 47 65
 19 01 23 75 03 34
 88 02 77 73 07 63 67
 99 65 04 28 06 16 70 92
 41 41 26 56 83 40 80 70 33
 41 48 72 33 47 32 37 16 94 29
 53 71 44 65 25 43 91 52 97 51 14
 70 11 33 28 77 73 17 78 39 68 17 57
 91 71 52 38 17 14 91 43 58 50 27 29 48
 63 66 04 68 89 53 67 30 73 16 69 87 40 31
 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23"""

container = values.split("\n") # list of rows
#print ', '.join(container)

i = 0
for row in container: #split each row string in lists
    row = row.split()
    intRow = [int(elem) for elem in row]
    container[i] = intRow
    i+=1

nbRows = 15 #each row has as many elements as its number

#Reduce the triangle, remove the last row
for row_index in range(len(container)-1,0,-1): #Iterate through the rows, starting from the second from bottom
    for elem_index in range(0,row_index):
        sub1 = container[row_index][elem_index]  
        sub2 = container[row_index][elem_index+1]
        container[row_index-1][elem_index] += sub1 if sub1 > sub2 else sub2
print container[0]
