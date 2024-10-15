package collection.compare.cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

  private List<Card> cards = new ArrayList<>();
  private String[] suits = {"♠", "♦", "♥","♣"};
  // 덱 생성하기
  public Deck() {
      initCard();
      shuffle();
  }

  private void initCard() {
    for (int i = 1; i <= 13; i++) {
      for(String suit : suits) {
        cards.add(new Card(suit, i));
        System.out.println("cards : "+suit + ' ' + i);
      }
    }
  }

  private void shuffle() {
    Collections.shuffle(cards);
  }

  public Card drawCard(){
    return cards.remove(0);
  }
}
