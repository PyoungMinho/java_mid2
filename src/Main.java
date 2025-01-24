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

        String str1 = "ABC";
        String str2 = "ABC";
        String str3 = new String("ABC");
        String str4 = str1;

        System.out.println("Str1 == str2 : "+ (str1 == str2));
        System.out.println("Str1 == str4 : "+(str1 == str4));
        System.out.println("Str2 == str3 : "+(str2 == str3));
        System.out.println("Str2 == str4 : "+(str2 == str4));

        System.out.println("Str1.equls(str2): "+ str1.equals(str2));
        System.out.println("Str1.equls(str4): "+ str1.equals(str4));
        System.out.println("Str2.equls(str3): "+ str2.equals(str3));
        System.out.println("Str2.equls(str4): "+ str2.equals(str4));


        Integer num1 = 128;
        Integer num2 = 128;

        Integer num3 = 127;
        Integer num4 = 127;

        Integer num5 = -128;
        Integer num6 = -128;

        Integer num7 = -129;
        Integer num8 = -129;

        System.out.println("num1 == num2 : "+ (num1 == num2) );
        System.out.println("num1 == num3 : "+ (num1 == num3) );
        System.out.println("num3 == num4 : "+ (num3 == num4) );
        System.out.println("num3 == num4 : "+ (num3 == num4) );
        System.out.println("num5 == num6 : "+ (num5 == num6) ); // -128 ~ 127
        System.out.println("num7 == num8 : "+ (num7 == num8) ); // -128 ~ 127


        int n1 = 100;
        Integer n2 = 100;

        System.out.println("n1 == n2 : "+ (n1 == n2) ); // true


        int aaa = 128;
        Integer bbb = 128;

        System.out.println("aaa == bbb : "+ (aaa == bbb) ); // true

        String ace1 = "A";
        String ace2 = "A";
        String ace3 = new String("A");
        String ace4 = new String("A");


        System.out.println("new String () ace1 == ace2 : " + (ace1 == ace2) );
        System.out.println("new String () ace3 == ace4 : " + (ace3 == ace4) );
        System.out.println("new String () equals 비교: " + str1.equals(str2));

    }
}