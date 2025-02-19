package com.example.signos.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiController {

    @GetMapping(value = "saludo", produces = MediaType.TEXT_PLAIN_VALUE)
    public String saludo() {
        return "Hola mundo";
    }

    @GetMapping(value = "nombres", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> mostrarNombres() {
        List<String> nombres = new ArrayList<>();
        nombres.add("Gema");
        nombres.add("Berenice");
        nombres.add("Paula");
        nombres.add("Fernanda");
        nombres.add("Araceli");
        nombres.add("Sara");
        return nombres;
    }

    @GetMapping("duplicar")
    public Integer duplicado(@RequestParam("n") Integer num) {
        return num * 2;
    }

    @GetMapping("sumar")
    public Integer sumar(Integer a, Integer b) {
        return a + b;
    }

    @GetMapping("triplicar/{n}")
    public Integer triplicar(@PathVariable("n") Integer num) {
        return num * 3;
    }

    @GetMapping("multiplicar/{a}&{b}")
    public Integer multiplicar(@PathVariable Integer a, @PathVariable Integer b) {
        return a * b;
    }
}
