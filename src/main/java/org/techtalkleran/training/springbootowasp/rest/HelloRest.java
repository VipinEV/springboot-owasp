package org.techtalkleran.training.springbootowasp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {

    @GetMapping("/hello")
    public String getHelloMessage() {
        return "Hello! Welcome to OWASP Tutorial";
    }
}
