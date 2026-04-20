package com.JUnit.AdvancedJUnitPrograms.TestingDateFormatter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    @Test
    void testValidDate() {
        assertEquals("23-01-2026", DateFormatter.formatDate("2026-01-23"));
        assertEquals("05-12-2025", DateFormatter.formatDate("2025-12-05"));
    }

    @Test
    void testInvalidDate() {
        assertNull(DateFormatter.formatDate("2026/01/23")); // wrong format
        assertNull(DateFormatter.formatDate("23-01-2026")); // wrong format
        assertNull(DateFormatter.formatDate("invalid-date")); // not a date
    }

    @Test
    void testNullDate() {
        assertNull(DateFormatter.formatDate(null));
    }
}
