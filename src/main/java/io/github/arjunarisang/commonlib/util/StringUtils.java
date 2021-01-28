package io.github.arjunarisang.commonlib.util;

import com.google.common.base.CaseFormat;
import org.slf4j.Logger;

public class StringUtils {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(StringUtils.class);

    public StringUtils() {
        log.error("Error! Trying to create StringUtils instances.");
        throw new AssertionError("No instances of StringUtils created!");
    }

    public static String[] strArraySnakeToCamel(String[] strings) {
        for (int index = 0; index < strings.length; index++) {
            strings[index] = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, strings[index]);
        }

        return strings;
    }
}
