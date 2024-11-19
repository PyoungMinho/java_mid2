package collection.map.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class PrintQueueTest {

  public static void main(String[] args) {
    Queue<String> queue = new ArrayDeque<>();

    //code plz
    queue.offer("doc1");
    queue.offer("doc2");
    queue.offer("doc3");

    System.out.println("출력 : "+queue.poll());
    System.out.println("출력 : "+queue.poll());
    System.out.println("출력 : "+queue.poll());
  }
}