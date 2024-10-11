package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

  public static void main(String[] args) {
    String text = "orange banana apple apple banana apple";

    String[] s = text.split(" ");
    
    Map<String, Integer> map = new HashMap<>();

    //case 1
    for (String word : s) {
      map.put(word, map.getOrDefault(word, 0) + 1); // getOrDefault 없으면 디폴트 0 설정 아니면 + 1
    }
    System.out.println(map);

    // case 2
    for (String word : s) {
      Integer cnt = map.get(word);
      if(cnt == null){
        cnt = 0;
      }
      cnt++;
      map.put(word, cnt);
    }
    System.out.println(map);
    
  }
}
