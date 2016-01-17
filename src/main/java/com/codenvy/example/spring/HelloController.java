package com.codenvy.example.spring;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloController {
  
   @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
  
   @RequestMapping("/indu")
    String home() {
      System.out.println("Welcome");
        return "Hello World!";
    }

   
}