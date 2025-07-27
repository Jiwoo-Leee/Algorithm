list = []
for i in range(0,9):
    n = int(input())
    list.append(n)
for i in range(len(list)):
    if max(list) == list[i]:
        print(max(list))
        print(i+1)