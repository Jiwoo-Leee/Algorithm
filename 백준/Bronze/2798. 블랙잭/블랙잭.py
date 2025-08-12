import sys
input = sys.stdin.readline
sum = 0

n, m = map(int,input().split())
a = list(map(int,input().split()))

def blackjack(n, m, a):
    result = -1
    for i in range(n-2):
        for j in range(i+1, n-1):
            for k in range(j+1, n):
                total = a[i] + a[j] + a[k]
                if total == m:
                    return total 
                if total < m:
                    result = max(result, total)
    return result

print(blackjack(n,m,a))