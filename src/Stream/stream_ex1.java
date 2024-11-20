package Stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class stream_ex1 {
    public static void main(String[] args) {
    // 람다 Stream 을 공부하기 위한 공간

    // 1. 스트림 만들기
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

        // 기본 타입형 스트림
        IntStream intStream = IntStream.range(1,5); // [1,2,3,4]

        // 병렬 스트림 parallelStream
        Stream<String> parallelStream = list.parallelStream();


    // 2. 중간 연산 스트림 (가공하기)

        // Filtering (if)
        List<String> strings = Arrays.asList("a","b","c");
        Stream<String> stream = strings.stream()
                .filter(str -> list.contains("a")); // 'a'가 들어간 요소만 선택  [a]

        // Mapping
        Stream<String> stream3 = list.stream()
                .map(String::toUpperCase);
        //[A,B,C]
        //.map(Integers::parseInt);
        // 문자열 -> 정수로 변환

        // Sorting
        Stream<String> stream4 = list.stream()
                .sorted() // [a,b,c] 오름차순 정렬
                .sorted(Comparator.reverseOrder()); // [c,b,a] (내림차순)

        List<String> list1 = Arrays.asList("a","bb","ccc");
        Stream<String> stream5 = list.stream()
                .sorted(Comparator.comparingInt(String::length)); // [ccc,bb,a] //문자열 길이 기준 정렬


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
