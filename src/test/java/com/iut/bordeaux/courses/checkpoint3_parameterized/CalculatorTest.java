package com.iut.bordeaux.courses.checkpoint3_parameterized;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import com.iut.bordeaux.courses.common.ICalculator;

class CalculatorTest {

    ICalculator calc = new CalculatorImpl();

    // TODO:
    // - refactor test cases using Parameterized tests
    // - find and test an "edge case"

    @ParameterizedTest
    @CsvSource({
            "2,3,5"
    })
    void given2And3_whenSum_thenReturn5(int a, int b, int expectedResult) {
        // GIVEN : Params CsvSource

        // WHEN
        int result = calc.sum(a, b);

        // THEN
        assertThat(result).isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @CsvSource({
            "5,3,8"
    })
    void given5And3_whenSum_thenReturn8(int a, int b, int expectedResult) {
        // GIVEN : Params CsvSource

        // WHEN
        int result = calc.sum(a, b);

        // THEN
        assertThat(result).isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @CsvSource({
            "2,3,-1"
    })
    void given2And3_whenSubstract_thenReturnMinus1(int a, int b, int expectedResult) {
        // GIVEN : Params CsvSource

        // WHEN
        int result = calc.substract(a, b);

        // THEN
        assertThat(result).isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @CsvSource({
            "7,0,7"
    })
    void given7And0_whenSubstract_thenReturn7(int a, int b, int expectedResult) {
        // GIVEN : Params CsvSource

        // WHEN
        int result = calc.substract(a, b);

        // THEN
        assertThat(result).isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @CsvSource({
            "2,3,6"
    })
    void given2And3_whenMultiplty_thenReturn6(int a, int b, int expectedResult) {
        // GIVEN : Params CsvSource

        // WHEN
        int result = calc.multiply(a, b);

        // THEN
        assertThat(result).isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @CsvSource({
            "2,6,12"
    })
    void given2And6_whenMultiplty_thenReturn12(int a, int b, int expectedResult) {
        // GIVEN : Params CsvSource

        // WHEN
        int result = calc.multiply(a, b);

        // THEN
        assertThat(result).isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @CsvSource({
            "12,2,6"
    })
    void given12And2_whenDivide_thenReturn6(int a, int b, int expectedResult) {
        // GIVEN : Params CsvSource

        // WHEN
        int result = calc.divide(a, b);

        // THEN
        assertThat(result).isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @CsvSource({
            "6,2,3"
    })
    void given6And2_whenDivide_thenReturn3(int a, int b, int expectedResult) {
        // GIVEN : Params CsvSource

        // WHEN
        int result = calc.divide(a, b);

        // THEN
        assertThat(result).isEqualTo(expectedResult);
    }
}