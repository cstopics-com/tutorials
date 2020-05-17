def middle(t):
    print("Array ", t)
    if len(t)>1:
        t.pop(0)
        t.pop()
    elif len(t)>0:
        t.pop()
    print("Middle of Array ",t)

n = int(input("Size of array: "))
arr = []
for _ in range(n):
    arr.append(int(input("Array Element: ")))

middle(arr)