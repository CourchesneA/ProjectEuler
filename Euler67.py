with open('triangledata.txt','r') as myfile:
    values = myfile.read().rstrip()
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
