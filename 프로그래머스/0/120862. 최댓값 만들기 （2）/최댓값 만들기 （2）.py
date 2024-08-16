def solution(numbers):
    n = len(numbers)
    result = []
    for i in range(0,n,1):
        for j in range(i+1,n,1):
            number = numbers[i] * numbers[j]
            result.append(number)
    result.sort()
    return result[-1]