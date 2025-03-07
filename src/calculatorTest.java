import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import testprac.Calculator;

public class calculatorTest {

  @Test
  void 덧셈_기능_테스트() {
    // given
    Calculator calculator = new Calculator();

    // when
    int result = calculator.add(3,5);

    // then
    assertEquals(8,result);
  }

  @Test
  void 뺄셈_기능_테스트(){
    // given
    Calculator calculator = new Calculator();

    // when
    int subs = calculator.subs(5, 3);

    // then
    assertEquals(2,subs);

  }

}