import sys
input = sys.stdin.readline
n = int(input())
tmp = set()
for i in range(0,n):
    name, attendance = map(str,input().split())
    if attendance == "enter":
        tmp.add(name)
    else:
        tmp.remove(name)
tmp = sorted(tmp,reverse=True)
for i in tmp:
    print(i)