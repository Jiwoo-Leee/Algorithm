def solution(i, j, k):   
    count=0
    for h in range(i,j+1):
        for n in str(h):
            if (n==str(k)):
                count +=1
    return count