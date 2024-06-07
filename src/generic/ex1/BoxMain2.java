package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {

        ObjectBox objectBox = new ObjectBox();
        objectBox.setValue(10);

        Object o = objectBox.getValue();
        Integer integer1 = (Integer) o;

        Integer integer2 = (Integer) objectBox.getValue();

        System.out.println("integer = " + integer1);
        System.out.println("integer2 = " + integer2);


        GenericBox<Integer> genericBox= new GenericBox<>();
        genericBox.setValue(111);
        int i = genericBox.getValue();

        System.out.println("i = " + i);

    }
}
