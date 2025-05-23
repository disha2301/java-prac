package com.gevernova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {
    TemperatureConverter converter = new TemperatureConverter();

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.001); // Freezing point
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.001); // Boiling point
        assertEquals(98.6, converter.celsiusToFahrenheit(37), 0.001); // Human body temp
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.001); // Freezing point
        assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.001); // Boiling point
        assertEquals(37.0, converter.fahrenheitToCelsius(98.6), 0.001); // Human body temp
    }
}
