package com.github.devlucasjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ProductsApi {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(com.github.devlucasjava.ProductsApi.class, args);
		String x = "2";
		String y = "2";
		System.out.println("Resutado da soma " + x + y);
		int xi = 2;
		int yi = 2;
		int soma = xi + yi;
		System.out.println("Resutado da soma " + soma);
	}

}
