package Jungbo;

public class codeMain {
    public int anInt =20;
    static int bInt = 0;

    public static void main(String[] args) {
        // 2022년 3회 예제
        int n;
        int k;
        int s=0;
        int el = 0;

        for(n =6; n<=30; n++){
            s = 0;
            k = n/2;
            for (int j=1; j<=k; j++){
                if(n % j ==0 ) s = s+j;
            }
            if(s==n) el++;
        }
        System.out.println("el: " + el);

        int a=0;
        for (int i =1; i<999; i++){
            if (i%3 == 0 && i % 2 !=0) a= i; // 3으로 나눠지지만 2로 안나눠 지는 마지막 숫자 993
        }
        System.out.println("a: " + a);




        // 2023년 1회 예제

        int a1;
        a1 =10;
        Static.b =a ;

        Static st = new Static();

        System.out.println(Static.b++);
        System.out.println(st.b);
        System.out.println(a);
        System.out.println(st.a);

        // Java에서 부모와 자식 관계에 대한 질문을 많이한다.
        // C언어는 포인터로 헷갈리게 하는편
        // Python {} dic아니면 Set
    }
}
