package org.example.test.spring.springboot.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author guitongZhang
 * @date 2021/03/18 19:08
 */
@Slf4j
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Value("${values.value1}")
    private String value1;

    @Value("${values.value2}")
    private String value2;

    @Value("${values.value3}")
    private String value3;

    @Value("${values.value4}")
    private String value4;

    @Value("${values.dev.value1}")
    private String devValue1;

    @Value("${values.dev.value2}")
    private String devValue2;

    @Value("${values.dev.value3}")
    private String devValue3;

    @Value("${values.dev.value4}")
    private String devValue4;


    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }


    @Override
    public void run(String... args) {

        log.info("------- application.properties -----");
        log.info("");

        log.info("value1: {}", value1);
        log.info("value2: {}", value2);
        log.info("value3: {}", value3);
        log.info("value4: {}", value4);

        log.info("");
        log.info("");

        log.info("------- spring.profiles.active -----");
        log.info("");

        log.info("dev.value1: {}", devValue1);
        log.info("dev.value2: {}", devValue2);
        log.info("dev.value3: {}", devValue3);
        log.info("dev.value4: {}", devValue4);
    }

}
