package com.jenkinsdemo.jenkinspractise;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class JenkinsPractiseApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsPractiseApplication.class, args);
        log.info("JenkinsPractiseApplication started");
    }

}
