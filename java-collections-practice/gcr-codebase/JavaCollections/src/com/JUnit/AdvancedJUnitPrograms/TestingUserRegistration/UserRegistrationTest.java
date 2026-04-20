package com.JUnit.AdvancedJUnitPrograms.TestingUserRegistration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    @Test
    void testValidRegistration() {
        assertTrue(UserRegistration.registerUser("Harshal", "harshal@example.com", "Password1"));
        assertTrue(UserRegistration.registerUser("Alice123", "alice@mail.com", "StrongPass9"));
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> 
            UserRegistration.registerUser("", "harshal@example.com", "Password1")
        );
        assertThrows(IllegalArgumentException.class, () -> 
            UserRegistration.registerUser(null, "harshal@example.com", "Password1")
        );
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> 
            UserRegistration.registerUser("Harshal", "harshal.com", "Password1")
        );
        assertThrows(IllegalArgumentException.class, () -> 
            UserRegistration.registerUser("Harshal", null, "Password1")
        );
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> 
            UserRegistration.registerUser("Harshal", "harshal@example.com", "password") // no uppercase, no digit
        );
        assertThrows(IllegalArgumentException.class, () -> 
            UserRegistration.registerUser("Harshal", "harshal@example.com", "Pass") // too short
        );
        assertThrows(IllegalArgumentException.class, () -> 
            UserRegistration.registerUser("Harshal", "harshal@example.com", null) // null password
        );
    }
}
