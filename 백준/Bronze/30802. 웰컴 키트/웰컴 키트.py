import sys
input = sys.stdin.readline
shirts = 0
n = int(input())
size = list(map(int,input().split()))
t, p = map(int,input().split())
for i in range(0,len(size)):
    if size[i] % t == 0:
        shirts += size[i] // t
    else:
        shirts += (size[i] // t) + 1
       
pen1 = n // p
pen2 = n % p
print(shirts)
print(pen1, pen2)