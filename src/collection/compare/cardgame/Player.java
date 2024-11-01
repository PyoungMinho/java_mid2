package collection.compare.cardgame;

import java.util.ArrayList;
import java.util.List;

public class Player {
  private String name;
  private List<Card> hand;

  public Player(String name) {
    this.name = name;
    this.hand = new ArrayList<>();
  }

  public void getCard(Deck deck){
    hand.add(deck.drawCard());
  }

  public int rankSum(){
    int sum = 0;
    for(Card card : hand){
      sum += card.getRank();
    }
    return sum;
  }

  public void showHand(){
    hand.sort(Card::compareTo);
    System.out.println(name + "의 카드 : "+ hand + ", 합계 : "+ rankSum());
  }

  public String getName() {
    return name;
  }
}
