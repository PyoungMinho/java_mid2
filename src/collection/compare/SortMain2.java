package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {

  public static void main(String[] args) {
    Integer[] arr = {3,2,1};
    System.out.println(Arrays.toString(arr));

    System.out.println("Compare 비교");
    Arrays.sort(arr, new AscComparator());
    System.out.println("Asc Comparator: " + Arrays.toString(arr));
    Arrays.sort(arr, new DescComparator());
//    Arrays.sort(arr, new AscComparator().reversed()); sort 뒤집기 reversed 제공
    System.out.println("Desc Comparator: " + Arrays.toString(arr));
  }

  static class AscComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
      System.out.println("o1 =  " + o1 + ", o2 = " + o2);
      return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
    }
  }

  static class DescComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
      System.out.println("o1 =  " + o1 + ", o2 = " + o2);
      return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1) * -1;
    }
  }
}
