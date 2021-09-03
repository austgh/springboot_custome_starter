package com.starter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by think on 2021/3/29.
 */
@Configuration
@ConditionalOnProperty(value = "hello.name")
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfitguration {
    @Autowired
    HelloProperties helloProperties;

    @Bean
    public IndexController indexController() {
        return new IndexController(helloProperties);
    }
}
