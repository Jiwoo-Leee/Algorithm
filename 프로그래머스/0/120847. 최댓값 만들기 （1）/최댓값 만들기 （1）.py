def solution(numbers):
    n = len(numbers)
    for i in range(n):
        for j in range(0,n-i-1):
            if numbers[j] > numbers[j+1]:
                temp = numbers[j]
                numbers[j] = numbers[j+1]
                numbers[j+1] = temp
                
    result = numbers[-1] * numbers[-2]
    return result