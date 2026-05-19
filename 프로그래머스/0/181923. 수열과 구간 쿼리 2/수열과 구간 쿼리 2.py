def solution(arr, queries):
    answer = []
    for s,e,k in queries:
        result = -1
        for i in range(s,e+1):
            if arr[i] > k:
                if result == -1 or arr[i] < result:
                    result = arr[i]
        answer.append(result)
    return answer