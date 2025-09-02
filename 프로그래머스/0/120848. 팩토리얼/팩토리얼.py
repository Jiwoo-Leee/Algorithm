def solution(n):
    num = 1
    answer = 1
    while True:
        num *= (answer+1)
        if num > n:
            return answer
        answer += 1
    