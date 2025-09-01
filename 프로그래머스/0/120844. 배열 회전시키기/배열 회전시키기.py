def solution(numbers, direction):
    n = len(numbers)
    if direction == "right":
        a = numbers.pop(-1)
        numbers.insert(0,a)
    elif direction == "left":
        b = numbers.pop(0)
        numbers.append(b)
    return numbers