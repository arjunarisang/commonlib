package io.github.arjunarisang.commonlib.util;

import org.slf4j.Logger;

import java.util.UUID;

public class UidUtils {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(UidUtils.class);

    public UidUtils() {
        log.error("Error! Trying to create UidUtils instances.");
        throw new AssertionError("No instances of UidUtils created!");
    }

    public static String generateShort() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
}
