package test.ex3;

import test.ex3.unit.BioUnit;
import test.ex3.unit.Marine;

public class Shuttle<T extends BioUnit>{

    private T unit;


    public void in(T t) {
        this.unit = t;
    }

    public T out() {
        return unit;
    }

    public void showInfo() {
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
}
