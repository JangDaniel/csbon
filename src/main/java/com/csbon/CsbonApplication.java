package com.csbon;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CsbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(CsbonApplication.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> System.out.println();
    }

}
