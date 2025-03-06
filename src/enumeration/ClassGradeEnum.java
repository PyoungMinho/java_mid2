package enumeration;

public enum ClassGradeEnum {

    GOLD, SILVER, PLATINUM
}



/* 같은 코드 ENUM이 생기기 전에 이렇게 적었었음
* public class ClassGradeEnum extend Enum{
*   public static final ClassGradeEnum GOLD = new ClassGradeEnum();
*   public static final ClassGradeEnum SILVER = new ClassGradeEnum();
*   public static final ClassGradeEnum PLATINUM = new ClassGradeEnum();
*
*   private ClassGradeEnum(){}
* }
*
* */