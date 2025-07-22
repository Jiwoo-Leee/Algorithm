import sys
input = sys.stdin.readline
N = int(input())
P = list(map(int,input().split()))
newP = sorted(P)
now = 0
sum = 0
for i in newP:
    now += i
    sum += now
print(sum)
    