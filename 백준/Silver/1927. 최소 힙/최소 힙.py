import heapq
import sys

input = sys.stdin.readline
N = int(input())
list = []
for i in range(0,N):
  x = int(input())
  if x > 0:
    heapq.heappush(list,x)
  if x == 0:
    if not list:
      print("0")
    else:
      print(heapq.heappop(list))