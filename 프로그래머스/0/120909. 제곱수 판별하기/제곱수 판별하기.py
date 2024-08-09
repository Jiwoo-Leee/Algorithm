import math
def solution(n):
    number = int(math.sqrt(n))
    if math.sqrt(n) == number:
        return 1
    else:
        return 2