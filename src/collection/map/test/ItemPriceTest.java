package collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemPriceTest {

  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("apple", 500);
    map.put("orange", 500);
    map.put("banana", 1000);
    map.put("pineapple", 1000);

    // code 1000원인 품목 출력
    // case 1
    List<String> products = new ArrayList<>();

    for(String product : map.keySet()) {
      if(map.get(product) == 1000) {
        products.add(product);
      }
    }
    for (String product : products) {
      System.out.println(product);
    }

    // case 2
    List<String> products2 = new ArrayList<>();
    for(Map.Entry<String, Integer> entry : map.entrySet()) {
      if(entry.getValue().equals(1000)) {
        products2.add(entry.getKey());
      }
    }
    System.out.println(products2);
  }
}
