package com.gevernova;

import com.gevernova.MathUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsTest {
    @Test
    void testDivide_ValidInput(){
        MathUtils mathUtils = new MathUtils();
        assertEquals(5, mathUtils.divide(10,2));
    }
    @Test
    void testDivide_ThrowsExcetion(){
        MathUtils mathUtils = new MathUtils();
        ArithmeticException exception = assertThrows(ArithmeticException.class, ()-> mathUtils.divide(10,0));
    }
}
