package com.example.demo;



import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Data;

@Component
@ConfigurationProperties("app")
@Data
@SuppressWarnings({"squid:S1104", "unchecked"})
public class AppConfig {

    private String hello;



}
