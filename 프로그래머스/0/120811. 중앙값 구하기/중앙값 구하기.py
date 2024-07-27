def solution(array):
    n = len(array)
    for i in range(n):
        for j in range(0,n-i-1):
            if array[j]>array[j+1]:
                temp = array[j]
                array[j] = array[j+1]
                array[j+1] = temp
    mid_index = n//2
    return array[mid_index]
            