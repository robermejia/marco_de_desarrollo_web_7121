package com.robermejia.utp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.robermejia.utp.repositories.ProductoRepository;

@Controller
public class ProductoController {
    
    @GetMapping("productos")
    public String tabla(Model model) {
        model.addAttribute("datos", ProductoRepository.productos);
        return "productos";
    }

}
