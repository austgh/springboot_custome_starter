package com.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by think on 2021/3/29.
 */
@ConfigurationProperties("hello")
public class HelloProperties {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
