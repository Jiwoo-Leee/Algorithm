def solution(numbers):
    n = len(numbers)
    new_array = []
    for i in range(0,n):
        new_number = 2*numbers[i]
        new_array.append(new_number)
    return new_array
    