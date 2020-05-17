def triangle1(n):
    # Iterate through number of columns
    for i in range(1, n +1):
        s = ""
        # Iterate through number of rows
        for j in list(range(i)):
            blank = ""
            # Generate 'blank spaces'
            for k in (range(n - i)):
                blank += " "
            # Generate 'T'
            s += "T"
        print (blank + s)

triangle1(7)