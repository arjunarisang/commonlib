package io.github.arjunarisang.commonlib.util;

import com.github.slugify.Slugify;
import lombok.NonNull;
import org.slf4j.Logger;

public class SlugUtils {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(SlugUtils.class);

    public SlugUtils() {
        log.error("Error! Trying to create SlugUtils instances.");
        throw new AssertionError("No instances of SlugUtils created!");
    }

    public static String generateSlug(@NonNull String string) {
        Slugify slg = new Slugify();

        String str = string;
        if (str.length() > 50) {
            str = string.substring(0, 50);
        }

        return slg.slugify(str);
    }

}
