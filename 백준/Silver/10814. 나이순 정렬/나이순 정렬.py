import sys
input = sys.stdin.readline
N = int(input())
info = []
for i in range(0,N):
    age, name = map(str ,input().split())
    age = int(age)
    info.append((age,name))
info = sorted(info, key=lambda x: x[0])
for age, name in info:
    print(age, name)