package com.example.myOpenShiftDemoApp.controllerClass;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyControllerClass {

    @RequestMapping("/welcome")
    public String show(){
        return "Viola!! Welcome to RedHat OpenShift";
    }
}
