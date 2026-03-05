package com.iut.bordeaux.courses.checkpoint1_calculator;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import com.iut.bordeaux.courses.common.ICalculator;

class CalculatorTest {

    @Test
    void testSum5() {
        // Arrange
        ICalculator calc = new CalculatorImpl();
        int a = 2;
        int b = 3;
        int result = 5;

        // Act
        int actual = calc.sum(a, b);

        // Assert
        assertThat(result).isEqualTo(actual);
    }

    @Test
    void testSum8() {
        // Arrange
        ICalculator calc = new CalculatorImpl();
        int a = 4;
        int b = 4;
        int result = 8;

        // Act
        int actual = calc.sum(a, b);

        // Assert
        assertThat(result).isEqualTo(actual);
    }

    @Test
    void testSubstractMinus1() {
        // Arrange
        ICalculator calc = new CalculatorImpl();
        int a = 2;
        int b = 3;
        int result = -1;

        // Act
        int actual = calc.substract(a, b);

        // Assert
        assertThat(result).isEqualTo(actual);
    }

    @Test
    void testSubstract7() {
        // Arrange
        ICalculator calc = new CalculatorImpl();
        int a = 10;
        int b = 3;
        int result = 7;

        // Act
        int actual = calc.substract(a, b);

        // Assert
        assertThat(result).isEqualTo(actual);
    }

    // TODO: Write a test for multiplty method, result must be equal to 6
    @Test
    void testMultiply6() {
        // Arrange
        ICalculator calc = new CalculatorImpl();
        int a = 2;
        int b = 3;
        int result = 6;

        // Act
        int actual = calc.multiply(a, b);

        // Assert
        assertThat(result).isEqualTo(actual);
    }

    // TODO: Write a test for multiplty method, result must be equal to 12
    @Test
    void testMultiply12() {
        // Arrange
        ICalculator calc = new CalculatorImpl();
        int a = 2;
        int b = 6;
        int result = 12;

        // Act
        int actual = calc.multiply(a, b);

        // Assert
        assertThat(result).isEqualTo(actual);
    }

    // TODO: Write a test for divide method, result me be equal to 6
    @Test
    void testDivide6() {
        // Arrange
        ICalculator calc = new CalculatorImpl();
        int a = 12;
        int b = 2;
        int result = 6;

        // Act
        int actual = calc.divide(a, b);

        // Assert
        assertThat(result).isEqualTo(actual);
    }

    // TODO: Write a test for divide method, result me be equal to 3
    @Test
    void testDivide3() {
        // Arrange
        ICalculator calc = new CalculatorImpl();
        int a = 12;
        int b = 4;
        int result = 3;

        // Act
        int actual = calc.divide(a, b);

        // Assert
        assertThat(result).isEqualTo(actual);
    }
}