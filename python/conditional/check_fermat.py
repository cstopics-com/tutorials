def check_fermat(a, b, c, n):
    if n > 2 and (a**n + b**n == c**n):
        print("Fermat was wrong!")
    else:
        print("No, that doesn’t work.")

def check_numbers():
    a = int(input("Choose a number for a: "))
    b = int(input("Choose a number for b: "))
    c = int(input("Choose a number for c: "))
    n = int(input("Choose a number for n: "))
    return check_fermat(a, b, c, n)

check_numbers()