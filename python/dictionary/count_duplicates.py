
def count_duplicates(d):
    vals = set()
    sum = 0
    for (key, value) in d.items():
        if (value in vals):
            sum += 1
        else:
            vals.add(value)
    return sum

d = {'key1': 'val1', 'key2': 'val1', 'key3': 'val2', 'key4': 'val2', 'key5': 'val2'}
print("count_duplicates  ", count_duplicates(d))