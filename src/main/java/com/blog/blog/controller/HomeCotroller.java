package com.blog.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeCotroller {
    
    @GetMapping("/")
    public String gotToMainPage() {
        
        return "index";
    }
}
