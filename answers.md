1. A deck of cards without jokers.
-Deck, Hand

2. 
    a. Player draws 9 cards from the deck
    b. Player checks if there is a possible match(A pair of cards with the same number A-10 or  a trio of a Jack , Queen, and King)
    c. Player picks two cards that match and they are discarded. If there is no match, the game is over.
    d. Draw Cards to replace discarded cards
    e. Repeat from step b until there are no cards left in the deck or in the hand or until the game is lost.

3. The ElevensBoard class is missing a few methods that will be completed in later activities. It is missing isLegal() and anotherPlayisPossible() methods to check if the player can make a move or not.

4. 
a. At the start of the game
b. the isLegal() and anotherPlayIsPossible() method
c. J, 6, 2, A, 4
d.

for(int i = 0; i < cIndexes.size(); i++){
    System.out.println(cIndexes.get(i).toString());
}

e. anotherPlayIsPossible() method because it would be called when there would be null slots, so cardIndexes woudl remove the null slots.