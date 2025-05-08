package com.gevernova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest {
    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("StrongPass1")); // Valid: has uppercase, digit, and length >= 8
    }

    @Test
    void testShortPassword() {
        assertFalse(validator.isValid("Ab1")); // Too short
    }

    @Test
    void testNoUppercase() {
        assertFalse(validator.isValid("strongpass1")); // No uppercase letter
    }

    @Test
    void testNoDigit() {
        assertFalse(validator.isValid("StrongPass")); // No digit
    }

    @Test
    void testNullPassword() {
        assertFalse(validator.isValid(null)); // Null input
    }
}
