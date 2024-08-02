def solution(my_string, n):
    num = len(my_string)
    mystring = ""
    for i in range(0,num,1):
        mystring += my_string[i] * n
    return mystring
        