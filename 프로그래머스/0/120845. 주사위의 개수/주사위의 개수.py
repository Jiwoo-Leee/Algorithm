def solution(box, n):
    x = box[0] * box[1] * box[2]
    n2 = (box[0]//n) * (box[1]//n) * (box[2]//n)
    return n2