import sys
input = sys.stdin.readline
cnt = 1
room = 1
space = 6
n = int(input())
while n > room:
    room += space
    space += 6
    cnt += 1
print(cnt)