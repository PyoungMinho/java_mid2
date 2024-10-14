package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {

  public static void main(String[] args) {
    MyArray myArray = new MyArray(new int[]{1,2,3,4,5,6,7,8,9}); // myArray는 직접 커스텀한 자료구조 iterator를 구현해두어서 일관적으로 순회가 가능한 구조
    Iterator<Integer> iterator = myArray.iterator();
    System.out.println("iterator 사용");

    while (iterator.hasNext()) {
      System.out.print (iterator.next());
    }

    for (Integer i : myArray) { // myArray에서 iterator를 오버라이딩 했기 때문에 사용이 가능하다.
      System.out.println("i value : " + i);
    }
  }
}
