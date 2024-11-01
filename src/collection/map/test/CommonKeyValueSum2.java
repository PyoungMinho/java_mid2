package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum2 {
  public static void main(String[] args) {

    Map<String, Integer> map1 = Map.of("a", 1, "b", 2, "c", 3); // map.of 는 불변

    Map<String, Integer> map2 = Map.of("b", 4, "c", 5, "d", 6);

    // code작성
    HashMap<String, Integer> sumMap = new HashMap<>();
    for (String s : map1.keySet()) {
      if(map2.containsKey(s)) {
        sumMap.put(s, map1.get(s) + map2.get(s));
      }
    }
    System.out.println(sumMap);


  }
}
