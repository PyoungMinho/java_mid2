package Exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException{
        /*
        * throw -> 실제로 예외를 발생시킨다
        * throws -> 나는 예외를 처리할 수 없어 던질거야
        * */
        // 문제상황
        throw new MyCheckedException("ex");
    }
}
