package io.github.arjunarisang.commonlib.config;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;

import java.util.Objects;
import java.util.Optional;
import java.util.Properties;

import static org.springframework.beans.factory.config.YamlProcessor.MatchStatus.*;

public class YamlPropertySourceFactory implements PropertySourceFactory {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(YamlPropertySourceFactory.class);

    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource encodedResource) {
        String activeProfile = Optional.ofNullable(System.getenv("SPRING_PROFILES_ACTIVE"))
                .orElse(System.getProperty("spring.profiles.active"));

        log.info("FeignAutoConfiguration active profile: " + activeProfile);
        assert activeProfile != null;

        YamlPropertiesFactoryBean yamlFactory = new YamlPropertiesFactoryBean();
        yamlFactory.setDocumentMatchers(properties -> {
            String profileProperty = properties.getProperty("spring.profiles");

            if (StringUtils.isEmpty(profileProperty)) {
                return ABSTAIN;
            }

            return profileProperty.contains(activeProfile) ? FOUND : NOT_FOUND;
        });
        yamlFactory.setResources(encodedResource.getResource());

        Properties properties = yamlFactory.getObject();

        assert properties != null;
        return new PropertiesPropertySource(Objects.requireNonNull(encodedResource.getResource().getFilename()), properties);
    }
}
