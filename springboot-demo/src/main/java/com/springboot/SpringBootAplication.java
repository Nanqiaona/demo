package com.springboot;

import com.springboot.demo.Demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootAplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAplication.class,args);
    }

    @Bean
    public Demo demo(){
        return new Demo();
    }
}
