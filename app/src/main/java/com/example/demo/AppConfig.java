package com.example.demo;



import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


@Component
@ConfigurationProperties("app")

@SuppressWarnings({"squid:S1104", "unchecked"})
public class AppConfig {

    private String hello;


    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
