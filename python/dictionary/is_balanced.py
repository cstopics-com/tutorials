def is_balanced(d):
    sum=0
    for (key, value) in d.items():
        if key == 'R':
            sum += value
        elif key == 'G':
            sum += value
        elif key == 'B':
            sum += value
    if sum == 1:
        return True
    else:
        return False

d = {'R':0.2,'G':0.2,'B':0.6}
print("is_balanced:  ", is_balanced(d))