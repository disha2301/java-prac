package com.gevernova;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberUtilsTest {
    NumberUtils utils = new NumberUtils();

    // This test will run for each value in the list (2, 4, 6)
    @ParameterizedTest
    @ValueSource(ints = {2,4,6})
    void testEven_withEvenNumbers(int num){
        assertTrue(utils.isEven(num)); // should return true for even numbers
    }
    // This test will run for each value in the list (9,7,11)
    @ParameterizedTest
    @ValueSource(ints = {9,7,11})
    void testEven_withOddNumbers(int num){
        assertTrue(utils.isEven(num));
    }
}
