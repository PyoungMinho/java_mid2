package wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = 10;
        System.out.println(newInteger);
        int a = Integer.parseInt("10");

        System.out.println("a : "+a );


        // parseInt 는 기본형 , valueOf는 래퍼타입
        // 내가 깨달은 래퍼타입을 사용하는 이유
        // 1. 메소드를 정의하거나 이미 존재하는 메서드를 편하게 사용할 수 있따.
        // 2. 래퍼타입은 null을 값으로 가질 수 있다. ( DB에 사용하기 용이하겠다 )
        // 3. 기본형 보다는 성능이 안좋다.
    }
}
