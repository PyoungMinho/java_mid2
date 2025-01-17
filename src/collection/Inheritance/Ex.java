package collection.Inheritance;

public class Ex {
    public static int cnt =0;

    public static void incrementCnt(){
        cnt++;
    }

    // 기존에 static 변수를 생성자로 초기화하였다 경고발생!!
    // static 써놓고 iv 처럼 사용하는 설계를 경고해줌 너 스태틱 변수를 만들고 왜 굳이 객체 생성해서 cnt를 올려??
    // static 메서드를 만들어서 cnt 증가하게 만들어서 설계 경고를 제거함
}
