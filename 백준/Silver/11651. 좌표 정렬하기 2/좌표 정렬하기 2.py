import sys
input = sys.stdin.readline
list = []
n = int(input())
for i in range(n):
    a,b = map(int,input().split())
    list.append((a,b))
list.sort(key = lambda x: (x[1], x[0]))
for a,b in list:
    print(a,b)