package com.eshop.bootstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.lang.module.Configuration;

@SpringBootApplication
public class BootStoreApplication {

    public static void main(String[] args) {
    ConfigurableApplicationContext context= SpringApplication.run(BootStoreApplication.class, args);
        PasswordEncoder encoder =context.getBean(PasswordEncoder.class);
        System.out.println(encoder.encode("pass"));
    }

}
