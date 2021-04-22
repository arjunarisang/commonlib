package io.github.arjunarisang.commonlib.autoconfig;

import io.github.arjunarisang.commonlib.service.FlightTestService;
import org.slf4j.Logger;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlightTestServiceAutoConfiguration {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(ExceptionHandlerAutoConfiguration.class);

    @ConditionalOnMissingBean(FlightTestService.class)
    @Bean
    FlightTestService testService() {
        log.info("TestService initialized.");
        return new FlightTestService();
    }
}
