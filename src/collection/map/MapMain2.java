package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {

  public static void main(String[] args) {
    Map<String, Integer> studentMap = new HashMap<>();

    studentMap.put("A", 90);
//    System.out.println(studentMap);

    studentMap.put("A", 100); // 같은 키에 저장시 기존 값을 교체
    System.out.println(studentMap);

    boolean containsKey = studentMap.containsKey("A");
    System.out.println("containsKey: " + containsKey);

    studentMap.remove("A");
    System.out.println(studentMap);
  }
}
