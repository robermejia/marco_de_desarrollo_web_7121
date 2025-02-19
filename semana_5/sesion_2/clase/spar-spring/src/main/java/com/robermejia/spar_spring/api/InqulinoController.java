package com.robermejia.spar_spring.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robermejia.spar_spring.entities.Inquilino;
import com.robermejia.spar_spring.services.InquilinoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/api/inquilinos", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class InqulinoController {

    private final InquilinoService service;

    @GetMapping
    public List<Inquilino> getInquilinos(){
        return service.getInquilinos();
    }

    @GetMapping("/{id}")
    public Inquilino getInquilino(@PathVariable Integer id){
        return service.getInquilinoById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Inquilino insertInquilino(@RequestBody Inquilino inquilino){        
        return service.insUpd(inquilino);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Inquilino updateInquilino(@RequestBody Inquilino inquilino){
        return service.insUpd(inquilino);
    }

    @DeleteMapping("/{id}")
    public Inquilino deleteInquilino(@PathVariable Integer id){
        return service.deleteInquilino(id);
    }

}
