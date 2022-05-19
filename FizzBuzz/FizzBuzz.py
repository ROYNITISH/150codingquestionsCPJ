n = int(input())
strs = []
for i in range(1 , n+1):
	if i%3 == 0 and i%5 == 0:
		strs.append("FizzBuzz")
	elif i%3 == 0:
		strs.append("Fizz")
	elif i%5 == 0:
		strs.append("Buzz")
	else:
		strs.append(i)
for s in strs:
	print(s)
