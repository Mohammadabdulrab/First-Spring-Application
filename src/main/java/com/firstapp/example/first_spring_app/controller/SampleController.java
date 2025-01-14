package com.firstapp.example.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sample/apis")
public class SampleController {

    @GetMapping("/getSample")
    public String SampleAPI(){
        return "our first  GET API";
    }

    @GetMapping("/getSample2")
    public String SampleAPI2(){
        return "our second  GET API";
    }

}
