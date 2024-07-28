def solution(price):
    if price >= 100000 and price < 300000:
        newprice = price * 0.95
        return int(newprice)
    elif price >= 300000 and price < 500000:
        newprice = price * 0.9
        return int(newprice)
    elif price >= 500000:
        newprice = price * 0.8
        return int(newprice)
    elif price < 100000:
        return int(price)