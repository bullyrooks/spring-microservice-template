package com.{{ cookiecutter.service_namespace }}.{{ cookiecutter.package_name }}.controller;

import com.{{ cookiecutter.service_namespace }}.{{ cookiecutter.package_name }}.controller.dto.HelloWorldResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/helloworld")
    public HelloWorldResponse getHelloWorld(){
        return HelloWorldResponse.builder().message("Hello World!").build();
    }

}
