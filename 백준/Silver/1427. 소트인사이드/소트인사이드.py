import sys
input = sys.stdin.readline
list = []
N = int(input())
for i in str(N):
    list.append(int(i))
result = sorted(list, reverse=True)
for i in result:
    print(i,end='')