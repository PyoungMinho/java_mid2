package Stream;

import java.util.*;
import java.util.stream.Stream;

public class stream_ex1 {
    public static void main(String[] args) {
        // 람다 Stream 을 공부하기 위한 공간

        // 스트림 만들기
        // 배열
        String[] arr = new String[]{"a", "b", "c", "d", "e", "f"};
        Stream<String> stream1 = Arrays.stream(arr);

        // 컬렉션
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream2 = list.stream();

        // Stream.builder()
        Stream<String> builderStream = Stream.<String>builder()
                .add("b").add("a").add("c")
                .build();

        builderStream.sorted().forEach(System.out::println);

        // 람다식 Stream.generate(), iterate()
        Stream<String> generatedStream = Stream.generate(()->"a").limit(5);
            // 생성할 때 스트림의 크기가 정해져있지 않기(무한하기)때문에 최대 크기를 제한해줘야 한다.
        generatedStream.forEach(System.out::print);

        Stream<Integer> iteratedStream = Stream.iterate(0, n->n+2).limit(5); //0,2,4,6,8


        // 사용해보기
        List<String> names = Arrays.asList("Alice", "b", "c", "d", "e");

        List<String> filterNames = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("A") && name.length() >= 4) {
                filterNames.add(name);
            }
        }

        Collections.sort(filterNames);
        for (String filterName : filterNames) {
            System.out.println("name is : " + filterName);
        }

        // =======> 람다로변경
        names.stream()
                .filter(name -> name.startsWith("A") && name.length() >= 4)
                .sorted()
                .forEach(System.out::println);


        List<String> cps = Arrays.asList("apple", "samsung", "intel", "micro", "Lg");

        List<String> myCps = cps.stream()
                .filter(name -> name.length() > 3)
                .toList();
        System.out.println(myCps);
    }
}
