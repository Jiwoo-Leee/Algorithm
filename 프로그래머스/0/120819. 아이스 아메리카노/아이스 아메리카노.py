def solution(money):
    coffee = money // 5500
    change = money % 5500
    result = []
    result.append(coffee)
    result.append(change)
    return result