package collection;

public class testmain {
  public static void main(String[] args) {
    String str = "abacabcd";
    int length = str.length();
    boolean[] seen = new boolean[256];

    String result = comp(str,length-1,seen);

    System.out.println(result);
  }


  public static String comp(String str, int idx, boolean[] seen){
    if(idx < 0) return "";

    char c = str.charAt(idx);

    String result = comp(str, idx-1, seen);

    if(!seen[c]){
      seen[c] = true;
      result = c +result;
    }

    return result;
  }
}
