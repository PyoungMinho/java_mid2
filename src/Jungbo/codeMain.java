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

        // 2023 년 2회

//        #include <stdio.h>
//
//        int main() {
//
//            int n[5] = {5,4,3,2,1};
//            int i;
//
//            for(i=0;i<5; i++){
//                printf("%d",n[(i+1)%5] ); //  4 3 2 1 5 로 출력하는 방법
//            }
//            return 0;
//        }

        int m = 4620 ;
        int q =  m / 1000;
        int w =  m % 1000/500;
        int e =  m % 500/100;
        int r =  m % 100/10 ;

        System.out.println(q); // 천원
        System.out.println(w); // 오백원
        System.out.println(e); // 백원
        System.out.println(r); // 십원


//        #include <stdio.h>
//        #include <stdlib.h>
//
//        char n[30];
//        char*name(){
//            printf(입력 : );
//            gets(n);
//            return n;
//        }
//
//        int main() {
//
//            char*test1;
//            char*test2;
//            char*test3;
//
//            test1 =name();
//            test2 =name();
//            test3 =name();
//
//            printf("%s\n",test1);
//            printf("%s\n",test2);
//            printf("%s",test3);     배열을 공유하기 때문에 마지막에 들어온 값이 세번 나오는 케이스
//
//            return 0;
//        }

//        #include <stdio.h>
//
//        int main() {
//            int n[3] = {73,95,82};
//            int sum = 0 ;
//
//            for(int i=0; i<3; i++){
//                sum +=n[i];
//            }
//
//            switch (sum/30) {
//                case 10:
//                case 9:
//                    printf("A");
//                case 8:
//                    printf("B");
//                case 7:
//                case 6:
//                    printf("C");
//                default:
//                    printf("D");  // break가 없어서 쭉 흐른다. default도 출력됨  BCD
//            }
//            return 0;
//        }

    }
}
