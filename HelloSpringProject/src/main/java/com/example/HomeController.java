package com.example;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/**
 * Created by Kenneth on 6/13/2016.
 */
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "Hellow, Spring Boot!";
    }
}
