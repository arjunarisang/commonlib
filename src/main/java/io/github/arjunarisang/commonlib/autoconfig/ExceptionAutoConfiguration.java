package io.github.arjunarisang.commonlib.autoconfig;

import io.github.arjunarisang.commonlib.exception.CustomGlobalExceptionHandler;
import org.slf4j.Logger;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;

@Configuration
public class ExceptionAutoConfiguration {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(ExceptionAutoConfiguration.class);

    @ConditionalOnMissingBean(annotation = ControllerAdvice.class)
    @Bean
    CustomGlobalExceptionHandler responseEntityExceptionHandler() {
        log.info("ExceptionAutoConfiguration initialized.");
        return new CustomGlobalExceptionHandler();
    }
}
