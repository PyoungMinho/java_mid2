package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {

  public static void main(String[] args) {
    Map<String, Integer> studentMap = new HashMap<>();

    studentMap.put("A", 50);
    System.out.println(studentMap);

    // 학생이 없는 경우에만 추가 case 1
    if(!studentMap.containsKey("A")){
       studentMap.put("A", 20);
    }
    System.out.println(studentMap);


    // 학생이 없는 경우에만 추가 case 2
    studentMap.putIfAbsent("A",100);
    studentMap.putIfAbsent("B",20);
    studentMap.putIfAbsent("D",70);
    System.out.println(studentMap);

    // 실제로 자바 HashSet 의 구현은 대부분 HashMap의 구현을 가져다가 사용한다. Map에서 Value를 날리고 Set으로 사용가능하다
  }
}
