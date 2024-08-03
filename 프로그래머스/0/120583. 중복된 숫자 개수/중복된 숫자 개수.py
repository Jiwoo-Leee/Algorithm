def solution(array, n):
    cnt = 0
    for i in range(0,len(array),1):
        if array[i] == n:
            cnt += 1
    return cnt