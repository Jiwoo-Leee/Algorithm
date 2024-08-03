def solution(my_string, letter):
    array = []
    for char in my_string:
        array.append(char)
    n = len(array)
    return my_string.replace(letter,"")