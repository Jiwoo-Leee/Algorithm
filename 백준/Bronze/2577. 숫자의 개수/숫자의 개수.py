a = int(input())
b = int(input())
c = int(input())
mul = a*b*c
mul = str(mul)
count = [0] * 10
for i in mul:
    count[int(i)] += 1
for i in count:
    print(i)