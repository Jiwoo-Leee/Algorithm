def solution(age):
    num1 = age // 1000  
    num2 = (age % 1000) // 100  
    num3 = (age % 100) // 10  
    num4 = age % 10 
    result = ''
    array = ['a','b','c','d','e','f','g','h','i','j']
    if num1 > 0:
        result += array[num1]
    if num1 > 0 or num2 > 0:
        result += array[num2]
    if num1 > 0 or num2 > 0 or num3 > 0:
        result += array[num3]
    if num1 > 0 or num2 > 0 or num3 > 0 or num4 > 0:
        result += array[num4]
    return result