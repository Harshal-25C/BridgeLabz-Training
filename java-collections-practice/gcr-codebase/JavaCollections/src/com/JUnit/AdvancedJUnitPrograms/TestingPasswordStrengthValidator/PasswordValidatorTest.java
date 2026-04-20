package com.JUnit.AdvancedJUnitPrograms.TestingPasswordStrengthValidator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValid("Password1"));
        assertTrue(PasswordValidator.isValid("MyPass123"));
    }

    @Test
    void testInvalidPasswordTooShort() {
        assertFalse(PasswordValidator.isValid("Pass1"));
    }

    @Test
    void testInvalidPasswordNoUppercase() {
        assertFalse(PasswordValidator.isValid("password1"));
    }

    @Test
    void testInvalidPasswordNoDigit() {
        assertFalse(PasswordValidator.isValid("Password"));
    }

    @Test
    void testInvalidPasswordNull() {
        assertFalse(PasswordValidator.isValid(null));
    }
}
