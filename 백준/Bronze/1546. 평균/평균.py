import sys
input = sys.stdin.readline
n = int(input())
a = list(map(int,input().split()))
newa = []
sum = 0
avg = 0
for i in a:
    newa.append(i/max(a)*100)
for i in range(len(newa)):
    sum += newa[i]
avg = sum / len(newa)
print(avg)