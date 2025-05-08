package com.gevernova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    UserRegistration registration = new UserRegistration();

    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() ->
                registration.registerUser("disha", "disha@example.com", "secure123")
        );
    }

    @Test
    void testInvalidUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                registration.registerUser("", "test@example.com", "secure123")
        );
        assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                registration.registerUser("user", "invalidemail", "secure123")
        );
        assertEquals("Invalid email", exception.getMessage());
    }

    @Test
    void testInvalidPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                registration.registerUser("user", "user@example.com", "123")
        );
        assertEquals("Password must be at least 6 characters long", exception.getMessage());
    }
}
