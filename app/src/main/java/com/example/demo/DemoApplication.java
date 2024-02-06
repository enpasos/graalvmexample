package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example.demo.Functions.softmax;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner {

    //Logger logger = LoggerFactory.getLogger(LoggingController.class);

    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Autowired
    AppConfig appConfig;


    public void run(String... args) {
        double[] softmax = softmax(new double[] {1.0, 2.0, 3.0});
        logger.info("{}", softmax);
        String hello = appConfig.getHello();
        logger.info(hello);
    }

}
