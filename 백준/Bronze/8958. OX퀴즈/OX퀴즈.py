n = int(input())
for i in range(n):
    ox = input()
    sum = 0
    plus = 0
    for j in ox:
        if j == 'O':
            plus += 1
        else:
            plus = 0
        sum += plus
    print(sum)
    
