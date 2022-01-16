package io.github.arjunarisang.commonlib.autoconfig;

import io.github.arjunarisang.commonlib.exception.CustomGlobalExceptionHandler;
import io.github.arjunarisang.commonlib.properties.CommonlibProperties;
import org.slf4j.Logger;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;

@Configuration
@EnableConfigurationProperties({CommonlibProperties.class})
public class ExceptionHandlerAutoConfiguration {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(ExceptionHandlerAutoConfiguration.class);

    @ConditionalOnProperty(name = "arjunarisang.commonlib.exception-handler.enabled", havingValue = "true")
    @ConditionalOnMissingBean(annotation = ControllerAdvice.class)
    @Bean
    CustomGlobalExceptionHandler responseEntityExceptionHandler() {
        log.info("UnggulHasan - ExceptionHandlerAutoConfiguration initialized.");
        return new CustomGlobalExceptionHandler();
    }
}
