import time

mydate = time.time()
num_days = int(mydate // (3600 * 24))

# Part 2

midnight_on_mydate = num_days * 24 * 3600

seconds_since_midnight = mydate - midnight_on_mydate
hours = int(seconds_since_midnight // 3600)
minutes = int((seconds_since_midnight - (hours * 3600)) // 60)
seconds = int(seconds_since_midnight - (hours * 3600 + minutes * 60))
print("%s:%s:%s" % (hours, minutes, seconds))

print(num_days, "days since epoch")
