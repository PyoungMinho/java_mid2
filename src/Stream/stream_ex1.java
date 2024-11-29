package Stream;

import java.util.*;
import java.util.stream.Collectors;
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


        // 최종 연산 ( 결과 만들기 )

        // Calculating
        IntStream stream = list.stream()
                .count()   //스트림 요소 개수 반환
                .sum()     //스트림 요소의 합 반환
                .min()     //스트림의 최소값 반환
                .max()     //스트림의 최대값 반환
                .average();//스트림의 평균값 반환

        // Reduction
        IntStream stream = IntStream.range(1,5);
	                        .reduce(10, (total,num)->total+num);
        //reduce(초기값, (누적 변수,요소)->수행문)
        // 10 + 1+2+3+4+5 = 25

        // Collecting
        //예시 리스트
        List<Person> members = Arrays.asList(new Person("lee",26),
                new Person("kim", 23),
                new Person("park", 23));

        // toList() - 리스트로 반환
        members.stream()
                .map(Person::getLastName)
                .collect(Collectors.toList());
        // [lee, kim, park]

        // joining() - 작업 결과를 하나의 스트링으로 이어 붙이기
        members.stream()
                .map(Person::getLastName)
                .collect(Collectors.joining(delimiter = "+" , prefix = "<", suffix = ">");
        // <lee+kim+park>

        //groupingBy() - 그룹지어서 Map으로 반환
        members.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        // {26 = [Person{lastName="lee",age=26}],
        //  23 = [Person{lastName="kim",age=23},Person{lastName="park",age=23}]}

        //collectingAndThen() - collecting 이후 추가 작업 수행
        members.stream()
                .collect(Collectors.collectingAndThen (Collectors.toSet(),
                        Collections::unmodifiableSet));
        //Set으로 collect한 후 수정불가한 set으로 변환하는 작업 실행



        // Matching
        List<String> members = Arrays.asList("Lee", "Park", "Hwang");
        boolean matchResult = members.stream()
                .anyMatch(members->members.contains("w")); //w를 포함하는 요소가 있는지, True

        boolean matchResult = members.stream()
                .allMatch(members->members.length() >= 4); //모든 요소의 길이가 4 이상인지, False

        boolean matchResult = members.stream()
                .noneMatch(members->members.endsWith("t")); //t로 끝나는 요소가 하나도 없는지, True

        // Iterating
        members.stream()
                .map(Person::getName)
                .forEach(System.out::println);
        //결과를 출력 (peek는 중간, forEach는 최종)

        // Finding
        Person person = members.stream()
                .findAny()   //먼저 찾은 요소 하나 반환, 병렬 스트림의 경우 첫번째 요소가 보장되지 않음
                .findFirst() //첫번째 요소 반환
    }

    // 스트림과 람다를 devsco에 많이 사용해보자
}
