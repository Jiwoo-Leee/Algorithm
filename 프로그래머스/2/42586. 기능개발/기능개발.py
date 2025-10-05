import math

def solution(progresses, speeds):
    answer = []
    dis_day = []
    count = 0
    for i in range(len(progresses)):
        sub = 100 - progresses[i]
        days = math.ceil(sub / speeds[i])
        dis_day.append(days)
    
    now = dis_day[0]  
    for i in range(len(dis_day)):
        if dis_day[i] <= now:
            count += 1
        else:
            answer.append(count)
            now = dis_day[i]
            count = 1
    answer.append(count)
    return answer