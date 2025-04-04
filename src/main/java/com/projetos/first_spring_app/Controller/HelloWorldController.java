package com.projetos.first_spring_app.Controller;

import com.projetos.first_spring_app.DTO.UserDTO;
import com.projetos.first_spring_app.Service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/{id}")
    public String postHello(@PathVariable String id, @RequestParam(value="filter", defaultValue = "nenhum") String filter, @RequestBody UserDTO body) {
        return "Hello World " + body.getNome() + filter;
    }
}