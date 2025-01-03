package Exception.basic.Unchecked;

public class UncheckedThrowMain {

    public static void main(String[] args) {
        Service service = new Service();
        service.callThrow();
        System.out.println("정상 종료");

        // 언체크 예외의 장단점

        /* 언체크 예외는 예외를 잡아서 처리할 수 없을 때, 예외를 밖으로 던지는 throws예외를 생략할 수 있다. 이것 때문에 장점과 단점이 동시에 존재한다.
        *
        *   장점 : 신경쓰고 싶지 않은 언체크 예외를 무시할 수 있다. 체크 예외의 경우 처리할 수 없는 예외를 밖으로 던지려면 항상 throws를 선언하지만 , 언체크는 이 부분을 생략가능하다.
        *   단점 : 언체크 예외는 개발자가 실수로 예외를 누락할 수 있다. 반면에 체크 예외는 컴파일러가 잡아준다.
        *
        * 정리!!!
        * 체크 예외와 언체크 예외의 차이는 예외를 처리할 수 없을 때 예외를 밖으로 던지는 부분에 있다. 이 부분을 필수로 선언해야 하는가 생략할 수 있는가의 차이다.
        * 실무 트렌드는 체크예외는 거의 잡지 않는다. 예외 처리를 잘 해야 탄탄한 프로그래밍이 가능하다.
        */

        System.out.println("4+5 : = " + 4 + 5);
        System.out.println("4+5 : = " + (4 + 5));
    }
}
