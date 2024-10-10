package collection.map;

import java.util.*;

public class MapMain1 {

  public static void main(String[] args) {
    Map<String, Integer> studentMap = new HashMap<>();

    studentMap.put("A", 90);
    studentMap.put("B", 80);
    studentMap.put("C", 80);
    studentMap.put("D", 100);
    System.out.println(studentMap);

    // 특정 학생의 값 조회
    Integer result = studentMap.get("A");
    System.out.println("result: " + result);

    System.out.println("keySet 활용");
    Set<String> keys= studentMap.keySet(); // key들을 반환 -> Key는 중복안되고 순서 보장안한다 == Set구조 그래서 Set반환

    for (String key : keys) {
      Integer value = studentMap.get(key);
      System.out.println("key: " + key + ", value: " + value);
    }

    System.out.println("entrySet 활용");
    Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
    for (Map.Entry<String, Integer> entry : entries) {
      System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
    }

    System.out.println("Values 활용");
    Collection<Integer> values = studentMap.values(); //List아닌 이유는 Value가 순서보장은 아니니깐
    for (Integer value : values) {
      System.out.println("value: " + value);
    }
  }
}
