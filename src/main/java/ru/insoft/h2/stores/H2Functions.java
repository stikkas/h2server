package ru.insoft.h2.stores;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Functions for use in project sic-stores
 * @author stikkas<stikkas@yandex.ru>
 */
public class H2Functions {

    /**
     * Get full number of fund. Full number is drawing as prefix-number-suffix
     * @param number integer
     * @param prefix string
     * @param suffix string
     * @return string presentation of full number
     */
    public static String getFundFullNumber(Integer number, String prefix, String suffix) {
        String result = prefix;
        if (result != null && !result.isEmpty()) {
            result += "-";
        }
        result += number;
        if (suffix != null && !suffix.isEmpty()) {
            result += "-" + suffix;
        }
        return result;
    }

    /**
     * Get string presentation of the years range
     * @param start year of the beggining
     * @param end year of the ending
     * @return sring presentation
     */
    public static String getYears(Integer start, Integer end) {
        if (start != null && end != null) {
            if (start.equals(end)) {
                return "" + start;
            }
            return start + "-" + end;
        } else if (start != null) {
            return "" + start;
        } else if (end != null) {
            return "" + end;
        }
        return "";
    }
}
