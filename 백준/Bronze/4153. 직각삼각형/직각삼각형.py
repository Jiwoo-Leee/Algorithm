while True:
    a = list(map(int,input().split()))
    maxa = max(a)
    a.remove(max(a))
    if maxa * maxa == a[0] * a[0] + a[-1] * a[-1] and a[0]>0:
        print('right')
    elif a[0] == 0 and a[1] == 0:
        break
    else:
        print('wrong')
