def solution(order):
    neworder = str(order)
    cnt = 0
    for i in neworder:
        if i == "3" or i == "6" or i == "9":
            cnt += 1
    return cnt