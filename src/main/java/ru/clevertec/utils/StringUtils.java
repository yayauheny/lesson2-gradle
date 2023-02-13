package ru.clevertec.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {

        return NumberUtils.isCreatable(str) && NumberUtils.isDigits(str)
                && NumberUtils.toDouble(str) >= 0;
    }
}
