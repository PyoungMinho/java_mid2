package collection.map.test.stackTest;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleHistoryTest {

  public static void main(String[] args) {
    Deque<String> stack = new ArrayDeque<>();

    // code plz
      stack.offer("youtube.com");
      stack.offer("google.com");
      stack.offer("facebook.com");

      // 출력
    System.out.println("stack: " + stack.pop());
    System.out.println("stack: " + stack.pop());
    System.out.println("stack: " + stack.pop());
  }
}
