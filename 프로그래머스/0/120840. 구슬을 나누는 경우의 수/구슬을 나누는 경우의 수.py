def solution(balls, share):
    num1 = 1
    num2 = 1
    for i in range(balls,balls-share,-1):
        num1 *= i
    for j in range(share,1,-1):
        num2 *= j
    return num1//num2