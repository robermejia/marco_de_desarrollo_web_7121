package com.robermejia.biblioteca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.robermejia.biblioteca.entities.Autor;
import com.robermejia.biblioteca.services.AutorService;

@Controller
@RequestMapping("autores")
public class AutorController {

   @Autowired
   AutorService service;

   @GetMapping
   public String getAutores(Model model){
       model.addAttribute("autor", new Autor());
       model.addAttribute("autores", service.getAutores());
       return "autores";
   }

   @PostMapping("/procesar")
   public String insertAutor(@ModelAttribute Autor autor, Model model){   
       if(service.saveAutor(autor)==null) {
           model.addAttribute("mensaje", "Error al procesar");            
           model.addAttribute("autor", autor);
       }else{
           model.addAttribute("autor", new Autor());
           model.addAttribute("mensaje", "Dato procesado");     
       }
       model.addAttribute("autores", service.getAutores());
       return "autores";
   }

   @GetMapping("editar/{id}")
   public String editAutor(Model model, @PathVariable Integer id){
       model.addAttribute("autor", service.getAutor(id));
       model.addAttribute("autores", service.getAutores());
       return "autores";
   }

   @GetMapping("eliminar/{id}")
   public String deleteAutor(Model model, @PathVariable Integer id){
       if(service.deleteAutor(id)==null) {
           model.addAttribute("mensaje", "Autor eliminado"); 
       }else{
           model.addAttribute("mensaje", "Error al eliminar");     
       }
       model.addAttribute("autor", new Autor());
       model.addAttribute("autores", service.getAutores());
       return "autores";
   }
}
 