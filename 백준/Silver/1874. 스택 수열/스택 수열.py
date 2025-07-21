import sys

n = int(input())
list = []
now = 1
num = 0
result = []
for i in range(now,n+1):
  num = int(input())
  while num >= now:
    list.append(now)
    result.append("+")
    now += 1
  if list[-1] == num:
    list.pop()
    result.append("-")
  else: 
    print("NO")
    sys.exit()
for i in range(0,len(result)):
  print(result[i])