from collections import deque
import sys
input = sys.stdin.readline
queue = deque()
result = []
N = int(input())
for i in range(0,N):
    command = input().strip().split()
    if command[0] == 'push':
        queue.append(int(command[1]))
    elif command[0] == 'pop':
        if len(queue) == 0:
            result.append("-1")
        else:
            result.append(queue[0])
            queue.popleft()
    elif command[0] == 'size':
        result.append(len(queue))
    elif command[0] == 'empty':
        if len(queue) == 0:
            result.append("1")
        else:
            result.append("0")
    elif command[0] == 'front':
        if len(queue) == 0:
            result.append("-1")
        else:
            result.append(queue[0])
    elif command[0] == 'back':
        if len(queue) == 0:
            result.append("-1")
        else:
            result.append(queue[-1])
for i in range(0,len(result)):
    print(result[i])        