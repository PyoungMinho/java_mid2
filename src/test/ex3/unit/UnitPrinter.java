package test.ex3.unit;

import test.ex3.Shuttle;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> t1) {
        T unit = t1.out();
        System.out.println("이름 = " +unit.getName() +", "+"HP = " + unit.getHp());
//      System.out.println("이름 = " +t1.getName() +", "+"HP = " + t1.getHp()); 오류
        // t1은 Shuttle<Marine>,Shuttle<Zealot>의 형태이다 어떻게 t1으로 바로 Marine의 메서드를 사용하겠는가!
        // Suttle에 메서드 t1.out(); t1.블라블라는 가능하다.
    }

    public static void printV2(Shuttle<? extends BioUnit> t2) {
        BioUnit unit = t2.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }


}
