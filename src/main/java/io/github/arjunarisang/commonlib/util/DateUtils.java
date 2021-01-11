package io.github.arjunarisang.commonlib.util;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Slf4j
public class DateUtils {

    public DateUtils() {
        log.error("Error! Trying to create DateUtils instances.");
        throw new AssertionError("No instances of DateUtils created!");
    }

    public static String format(LocalDateTime ldt, String format, String zoneId) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format).withZone(ZoneId.of(zoneId));
        return ldt.format(formatter);
    }

    public static String formatNow(String format, String zoneId) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format).withZone(ZoneId.of(zoneId));
        return LocalDateTime.now().format(formatter);
    }

}
