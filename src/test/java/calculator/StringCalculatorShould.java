package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
 //   ----------------
    @Test
    public void emptyStringShouldReturnZero() {
        StringCalculator sut = new StringCalculator();
        assertEquals(0, sut.calculate(""));
    }
    
    @Test
    public void oneNumberShouldReturnItseft() {
        StringCalculator sut = new StringCalculator();
        assertEquals(3, sut.calculate("3"));
    }
    @Test
    public void twoNumbersShouldBeAdded() {
        StringCalculator sut = new StringCalculator();
        assertEquals(7, sut.calculate("2,5"));
    }
}