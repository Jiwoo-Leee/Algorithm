n = int(input())
list = []
for i in range(0,n):
  num = int(input())
  list.append(num)
sorted_list = sorted(list)
for num in sorted_list:
  print(num)