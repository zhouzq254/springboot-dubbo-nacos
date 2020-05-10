package com.scnu.user.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.scnu.user")
public class UserMain {

    public static void main(String[] args) {
        SpringApplication.run(UserMain.class,args);
    }
}
