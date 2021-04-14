package org.pa.guineapig;

import org.pa.guineapig.model.Mission;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class AppConfiguration {

    @Bean
    public Mission m() {
        return new Mission("allo", 2, Arrays.asList("comment 1", "comment 2"));
    }
}
