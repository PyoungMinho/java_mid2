package collection.set.test;

import java.util.*;

public class SetOperationTest {

  public static void main(String[] args) {
      Set<Integer> set1 =new HashSet<>(List.of(1,2,3,4,5));
      Set<Integer> set2 =new HashSet<>(List.of(3,4,5,6,7));

      // 합집합, 차집합, 교집합을 구하라

      // 합집합
      Set<Integer> union = new HashSet<>();
      union.addAll(set1);
      union.addAll(set2);
      System.out.println("합집합 : " + union);

      // 교집합
      Set<Integer> intersection = new HashSet<>(set1);
      intersection.retainAll(set2);
      System.out.println("교집합 : " + intersection);

      // 차집합
      Set<Integer> difference = new HashSet<>(set1);
      difference.removeAll(set2);
      System.out.println("차집합 : "+difference);
  }
}
