def solution(n, k):
    sheep = 12000 * n
    drink = 2000 * k
    service_number = n // 10
    return sheep + drink - service_number*2000