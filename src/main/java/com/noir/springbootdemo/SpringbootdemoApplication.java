package com.noir.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//springboot程序的入口
@RestController
@SpringBootApplication
public class SpringbootdemoApplication {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayhi(){
        return "hello spring boot!";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }

}
