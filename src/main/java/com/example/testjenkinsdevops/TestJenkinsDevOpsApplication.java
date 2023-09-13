package com.example.testjenkinsdevops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class TestJenkinsDevOpsApplication {
    @GetMapping
    public String hello() {
        return "welcome to javatechie";
    }
    public static void main(String[] args) {
        SpringApplication.run(TestJenkinsDevOpsApplication.class, args);
    }

}
