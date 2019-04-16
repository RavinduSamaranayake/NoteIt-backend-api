package com.noteit.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NoteItApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoteItApiApplication.class, args);
    }

    @RequestMapping("/")
    public String sayhello() {
        return "Hello JAVA Spring boot...My NoteIt-api...";
    }

}