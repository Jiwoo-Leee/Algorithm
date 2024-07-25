def solution(n):

    if(n%7==0):
        pizza = n // 7 
        return pizza
    else:
        pizza2 = n // 7
        return pizza2+1
        