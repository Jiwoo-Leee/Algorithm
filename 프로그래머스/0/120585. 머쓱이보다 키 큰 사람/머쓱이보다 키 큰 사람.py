def solution(array, height):
    array.append(height)
    n = len(array)
    cnt = 0
    for i in range(n):
        for j in range(0,n-i-1):
            if array[j] > array[j+1]:
                temp = array[j]
                array[j] = array[j+1]
                array[j+1] = temp
    for i in range(n):
        if array[i] > height:
            cnt += 1
    return cnt