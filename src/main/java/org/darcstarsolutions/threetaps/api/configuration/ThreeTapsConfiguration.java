package org.darcstarsolutions.threetaps.api.configuration;

import org.darcstarsolutions.threetaps.api.services.ReferenceService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;

/**
 * Created by mharris on 5/27/15.
 */

@Configuration
@EnableAutoConfiguration
@EnableConfigurationProperties
public class ThreeTapsConfiguration {

    @Bean
    @Scope(value = "prototype")
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public ReferenceService referenceService() {
        return new ReferenceService();
    }
}
