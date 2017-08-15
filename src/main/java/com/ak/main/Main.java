package com.ak.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan({"com.ak.service", "com.ak.dao", "com.ak.controller"})
@EnableAutoConfiguration
public class Main {

    public static void main(String[] args){
        SpringApplication.run(Main.class, args); // info o klasie w ktorej jest uruchamiana
    }

}
