package com.robermejia.utp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.robermejia.utp.repositories.ProductoRepository;


@SpringBootApplication
public class UtpApplication {

	public static void main(String[] args) {
		ProductoRepository.iniciarProductos();
		SpringApplication.run(UtpApplication.class, args);
	}

}
