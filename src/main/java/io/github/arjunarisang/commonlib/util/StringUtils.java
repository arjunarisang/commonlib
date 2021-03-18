package io.github.arjunarisang.commonlib.util;

import com.google.common.base.CaseFormat;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.slf4j.Logger;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.util.List;

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

    public static String randomUsername() throws IOException {
        Resource resource = new ClassPathResource("google-10000-english-usa-no-swears-medium.txt", StringUtils.class.getClassLoader());

        List<String> lines = IOUtils.readLines(resource.getInputStream(), "UTF-8");
        int ix1 = RandomUtils.nextInt(0, lines.size());
        int ix2 = RandomUtils.nextInt(0, lines.size());

        String first = lines.get(ix1);
        String second = RandomStringUtils.randomAlphanumeric(3);
        String third = lines.get(ix2);
        String username = first.concat("_").concat(second).concat("_").concat(third);
        username = username.toLowerCase();

        if (username.length() > 34) {
            username = username.substring(0, 24);
        }

        return username;
    }
}
