def solution(num_list):
    n = len(num_list)
    oddcnt = 0
    evencnt = 0
    newlist = []
    for i in range(0,n,1):
        if num_list[i] % 2 == 0:
            evencnt += 1
        else:
            oddcnt += 1
    newlist.append(evencnt)
    newlist.append(oddcnt)
    return newlist
        