package collection.iterable;

import java.util.*;

public class JavaIterableMain {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);

    Iterator<Integer> iterator = list.iterator();
    printAll(iterator);

    Set<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);

    Iterator<Integer> iterator2 = set.iterator();
    printAll(iterator2);

  }

  private static void printAll(Iterator<Integer> iterator) {
    System.out.println("iterator: " + iterator.getClass());
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
