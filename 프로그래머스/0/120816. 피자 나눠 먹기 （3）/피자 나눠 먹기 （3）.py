def solution(slice, n):
    if(n % slice == 0):
        result = n // slice
        return result
    else:
        result = n // slice + 1
        return result
    