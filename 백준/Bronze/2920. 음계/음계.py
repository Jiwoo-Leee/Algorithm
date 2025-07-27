a = list(map(int,input().split()))
if a == sorted(a,reverse=True):
    print("descending")
elif a == sorted(a,reverse=False):
    print("ascending")
else:
    print("mixed")