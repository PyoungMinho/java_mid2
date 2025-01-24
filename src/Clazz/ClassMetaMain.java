package Clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

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
    }
}
