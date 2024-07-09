package collection.set;

import java.util.Arrays;

public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println("set = " + set);

        boolean result = set.add(4);
        System.out.println("중복 저장 결과 = " + result);
        System.out.println(set);

        System.out.println("set.contins(3) = " + set.contains(3));
        System.out.println("set.contins(99) = " + set.contains(99));
    }

}
