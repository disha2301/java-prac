package com.gevernova;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerformanceUtilsTest {
    PerformanceUtils utils = new PerformanceUtils();
    // Fails if the method takes more than 2 seconds
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTask_Performance(){
        String result = utils.longRunningTask();
        assertEquals("Completed",result);
    }

}
