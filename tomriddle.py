rank = ["A","J","K","Q"]
suit = ["_of_Spades","_of_Hearts","_of_Clubs","_of_Diamonds"]
n=4
move = [x for x in range(0,n,2)]
move.extend([x for x in range(1,n,2)])
for y in range(n):
    for x in range(n):
        ranksplit=rank[(x+move[y])%n]
        #print (ranksplit)
        suitsplit=suit[(move[y]-x)%n]
        #print (suitsplit)
        print (ranksplit+suitsplit, end= "  ")
    print("\n")
