def solution(sides):
    sides.sort()
    cnt1 = 0
    cnt2 = 0
    for i in range(1,sides[1]+1,1):
        if sides[0] + i > sides[1]:
            cnt1 += 1
    for j in range(1,2000,1):
        if sides[0] + sides[1] > j and j > sides[1]:
            cnt2 += 1
    print(cnt1)
    print(cnt2)
    return cnt1 + cnt2