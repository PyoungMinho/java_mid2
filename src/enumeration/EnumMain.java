package enumeration;

public class EnumMain {
    public static void main(String[] args) {

        ClassGrade grade1 = ClassGrade.BASIC;
        ClassGrade grade2 = ClassGrade.GOLD;

        // 출력 예제
        System.out.println("ClassGrade 1: " + grade1);
        System.out.println("ClassGrade 2: " + grade2);

        // 객체 비교
        if (grade1 == ClassGrade.BASIC) {
            System.out.println("grade1은 BASIC입니다.");
        }


        // Enum 타입 상수를 사용
        ClassGradeEnum grade3 = ClassGradeEnum.GOLD; // 타입 안정성 -> ENUM에 정의한거 말고 다른거 들어오면 컴파일 오류
        ClassGradeEnum grade4 = ClassGradeEnum.SILVER;
        System.out.println("상수 타입 GOLD 확인 : "+ClassGradeEnum.GOLD.getClass());
        // 출력 예제
        System.out.println("ClassGradeEnum 1: " + grade1);
        System.out.println("ClassGradeEnum 2: " + grade2);

        // Enum 값 비교
        if (grade3 == ClassGradeEnum.GOLD) {
            System.out.println("grade1은 GOLD입니다.");
        }

        // 모든 Enum 값을 순회 (values() 사용)
        System.out.println("모든 ClassGradeEnum 값:");
        for (ClassGradeEnum grade : ClassGradeEnum.values()) {
            System.out.println(grade);
        }
    }
}
