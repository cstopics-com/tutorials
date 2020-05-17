listOne = [1,2,3,4,5,6]
print("List one")
print(listOne)
listTwo = [10,20,30,40,50,60]
print("List two")
print(listTwo)
listThree = list()

oddElements = listOne[1::2]
print("Element at odd-index positions from list one")
print(oddElements)

evenElements = listTwo[0::2]
print("Element at even-index positions from list two")
print(evenElements)

print("Printing Final third list")
listThree = oddElements + evenElements

print(listThree)