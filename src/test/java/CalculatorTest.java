import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd(){
        int a = 3;
        int b = 7;

        Calculator calculator = new Calculator();

        int vysledek = calculator.add(a, b);

        Assertions.assertEquals(10, vysledek);
    }
    
    @Test
    public void testAddWithError(){
        int a = -3;
        int b = 3;

        Calculator calculator = new Calculator();

        int vysledek = calculator.add(a, b);

        Assertions.assertEquals(0, vysledek);
    }
}
