package ru.clevertec.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import ru.clevertec.utils.StringUtils;

public class StringUtilsTest {
    @Test
    public void testIsPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("1"));
        assertTrue(StringUtils.isPositiveNumber("123"));
        assertTrue(StringUtils.isPositiveNumber("0"));
        assertFalse(StringUtils.isPositiveNumber("-1"));
        assertFalse(StringUtils.isPositiveNumber("abc"));
        assertFalse(StringUtils.isPositiveNumber(""));
        assertFalse(StringUtils.isPositiveNumber(null));
    }
}
