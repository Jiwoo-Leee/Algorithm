n = int(input())
score = list(map(int,input().split()))
max_score = max(score)
sum = 0
for i in score:
    new_score = i/max_score * 100
    sum += new_score
result = sum/len(score)
print(result)