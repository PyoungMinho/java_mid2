package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //index 입력: O(1)
        System.out.println("==index 입력: O(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        //index 변경: O(1)
        System.out.println("==index 변경: O(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        //index 조회: O(1)
        System.out.println("==index 조회: O(1)==");
        System.out.println("arr[2] = " + arr[2]);

        //검색: O(n)
        System.out.println("==배열 검색: O(n)==");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]:" + arr[i]);
            if (arr[i] == value) {
                System.out.println(value + " 찾음");
                break;
            }
        }


        try{
            System.out.println("try -> ");
        }catch (Exception e){

        }finally {
            System.out.println("finally !!");
        }
    }
    // 배열의 시작 참조 + (자료의 크기 * 인덱스 위치)
    //배열의 경우 인덱스를 사용하면 한번의 계산으로 매우 효율적으로 자료의 위치를 찾을 수 있다. 인덱스를 통한 입력, 변경,
    // 조회 모두 한번의 계산으로 필요한 위치를 찾아서 처리할 수 있다. 정리하면 배열에서 인덱스를 사용하는 경우 데이터가 아무리 많아도
    //배열의 검색 한 번의 연산으로 필요한 위치를 찾을 수 있다.
}
