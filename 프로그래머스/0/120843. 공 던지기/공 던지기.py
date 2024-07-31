def solution(numbers, k):
    n = len(numbers)
    longnumbers = numbers * k
    for i in range(0,len(longnumbers),2):
        return longnumbers[(k-1)*2]
            
        
            