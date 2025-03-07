package collection;

public class testmain {
  public static void main(String[] args) {
    String str = "abacabcd";
    int length = str.length();
    boolean[] seen = new boolean[256];

    String result = comp(str,length-1,seen);

    System.out.println(result);

  }
  static String[] s = new String[3];

  static void func(String[] s, int size){
    for(int i =1; i<size; i++){
      if(s[i-1].equals(s[i])){
        System.out.print("O");
      }else System.out.print("N");
    }
    for (String m : s) {
      System.out.println(m);
    }
  }



  public static String comp(String str, int idx, boolean[] seen){
    if(idx < 0) return "";

    char c = str.charAt(idx);

    String result = comp(str, idx-1, seen);

    if(!seen[c]){      // char를 아스키코드로 사용한다 같은 문자가 들어오면 더하지 않겠다는 식
      seen[c] = true;
      result = c +result;
    }

    return result;
  }
}
