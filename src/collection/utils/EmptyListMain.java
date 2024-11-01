package collection.utils;

import java.util.*;

public class EmptyListMain {

  public static void main(String[] args) {
    //  빈 가변 리스트 생성
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new LinkedList<>();

    //  빈 불변 리스트 생성
    List<Integer> list3 = Collections.emptyList();
    List<Integer> list4 = List.of();
    // List.of 권장

    System.out.println("list3 : "+ list3.getClass());
    System.out.println("list4 : "+ list4.getClass());

    //asList
    //고정된 크기를 가지지만, 요소들의 값은 변경가능함 1,2,3,4 -> 1,3,3,4 ok / 1,2,3 -> 1,2,3,4 x
    List<Integer> list5 = Arrays.asList(1, 2, 3);
    List<Integer> list6 = List.of(1,2,3);

    Integer[] arr = {1,2,3,4,5};
    List<Integer> asListArr = Arrays.asList(arr);
    asListArr.set(0,100); // asList로 만든 객체 값을 변경하면 원본데이터 변경

    System.out.println("arr : "+ asListArr); // 원본 arr 값이 변경된것을 알 수 있다.
    System.out.println("asListArr : "+ asListArr);
  }
}
