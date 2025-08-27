def solution(players, callings):
    rank = {name: i for i, name in enumerate(players)}
    for call in callings:
        idx = rank[call]
        if idx > 0:
            front = players[idx-1]
            players[idx-1], players[idx] = players[idx], players[idx-1]
            rank[call] -= 1
            rank[front] += 1
        
    return players

