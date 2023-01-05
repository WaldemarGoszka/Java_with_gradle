package pl.zajavka._warsztaty.w8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

// test metody testAdd()

    @Test
     void testSubtract() {

// given

// when

// then
        Assertions.assertEquals(10, Calculator.add(5, 5));
        Assertions.assertEquals(15, Calculator.add(5, 5));

    }

    @Test
    void testMultiply() {

// given
        int left = 5;
        int right = 7;
        Integer expected = 35;

// when
        Integer result = Calculator.multiply(left, right);

// then
        Assertions.assertEquals(expected, result);

    }

    @Test
    void testDivide() {

// given
        int left = 15;
        int right = 7;
        Integer expected = 2;

// when
        Integer result = Calculator.divide(left, right);

// then
        Assertions.assertEquals(expected, result);

    }
}
