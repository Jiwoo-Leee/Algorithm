def solution(num, k):
    num2 = str(num)
    k2 = str(k)
    numlist = []
    for i in num2:
        numlist.append(i)
    if k2 in numlist:
        return numlist.index(k2) + 1
    else:
        return -1