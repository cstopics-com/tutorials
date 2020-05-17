
def nested_sum(t):
    sum = 0
    for a in t:
        for b in a:
            sum += b
    print("SUM: %d" % sum)

t = [[1, 2], [3], [4, 5, 6]]
nested_sum(t)