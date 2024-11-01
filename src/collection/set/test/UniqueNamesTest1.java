package collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {

  public static void main(String[] args) {

      Integer[] inputarr = {30,20,20,10,10};
      Set<Integer> set = new HashSet<>();

      for(Integer i : inputarr) {
        set.add(i);
      }

      for(Integer s : set) {
        System.out.println(s);
      }
  }
}
