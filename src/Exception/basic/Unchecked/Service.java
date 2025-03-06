package Exception.basic.Unchecked;

/*
* 언체크 예외는
* 예외를 잡거나, 던지지 않아도 된다.
* 예외를 잡지 않으면 자동으로 밖으로 던진다.
* */

public class Service {

    Clinet clinet = new Clinet();

    /*
    * 필요한 경우 예외를 잡아서 처리할 수 있다.
    * */

    public void callCatch(){
        try {
            clinet.call();
        }catch (MyUncheckedException e){
            // 예외처리 로직
            System.out.println("예외 처리, message : "+e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    /*
    * 예외를 잡지 않아도 된다. 자연스럽게 상위로 넘어간다.
    * 체크 예외와 다르게 throws 선언을 하지 않아도 됩니다.
    */
    public void callThrow(){
        clinet.call();
    }
}
