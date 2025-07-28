list = []
set = set()
for i in range(0,10):
    a = int(input())
    list.append(a)
for i in range(0,10):
    na = list[i] % 42
    set.add(na)
print(len(set))