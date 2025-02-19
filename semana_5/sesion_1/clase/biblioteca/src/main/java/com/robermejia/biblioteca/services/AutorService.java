package com.robermejia.biblioteca.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.robermejia.biblioteca.entities.Autor;
import com.robermejia.biblioteca.repositories.AutorRepository;
@Service
public class AutorService {
    @Autowired
    AutorRepository repository;
    //Métodos CRUD
    //SELECT ALL
    public List<Autor> getAutores(){
        return repository.findAll();
    }
    //SELECT ONE
    public Autor getAutor(Integer id){
        return repository.findById(id).orElse(new Autor());
    }
    //INSERT-UPDATE
    public Autor saveAutor(Autor autor){        
        return repository.save(autor);
    }
    //DELETE
    public String deleteAutor(Integer id){
        if(repository.existsById(id)){
            repository.deleteById(id);
            return null;
        }
        return "No se encontró";   
    }
}