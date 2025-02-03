package Clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ClassMetaMain {
    public static void main(String[] args) throws ClassNotFoundException {

        Class clazz = String.class; // class가 가지는 메타데이터를 가진 Class

//        Class clazz2 = new String().getClass();
//        Class clazz3 = Class.forName("java.lang.String");


        // 모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        // 모든 메서드 출력
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        // 상위 클래스 출력
        Class[] classes = clazz.getDeclaredClasses();
        for (Class clazz1 : classes) {
            System.out.println(clazz1.getSuperclass().getName());
        }

        // 상위 클래스 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println(i.getName());
        }


        // 환경변수 읽기
        System.out.println("getenv : "+ System.getenv());

        // 배열 고속 복사
        char[] origin = {'A','B','C','D','E','F'};
        char[] copyArr = new char[origin.length];
        System.arraycopy(origin, 0, copyArr, 0, origin.length); // 처음 봄
        System.out.println("그냥 프린트 : "+copyArr); // 주소값
        System.out.println(copyArr); // 실제값
        System.out.println(Arrays.toString(copyArr));

          /*
          문자열 연결(+)을 사용하는 경우:  배열의 toString() 메서드가 호출되어 객체의 참조값(주소값처럼 보이는 값)을 출력합니다.
          char[]를 단독으로 출력하는 경우:   char[]는 문자열처럼 처리되므로 배열의 요소들이 연결되어 실제 문자 값이 출력됩니다.
          */


    }
}
