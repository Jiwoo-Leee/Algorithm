def solution(n):
    if(n < 6):
        minimum = 1
    else:
        minimum = n // 6
    pieces = minimum * 6
    while(pieces % n != 0):
        minimum += 1
        pieces = minimum * 6
    return minimum
        