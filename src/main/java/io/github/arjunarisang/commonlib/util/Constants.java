package io.github.arjunarisang.commonlib.util;

import org.slf4j.Logger;

public class Constants {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(Constants.class);

    public Constants() {
        log.error("Error! Trying to create Constants instances.");
        throw new AssertionError("No instances created!");
    }

    private static final String QUERY_PATTERN = "(\\w.+?)([:<>])((\\w|\\w+( |-\\w+))+?|(((19|2[0-9])[0-9]{2})-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[0-1])T(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d)),";
    private static final String NIK_PATTERN = "^((1[1-9])|(21)|([37][1-6])|(5[1-4])|(6[1-5])|([8-9][1-2]))[0-9]{2}[0-9]{2}(([0-6][0-9])|(7[0-1]))((0[1-9])|(1[0-2]))([0-9]{2})[0-9]{4}$";
    private static final String NIP_PATTERN = "^(19[0-9]{2}|2[0-9]{3})(0[1-9]|1[012])([123]0|[012][1-9]|31)(19[0-9]{2}|2[0-9]{3})(0[1-9]|1[012])([1-2])([0-9]{3})$";
    private static final String UUID_PATTERN = "^([0-9a-f]{8}-?[0-9a-f]{4}-?[1-5][0-9a-f]{3}-?[0-9a-f]{4}-?[0-9a-f]{12}|\\{[0-9a-f]{8}-?[0-9a-f]{4}-?[1-5][0-9a-f]{3}-?[0-9a-f]{4}-?[0-9a-f]{12}\\}|[A-Za-z0-9+/]{22})$";
    private static final String ANTI_XSS = "(<|%3C|%3c|%3E|%3e|%2F|%2f)(.*)";

    public static String getQueryPattern() {
        return QUERY_PATTERN;
    }

    public static String getNikPattern() {
        return NIK_PATTERN;
    }

    public static String getNipPattern() {
        return NIP_PATTERN;
    }

    public static String getUuidPattern() {
        return UUID_PATTERN;
    }

    public static String getAntiXss() {
        return ANTI_XSS;
    }
}
