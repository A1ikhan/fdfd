package com.example.javaee1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public float greet() {
        return  5.6f;
    }

    @RequestMapping("/check")
    public boolean check(){
        return true;
    }
}

