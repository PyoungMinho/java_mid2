package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain3 {

  public static void main(String[] args) {
    MyUser myUser1 = new MyUser("a", 30);
    MyUser myUser2 = new MyUser("b", 20);
    MyUser myUser3 = new MyUser("c", 10);

    MyUser[] arrays = {myUser1, myUser2, myUser3};
    System.out.println("기본 데이터");
    System.out.println(Arrays.toString(arrays));

    System.out.println("Comparable 기본 정렬");
    Arrays.sort(arrays);
    System.out.println(Arrays.toString(arrays));

    System.out.println("id comparator");
    Arrays.sort(arrays, new IdComparator());
    System.out.println(Arrays.toString(arrays));

    System.out.println("id comparator reversed");
    Arrays.sort(arrays,new IdComparator().reversed());
    System.out.println(Arrays.toString(arrays));
  }
}
