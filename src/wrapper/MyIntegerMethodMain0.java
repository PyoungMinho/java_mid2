package wrapper;

public class MyIntegerMethodMain0 {

    public static void main(String[] args) {

        int value = 10;
        int i1 = compareTo(value, 5);
        int i2 = compareTo(value, 10);
        int i3 = compareTo(value, 20);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }

    public static int compareTo(int value,int tartget){
        if(value < tartget )return -1;
        else if(value > tartget)return 1;
        else return 0;
    }
}
