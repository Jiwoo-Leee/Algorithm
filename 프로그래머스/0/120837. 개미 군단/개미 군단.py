def solution(hp):
    big = 5
    mid = 3
    small = 1
    first = hp // big
    second = (hp%big) // mid
    third = (hp%big%mid) // small
    return first + second + third