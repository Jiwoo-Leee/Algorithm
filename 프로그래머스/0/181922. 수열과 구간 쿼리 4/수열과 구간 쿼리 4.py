def solution(arr, queries):
    answer = []
    for i,j,k in queries:
        for a in range(i,j+1):
            if a % k == 0:
                for l in range(len(arr)):
                    arr[a] += 1
                    break
    return arr