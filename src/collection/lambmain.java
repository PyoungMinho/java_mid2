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

/*

def cnt_occ(s,sub):
cnt = 0
  for i in range(len(s) - len(sub) +1):
  if s[i:i+len(sub)] == sub:
cnt += 1
  return cnt

  a = "abdcavcaavca"
p1 ="ab"
p2 = "ca"

out = f"ab{cnt_occ(a,p1)}ca{cnt_occ(a,p2)}"
print(out)
*/
