def s2ins2(s1, s2):
    middleIndex = int(len(s1) / 2)
    print("Original Strings are", s1, s2)
    middleThree = s1[:middleIndex] + s2 + s1[middleIndex:]
    print("After appending new string in middle", middleThree)

s1 = str(input("Enter S1: "))
s2 = str(input("Enter S2: "))
s2ins2(s1, s2)