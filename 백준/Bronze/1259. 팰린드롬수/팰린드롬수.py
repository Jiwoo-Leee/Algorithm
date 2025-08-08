import sys
input = sys.stdin.readline

while True:
    case = input().strip()  # '\n' 제거
    if case == '0':
        break
    if case == case[::-1]:
        print('yes')
    else:
        print('no')
