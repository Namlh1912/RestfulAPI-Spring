package com.killer.sample.spring;

import com.killer.sample.spring.configuration.JpaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages = {"com.killer.sample.spring"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}