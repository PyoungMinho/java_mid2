package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {

  public static void main(String[] args) {
    // 불변 리스트 생성
    List<Integer> list = List.of(1, 2, 3);

    // 가변으로 돌리기 ArrayList로 바꿔버리면 됌
    ArrayList<Integer> mutableList = new ArrayList<>(list);
    mutableList.add(4);
    System.out.println("mutableList: " + mutableList);
    System.out.println("mutableList class: " + mutableList.getClass());

    //가변 -> 불변리스트로
    List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
    System.out.println(" unmodifiableList: " + unmodifiableList.getClass());




  }
}
