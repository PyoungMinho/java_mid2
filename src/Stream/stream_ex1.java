package Stream;

import java.util.*;
import java.util.stream.Stream;

public class stream_ex1 {
    public static void main(String[] args) {
        // 람다 Stream 을 공부하기 위한 공간

        // 스트림 만들기
            // 배열
            String[] arr = new String[]{"a","b","c","d","e","f"};
            Stream<String> stream = Arrays.stream(arr); 


        List<String> names = Arrays.asList("Alice","b","c","d","e");

        List<String> filterNames =  new ArrayList<>();
        for (String name : names) {
            if(name.startsWith("A") && name.length() >= 4){
                filterNames.add(name);
            }
        }

        Collections.sort(filterNames);
        for (String filterName : filterNames) {
            System.out.println("name is : "+ filterName);
        }

        // =======> 람다로변경
        names.stream()
                .filter(name -> name.startsWith("A") && name.length() >= 4)
                .sorted()
                .forEach(System.out::println);

    }
}
