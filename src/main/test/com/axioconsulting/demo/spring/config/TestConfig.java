package com.axioconsulting.demo.spring.config;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by benoit on 28/09/2014.
 */
@Configuration
public class TestConfig {

    @Bean
    public URI getSiteBase() throws URISyntaxException {
        return new URI("http://localhost:10001/demo-spring");
    }

    @Bean(destroyMethod = "quit")
    public FirefoxDriver getDrv() {
        return new FirefoxDriver();
    }
}

