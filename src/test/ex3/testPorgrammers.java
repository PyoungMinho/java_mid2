package test.ex3;

import java.util.ArrayList;
import java.util.Arrays;

public class testPorgrammers {
  public static void main(String[] args) {
    int answer = solution(15);
    System.out.println(answer);
  }

  public static int solution(int num) {
    var answer = 0;

    for (var i = 1; i <= num; i++) {
      if (num % i == 0 && i % 2 == 1) answer++;
    }
    return answer;
  }
}
