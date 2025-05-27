package com.example.simplespringbootproj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    // http://localhost:8080/greet/yooodleee
    @GetMapping("/greet/{name}")
    public String greetPath(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // http://localhost:8080/greet?name=yooodleee
    @GetMapping("/greet")
    public String greetQuery(@RequestParam String name) {
        return "Hello, " + name + "!";
    }
}
