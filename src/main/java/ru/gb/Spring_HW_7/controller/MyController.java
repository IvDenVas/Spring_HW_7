package ru.gb.Spring_HW_7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String mainPageOpen(){
        return "main";
    }
    @GetMapping("/private-data")
    public String privatePageOpen(){
        return ("private-data");
    }

    @GetMapping("/public-data")
    public String publicPageOpen(){
        return "public-data";
    }
}
