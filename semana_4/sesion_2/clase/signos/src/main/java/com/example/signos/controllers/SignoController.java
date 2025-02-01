package com.example.signos.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.signos.repositories.SignoRepository;

@Controller
public class SignoController {

    @GetMapping("tabla-signos")
    public String tabla(Model model) {
        model.addAttribute("datos", SignoRepository.signos);
        return "tabla-signos";
    }

    @GetMapping("tipos")
    public String tipos(Model model) {
        List<String> animales = Arrays.asList(
                "Rata", "Buey", "Gallo", "Tigre", "Serpiente", "Mono",
                "Dragón", "Caballo", "Cabra", "Perro", "Cerdo", "Conejo");
        List<String> tipos = Arrays.asList("Metal", "Madera", "Agua",
                "Tierra", "Fuego");
        model.addAttribute("animales", animales);
        model.addAttribute("tipos", tipos);
        return "tipos";
    }

    @GetMapping("enviar")
    public String procesarForm(Model model) {
        String mensaje = "Datos recibidos";
        model.addAttribute("mensaje", mensaje);
        return "contacto";
    }
    
    // OPCIONAL: provoca un error 500
    @GetMapping("fatal")
    public String fatal() {
        return "fatal";
    }
}
