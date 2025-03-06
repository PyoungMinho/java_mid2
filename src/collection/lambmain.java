package collection;

public class lambmain {
  public static void main(String[] args) {
    SumFunction add = (a,b)->a+b;

    int result = add.sum(5,3);
    System.out.println(result);
    
    SumFunction add2 = add;
    int result2 = add2.sum(5,3); //add 를 재활용
    System.out.println(result2);
  }


  interface SumFunction{
    int sum(int a, int b);
  }
} // 인터페이스를 람다로 재정의하기 
