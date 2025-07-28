xy = []
n = int(input())
for i in range(n):
    x,y = map(int,input().split())
    xy.append((x,y))
xy.sort()
for x,y in xy:
    print(x,y)