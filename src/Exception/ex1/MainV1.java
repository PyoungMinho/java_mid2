package Exception.ex1;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
//        NetworkServiceV1_1 serviceV1 = new NetworkServiceV1_1();
//        NetworkServiceV1_2 serviceV1 = new NetworkServiceV1_2(); // 오류 있을때 알맞게 오류로그 발생 but disconnect 가 호출이 안되죠
        NetworkServiceV1_3 serviceV1 = new NetworkServiceV1_3();   // disconnect 를 호출하는 수정

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")){
                break;
            }
            serviceV1.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");

    }
}
