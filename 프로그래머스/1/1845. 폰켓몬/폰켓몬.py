from collections import Counter
def solution(nums):
    n = len(nums)
    kinds = len(Counter(nums))
    return min(kinds, n//2)