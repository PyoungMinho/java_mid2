package collection.map.test;

import java.util.*;

public class DictionaryTest {

  public static void main(String[] args) {
    Map<String, String> dictionary = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    System.out.println("==단어 검색 단계==");
    while (true) {
        System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
        String englishWord = scanner.nextLine(); // 입력으로 word 받기
        if (englishWord.equals("q")) {
          break;
        }

        System.out.print("한글 뜻을 입력하세요: ");

        String koreanMeaning = scanner.nextLine();
        dictionary.put(englishWord, koreanMeaning); // Map(영단어,한국어) put
    }

    System.out.println("==단어 검색 단계==");
    while (true) {
        System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
        String searchWord = scanner.nextLine();
        if (searchWord.equals("q")) {
          break;
        }

        if (dictionary.containsKey(searchWord)) {
          String koreanMeaning = dictionary.get(searchWord); // 입력받은 값으로 map에서 value 반환
          System.out.println(searchWord + "의 뜻: " + koreanMeaning);

        } else {
          System.out.println(searchWord + "은(는) 사전에 없는 단어입니다.");
        }
    }
  }
}
