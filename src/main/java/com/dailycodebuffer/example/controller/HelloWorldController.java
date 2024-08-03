package com.dailycodebuffer.example.controller;

import com.dailycodebuffer.example.component.HelloWorldComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldComponent helloWorldComponent;
    @GetMapping
    public String sayHello() {
        return helloWorldComponent.sayHello();
    }

    @GetMapping("/yaml")
    public String sayHelloYaml() {
        return helloWorldComponent.sayHelloYaml();
    }
}
