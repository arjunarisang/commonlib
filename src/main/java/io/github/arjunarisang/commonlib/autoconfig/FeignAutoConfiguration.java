package io.github.arjunarisang.commonlib.autoconfig;

import io.github.arjunarisang.commonlib.config.YamlPropertySourceFactory;
import io.github.arjunarisang.commonlib.properties.CommonlibProperties;
import org.slf4j.Logger;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@SuppressWarnings("ALL")
@EnableFeignClients(basePackages = {"io.github.arjunarisang.commonlib", "id.go.kemenkeu.bppk"})
@EnableConfigurationProperties({CommonlibProperties.class})
@ConditionalOnProperty(name = "arjunarisang.commonlib.feign.enabled", havingValue = "true")
@PropertySource(value = "classpath:commonlib-application.yaml", factory = YamlPropertySourceFactory.class)
public class FeignAutoConfiguration {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(FeignAutoConfiguration.class);

    @Bean
    void flightCheck() {
        log.info("FeignAutoConfiguration initialized.");
    }
}
