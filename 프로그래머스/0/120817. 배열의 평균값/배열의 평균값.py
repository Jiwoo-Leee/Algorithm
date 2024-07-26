def solution(numbers):
    sum = 0
    average = 0
    for i in range(len(numbers)):
        sum += numbers[i]
    average = sum / len(numbers)
    return average