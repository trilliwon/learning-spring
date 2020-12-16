package com.example.demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Demo01Application {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Demo01Application.class, args);
        System.out.println("# Beans: " + ctx.getBeanDefinitionCount());
        var names = ctx.getBeanDefinitionNames();
        Arrays.sort(names);
        Arrays.asList(names).forEach(System.out::println);
    }
}
