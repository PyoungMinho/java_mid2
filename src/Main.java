// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        int count =0;
        for(int i =1; i<10; i++){
            if((i%2 ==0 || i%3==0) && i%6 !=0) System.out.println(i);

        }

    }
}