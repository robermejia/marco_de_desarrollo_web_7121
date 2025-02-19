package com.example.signos.controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestController {
    
    @GetMapping("datos")
    public String errorTest(Model model, Integer dia){
        model.addAttribute("mensaje", "Mensaje de prueba");
        model.addAttribute("numero", 20);
        model.addAttribute("error", true);
        String[] nombresArray = {"Eva", "Lily", "Lucia"};
        model.addAttribute("nombres", nombresArray);
        model.addAttribute("dia", dia);    
        //Datos de fecha y hora    
        model.addAttribute("horaFechaActual", LocalDateTime.now());        
        model.addAttribute("horaActual", LocalTime.now());        
        model.addAttribute("fechaActual", LocalDate.now());
        return "test";
    }
}
