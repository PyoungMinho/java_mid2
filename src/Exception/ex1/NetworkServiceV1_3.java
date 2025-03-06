package Exception.ex1;


public class NetworkServiceV1_3 {

    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV1_1 client = new NetworkClientV1_1(address);
        client.initError(data);

        String connectResult = client.connect(); // But 반환값을 받아서 로직을 처리하면 한눈에 흐름을 알아보기 어렵다 그래서 자바 예외처리가 존재한다.
        if(isError(connectResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
        }else {
            String sendResult = client.send(data);
            if(isError(sendResult)){
                System.out.println("[네트워크 오류 발생] 오류 코드 : "+sendResult);
            }
        }

        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
