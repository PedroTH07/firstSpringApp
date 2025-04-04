package com.projetos.first_spring_app.Controller;

import com.projetos.first_spring_app.Service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Pedro");
    }

    @GetMapping("/data")
    public HashMap<String, Object> data() {
        return helloWorldService.data("Success");
    }
}