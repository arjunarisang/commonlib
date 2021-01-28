package io.github.arjunarisang.commonlib.util;

import org.slf4j.Logger;

public class ResponseUtils {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(ResponseUtils.class);

    public ResponseUtils() {
        log.error("Error! Trying to create ResponseUtils instances.");
        throw new AssertionError("No instances of ResponseUtils created!");
    }

    public static String invokeAntiXss(String input) {
        return input.replaceAll(Constants.getAntiXss(), "");
    }
}
