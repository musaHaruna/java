 public class DeckCard {
 public static void main(String[] args) {
   String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
   String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};


  String[] deck = new String[RANKS.length * SUITS.length];
  for (int i = 0; i < RANKS.length; i++) {
      for (int j = 0; j < SUITS.length; j++) {
           deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
           System.out.println(deck[SUITS.length*i + j]);
 }
} 
}
}