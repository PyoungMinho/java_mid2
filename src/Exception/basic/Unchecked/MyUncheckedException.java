package Exception.basic.Unchecked;

/*
* RuntimeException을 상속받은 예외는 언체크 예외이다.
* */
public class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}
