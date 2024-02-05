package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication { // implements CommandLineRunner {

    //Logger logger = LoggerFactory.getLogger(LoggingController.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


//    public void run(String... args) {
//        System.out.println("Hello, World!");
//    }

}
