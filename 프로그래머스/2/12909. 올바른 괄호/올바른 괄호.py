def solution(s):
    count = 0
    pair = []
    if len(s) == 1:
        return False
    for ch in s:
        if ch == '(':
            pair.append(ch)
        else:
            if pair == []:
                return False
            else:
                pair.pop()
    return len(pair) == 0