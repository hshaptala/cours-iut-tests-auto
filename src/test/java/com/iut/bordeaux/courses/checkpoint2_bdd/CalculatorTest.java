package com.iut.bordeaux.courses.checkpoint2_bdd;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import com.iut.bordeaux.courses.common.ICalculator;

class CalculatorTest {

    ICalculator calc = new CalculatorImpl();

    @Test
    void given2And3_whenSum_thenReturns5() {
        // GIVEN
        int a = 2;
        int b = 3;
        int expected = 5;

        // WHEN
        int result = calc.sum(a, b);

        // THEN
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void given5And3_whenSum_thenReturns8() {
        // GIVEN
        int a = 5;
        int b = 3;
        int expected = 8;

        // WHEN
        int result = calc.sum(a, b);

        // THEN
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void given2And3_whenSubstract_thenReturnsMinus1() {
        // GIVEN
        int a = 2;
        int b = 3;
        int expected = -1;

        // WHEN
        int result = calc.substract(a, b);

        // THEN
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void given7And0_whenSubstract_thenReturns7() {
        // GIVEN
        int a = 7;
        int b = 0;
        int expected = 7;

        // WHEN
        int result = calc.substract(a, b);

        // THEN
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void given2And3_whenMultiply_thenReturns6() {
        // GIVEN
        int a = 2;
        int b = 3;
        int expected = 6;

        // WHEN
        int result = calc.multiply(a, b);

        // THEN
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void given2And6_whenMultiply_thenReturns12() {
        // GIVEN
        int a = 2;
        int b = 6;
        int expected = 12;

        // WHEN
        int result = calc.multiply(a, b);

        // THEN
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void given12And2_whenDivide_thenReturns6() {
        // GIVEN
        int a = 12;
        int b = 2;
        int expected = 6;

        // WHEN
        int result = calc.divide(a, b);

        // THEN
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void given6And2_whenDivide_thenReturns3() {
        // GIVEN
        int a = 6;
        int b = 2;
        int expected = 3;

        // WHEN
        int result = calc.divide(a, b);

        // THEN
        assertThat(expected).isEqualTo(result);
    }
}