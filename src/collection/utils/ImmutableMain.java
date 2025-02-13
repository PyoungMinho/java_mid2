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



    // 예제
    int n;
    int k;
    int s=0;
    int el = 0;

    for(n =6; n<=30; n++){
      s = 0;
      k = n/2;
      for (int j=1; j<=k; j++){
        if(n % j ==0 ) s = s+j;
      }
      if(s==n) el++;
    }
    System.out.println("el: " + el);

    int a=0;
    for (int i =1; i<999; i++){
      if (i%3 == 0 && i % 2 !=0) a= i; // 3으로 나눠지지만 2로 안나눠 지는 마지막 숫자 993
    }
    System.out.println("a: " + a);
  }
}
