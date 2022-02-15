package io.github.arjunarisang.commonlib.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Slf4j
public class SecurityUtils {
    public SecurityUtils() {
        log.error("Error! Trying to create SecurityUtils instances.");
        throw new AssertionError("No instances of SecurityUtils created!");
    }

    public final static String OTHER_ORGANIZATION_CODE = "99999999";
    public final static Integer KMS_ORGANIZATION_SUBSTRING = 4;

    public static String generateRandomUsername() throws IOException {
        Resource resource = new ClassPathResource("google-10000-english-usa-no-swears-medium.txt", SecurityUtils.class.getClassLoader());

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

    public static String generateUsernameFromEmail(String email) {
        String username = getUsernameFromEmail(email);
        username = username.concat(".").concat(RandomStringUtils.randomAlphabetic(6));

        if (username.length() > 40) {
            username = username.substring(0, 40).concat(".").concat(RandomStringUtils.randomAlphabetic(5));
        }

        if (username.startsWith(".") || username.startsWith("_") || username.endsWith(".") || username.endsWith("_")) {
            username = username.replaceAll("[_.]", "");
        }

        username = username.replaceAll("[^a-zA-Z0-9._]", "x");

        return username.toLowerCase();
    }

    public static String getUsernameFromEmail(String email) {
        int idx = email.indexOf("@");
        return email.substring(0, idx).toLowerCase();
    }

    public static String determineProvider(String issuer, Map<String, Object> attributes) {
        if (issuer.equalsIgnoreCase("KEMENKEU")) {
            if (attributes.get("kode_organisasi") != null) {
                return "KEMENKEU";
            }
            return "KEMENKEU_PUBLIC";
        }

        if (issuer.equalsIgnoreCase("KEYCLOAK")) {
            if (attributes.get("provider") != null) {
                return "GOOGLE";
            }
            return "KEYCLOAK";
        }

        if (issuer.equalsIgnoreCase("OKTA")) {
            return "OKTA";
        }

        throw new RuntimeException("Issuer not supported");
    }

    public static String determineIdentifierTypeByProvider(String provider) {
        if (provider.equalsIgnoreCase("KEMENKEU")) {
            return "nip";
        } else {
            return "email";
        }
    }

    public static String getJwtFromRequest(HttpServletRequest request) {
        String bearerToken = request.getHeader("Authorization");
        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7);
        }
        return null;
    }
}
