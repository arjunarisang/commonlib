package io.github.arjunarisang.commonlib.util;

import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

@Slf4j
public class UidUtils {

    public UidUtils() {
        log.error("Error! Trying to create UidUtils instances.");
        throw new AssertionError("No instances of UidUtils created!");
    }

    public static String generateShort() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
}
