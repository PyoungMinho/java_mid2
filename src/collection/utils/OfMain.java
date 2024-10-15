package collection.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {

  public static void main(String[] args) {
    // 편리한 불편 컬렉션 생성
    List<Integer> list = List.of(1, 2, 3);
    Set<Integer> set = Set.of(1, 2, 3);
    Map<Integer, String> map = Map.of(1, "one", 2, "two", 3, "three");
    // 불변이라 read만 가능하다.

    System.out.println("list: " + list);
    System.out.println("set: " + set);
    System.out.println("map: " + map);
    System.out.println("list class: " + list.getClass()); // ImmutableCollection 확인
  }
}
