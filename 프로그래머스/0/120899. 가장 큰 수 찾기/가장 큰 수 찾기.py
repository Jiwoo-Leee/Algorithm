def solution(array):
    n = len(array)
    num = max(array)
    index = array.index(num)
    new_array = []
    new_array.append(num)
    new_array.append(index)
    return new_array