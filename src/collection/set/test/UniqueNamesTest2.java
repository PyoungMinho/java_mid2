package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {

  public static void main(String[] args) {

    Integer[] inputarr = {30, 20, 20, 10, 10}; // arr -> List = list.of(arr);
    Set<Integer> set = new LinkedHashSet<>(List.of(inputarr));

    for (Integer s : set) {
      System.out.println(s);
    }
  }
}

/*
* 배열을 리스트로 변환하기
  List<Integer> list = Arrays.asList(arr);
  List<Integer> list = List.of(arr);

* 편리한 리스트 생성
  List<Integer> list = Arrays.asList(1, 2, 3);
  List<Integer> list = List.of(1, 2, 3);
  // 자바 9 이상은 List.of를 권장한다.
* */