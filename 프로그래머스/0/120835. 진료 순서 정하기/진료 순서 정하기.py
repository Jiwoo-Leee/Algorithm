def solution(emergency):
    sorted_emer = emergency[:]
    sorted_emer.sort(reverse = True)
    answer = []
    for i in range(len(emergency)):
        answer.append(sorted_emer.index(emergency[i])+1)
    return answer
                