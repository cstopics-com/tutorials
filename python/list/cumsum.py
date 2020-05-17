
def cumsum(t):
    nt =[]
    for i in range(len(t)):
        sum = 0
        for j in range(i+1):
            sum += t[j]
        nt.append(sum)
    print("Array:", t)
    print("CumSum Array:",nt)

n = int(input("Size of array: "))
arr = []
for _ in range(n):
    arr.append(int(input("Array Element: ")))

cumsum(arr)