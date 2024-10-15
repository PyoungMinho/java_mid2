package collection.compare.cardgame;

import java.util.HashMap;
import java.util.Map;

public class Card implements Comparable<Card> {
  private String suit;
  private int rank;

  // 슈트 우선순위 정의
  private static final Map<String, Integer> SUIT_PRIORITY = new HashMap<>();

  static {
    SUIT_PRIORITY.put("♠", 1);  // 스페이드가 가장 높은 우선순위
    SUIT_PRIORITY.put("♦", 2);  // 다이아
    SUIT_PRIORITY.put("♥", 3);  // 하트
    SUIT_PRIORITY.put("♣", 4);  // 클로버가 가장 낮은 우선순위
  }

  public Card(String suit, int rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public String getSuit() {
    return suit;
  }

  public int getRank() {
    return rank;
  }

  @Override
  public int compareTo(Card o) {
    // 먼저 랭크(숫자) 비교
    if (this.rank != o.rank) {
      return Integer.compare(this.rank, o.rank);
    }
    // 랭크가 동일할 경우 슈트 우선순위를 기준으로 비교
    else {
      return Integer.compare(SUIT_PRIORITY.get(this.suit), SUIT_PRIORITY.get(o.suit));
    }
  }

  @Override
  public String toString() {
    return rank + "(" + this.getSuit() + ")";
  }
}
