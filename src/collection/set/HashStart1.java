package collection.set;

import java.util.Arrays;

public class HashStart1 {

    public static void main(String[] args) {
        Integer[] inputArray = new Integer[4];
        inputArray[0]=1;
        inputArray[1]=2;
        inputArray[2]=5;
        inputArray[3]=8;
        System.out.println("inputArray = "+ Arrays.toString(inputArray));

        int searchValue = 8;
        for (Integer i : inputArray){
            if(i == searchValue){
                System.out.println(i);
            }
        }
        //Hash 메커니즘 이해완료
    }
    // Refactoring 강의 듣기 실행중
}
