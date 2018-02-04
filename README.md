**KnuthShuffle**

Java implementation of the Knuth shuffling algorithm.
https://rosettacode.org/wiki/Knuth_shuffle

Classes:

Main - contains a simple test to create and shuffle the deck

Deck - contains many cards.  In the case of this implementation a deck really represents a shoe and the show can contain multiple decks to be shuffled.  

Card - contains a card from the deck. Cards contain the following attributes:
* Name - A two character string containing the type (A,2,3...Q,K) and the suit (H,D,C,S)
* Suit - A one letter string containing the suit
  * Hearts - H
  * Diamonds - D
  * Clubs - C
  * Spades - S
* High Value - The maximum value of a card.  For example, an Ace is considered to have a high value of 11 in Blackjack.
* Low Value - The maximum value of a card.  For example, an Ace is considered to have a low value of 1 in Blackjack.
