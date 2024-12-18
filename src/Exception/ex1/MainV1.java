package Exception.ex1;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
        NetworkServiceV1 serviceV1 = new NetworkServiceV1();

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
