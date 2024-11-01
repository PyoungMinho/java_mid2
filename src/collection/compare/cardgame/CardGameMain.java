package collection.compare.cardgame;

import java.util.HashMap;

public class CardGameMain {

  public static void main(String[] args) {

  Deck deck = new Deck();
  Player p1 = new Player("P1");
  Player p2 = new Player("P2");

  for (int i=0; i<5; i++) {
    p1.getCard(deck);
    p2.getCard(deck);
  }

  p1.showHand();
  p2.showHand();

  Player winner = winner(p1,p2);
  if(winner != null) {
    System.out.println(winner.getName() + "의 승리");
  }else System.out.println(" 무승부 ");

  }

  private static Player winner(Player p1, Player p2) {
    Player winner = null;

    if(p1.rankSum() > p2.rankSum()) {
      return winner = p1;
    }else if(p1.rankSum() < p2.rankSum()) {
      return winner = p2;
    }else return winner;
  }
}
