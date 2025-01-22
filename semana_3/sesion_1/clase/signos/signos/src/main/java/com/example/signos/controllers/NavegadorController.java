package com.example.signos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class NavegadorController {

    @GetMapping("inicio")
    public String inicio(){        
        return "index";
    }

    @GetMapping("tipos")
    public String tipos(){
        return "tipos";
    }
}
