import sys
import math
input = sys.stdin.readline
cur = 0
day = 0
a,b,v = map(int,input().split())
day = math.ceil((v-b)/(a-b))
print(day)