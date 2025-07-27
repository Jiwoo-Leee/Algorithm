import sys
input = sys.stdin.readline
T = int(input())
result = []
for i in range(0,T):
    h, w, n = map(int,input().split())
    floor = n % h
    room = n // h + 1
    if floor == 0:
        floor = h
        room -= 1

    result.append(floor * 100 + room)
for i in result:
    print(i)
        