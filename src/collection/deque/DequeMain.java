package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {

  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>(); // LinkedList보다 무조건 빠르다 ArrayDeque를 사용하도록 하자.
//    Deque<Integer> deque = new LinkedList<>();

    // 데이터 추가
    deque.offerFirst(1);
    System.out.println(deque);
    deque.offerFirst(2);
    System.out.println(deque);
    deque.offerLast(3);
    System.out.println(deque);
    deque.offerLast(4);
    System.out.println(deque);

    // 다음 꺼낼 데이터 확인(꺼내지 않고 단순 확인만)
    System.out.println("deque.peekFirst(): " + deque.peekFirst());
    System.out.println("deque.peekLast(): " + deque.peekLast());


    // 데이터 꺼내기
    System.out.println("deque.pollFirst(): " + deque.pollFirst());
    System.out.println("deque.pollFirst(): " + deque.pollFirst());
    System.out.println("deque.pollLast(): " + deque.pollLast());
    System.out.println("deque.pollLast(): " + deque.pollLast());
    System.out.println(deque);
  }
}
