package Exception.basic.checked;

public class CheckedThrowMain {

    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow();
        System.out.println("정상 흐름");


        // 체크 예외의 장단점
        /*
        * 체크 예외는 예외를 잡아서 처리할 수 없을때, 예외를 밖으로 던지는 throws 예외를 필수로 선언해야 한다. 그렇지 않으면 컴파일 오류가 발생한다.
        * 이것 때문에 장점과 단점이 동시에 존재한다.
        *
        *   장점 : 개발자가 실수로 예외를 누락하지 않도록 컴파일러를 통해서 문제를 잡아주는 안전 장치이다. 이를 통해 개발자는 어떤 체크 예외가 발생하는지 쉽게 파악할 수 있다.
        *   단점 : 하지만 실제로는 개발자가 모든 체크 예외를 반드시 잡거나 던지도록 처리해야 하기 때문에, 번거로운 일이 된다. 크게 신경쓰고 싶지 않은 예외까지 모두 챙겨야한다.
        *
        * 정리 !!!
        * 체크 예외는 잡아서 직접 처리하거나 또는 밖으로 던지거나 둘중 하나를 개발자가 직접 명시적으로 처리해야한다. 그렇지 않으면 컴파일 오류가 발생한다.
        * */
    }
}
