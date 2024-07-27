def solution(n):
    sum=0
    if n%2==0:
        for i in range(0,n+1,2):
            sum += i
        return sum
    elif n%2!=0:
        for i in range(0,n,2):
            sum += i
        return sum