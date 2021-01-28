package io.github.arjunarisang.commonlib.autoconfig;

import org.slf4j.Logger;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestServiceAutoConfiguration {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(ExceptionAutoConfiguration.class);

    @ConditionalOnMissingBean(TestService.class)
    @Bean
    TestService testService() {
        log.info("TestService initialized.");
        return new TestService();
    }
}
