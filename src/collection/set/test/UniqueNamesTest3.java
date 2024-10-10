package collection.set.test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {

  public static void main(String[] args) {

//    Integer[] inputarr = {30, 20, 20, 10, 10}; // arr -> List = list.of(arr);
    Set<Integer> set = new TreeSet<>(List.of(30, 20, 20, 10, 10));

    for (Integer s : set) {
      System.out.println(s);
    }
  }
}