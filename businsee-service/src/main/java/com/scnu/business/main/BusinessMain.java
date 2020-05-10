package com.scnu.business.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.scnu.business")
public class BusinessMain {
    public static void main(String[] args) {
        SpringApplication.run(BusinessMain.class,args);
    }
}
