package collection.Inheritance;

public class MainInheritance {
    public static void main(String[] args) {

        Son son = new Son();
        son.punch();
        System.out.println(Mom.ages);

        // 객체 생성 없이 정적 메서드 호출
        Ex.incrementCnt();
        Ex.incrementCnt();

        System.out.println(Ex.cnt);


        // how many Kia car
        new Kia();
        new Kia();
        new Kia();
        new Kia();
        new Bmw();
        new Bmw();
        new Bmw();

        System.out.println("차량의 갯수 : " + Car.cnt);
        System.out.println("바퀴의 갯수 : " + Car.wheel);
        System.out.println("기아 차량의 갯수 : " + Kia.cnt);
        System.out.println("기아 차량의 갯수 : " + Kia.wheel);
        System.out.println("bmw 차량의 갯수 : " + Bmw.cnt);
        System.out.println("bmw 차량의 갯수 : " + Bmw.wheel);

        // static 변수를 쓰는 이유는 클래스이름.변수로 접근하여서 클래스끼리 공유하는건데
        // 그걸 굳이 객체 생성해서 접근할 이유가 없다.
        // 객체 생성해서 접근하는 경우는 static을 안붙인 변수에 접근하는 경우에 적합하다

        // static 변수는 클래스 전체에서 공유되는 값이므로 클래스 이름을 통해 접근하고, 인스턴스 변수는 각 객체에 속하는 값이므로 객체를 통해 접근하는 방식이 맞음.

        int m = 4620;

        int a = m /1000;
        int b = m % 1000 / 500;
        int c = m % 500 / 100;
        int d = m % 100 / 10 ;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int[] myArr = {8, 1, 2, 9, 1};
        int size = myArr.length; // 배열 크기 계산

        System.out.println("배열 최대값: " + maxVal(myArr, size)); // 결과 출력
        System.out.println("배열 최대값2: " + maxVal2(myArr)); // 결과 출력


        int solution = solution(10);
        System.out.println("answer : "+ solution);

    }
    public static int maxVal(int[] arr, int size) {
        if (size == 1) {
            return arr[0]; // 배열 크기가 1인 경우, 첫 번째 값 반환
        } else {
            int max = maxVal(arr, size - 1); // 재귀 호출로 나머지 배열의 최대값 찾기
            return Math.max(arr[size - 1], max); // 현재 값과 이전 최대값 비교 후 반환
        }
    }

    public static int maxVal2(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            max = Math.max(max, j);
        }
        return max;
    }


    public static int solution(int n) {
        int answer = 0;

        for(int i = 2; i <= n; i++){
            boolean chk = true;
            for(int j = 2; j*j <= i; j++){
                if(i % j == 0){
                    chk = false;
                    break;
                }
            }
            if(chk){
                answer++;
            }
        }

        return answer;

    }



}
