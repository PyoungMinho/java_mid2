package collection.compare;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class SortMain5 {

  public static void main(String[] args) {
    MyUser myUser1 = new MyUser("a", 30);
    MyUser myUser2 = new MyUser("b", 20);
    MyUser myUser3 = new MyUser("c", 10);

    TreeSet<MyUser> treeSet1 = new TreeSet<>();
    treeSet1.add(myUser1);
    treeSet1.add(myUser2);
    treeSet1.add(myUser3);
    System.out.println("Comparable 기본 정렬");
    System.out.println(treeSet1); // tree라 애초에 value로 정렬

    TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
    treeSet2.add(myUser1);
    treeSet2.add(myUser2);
    treeSet2.add(myUser3);
    System.out.println("IdComparator 정렬");
    System.out.println(treeSet2);

  //Java의 정렬 알고리즘은 복잡하지만, 거의 완성에 가깝다.
    /* 자바는 개발자가 복잡한 알고리즘은 신경 쓰지 않고 기준만 간단히 변경할 수 있도록, 정렬의 기준을 Comparable, Comparator
       인터페이스를 통해 추상화해 두었다.
       객체의 정렬이 필요한 경우 Comparable을 통해 기본 자연 순서를 사용하고, 외 다른 정렬 기준이 추가로 필요하면 Comparator를 만들어 사용하자.
       Comparable 클래스 자체에서 자연 순서를 정의하며, 정렬 기준이 한 가지!!
       Comparator 외부에서 여러 정렬 기준을 정의할 수 있으며, 동일한 클래스에 대해 다양한 정렬 방법을 사용할 수 있다.!!!
    * */

  }
}
