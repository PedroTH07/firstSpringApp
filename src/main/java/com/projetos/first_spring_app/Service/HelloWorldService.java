package com.projetos.first_spring_app.Service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class HelloWorldService {

    public String helloWorld(String nome) {
        return "Hello World "+nome;
    }

    public HashMap<String, Object> data(String message) {
        HashMap<String, Object> json = new HashMap<>();
        json.put("message", message);
        return json;
    }
}
