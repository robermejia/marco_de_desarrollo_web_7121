package com.example.signos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.signos.repositories.SignoRepository;

@SpringBootApplication
public class SignosApplication {

	public static void main(String[] args) {
		SignoRepository.iniciarSignos();
		SpringApplication.run(SignosApplication.class, args);

	}

}
