package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example.demo.Functions.softmax;

@SpringBootApplication
@Slf4j
public class DemoApplication  implements CommandLineRunner {

   // private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Autowired
    AppConfig appConfig;


    public void run(String... args) {
        double[] softmax = softmax(new double[] {1.0, 2.0, 3.0});
        log.info("{}", softmax);
        String hello = appConfig.getHello();
        log.info(hello);
    }

}
