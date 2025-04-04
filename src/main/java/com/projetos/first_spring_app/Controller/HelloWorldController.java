package com.projetos.first_spring_app.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/data")
    public HashMap<String, Object> data() {
        HashMap<String, Object> json = new HashMap<>();
        json.put("message", "Hello World");
        return json;
    }
}