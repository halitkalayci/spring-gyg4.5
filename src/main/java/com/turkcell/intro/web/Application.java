package com.turkcell.intro.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Annotation -> Özellik kazandırma.
public class Application {

	public static void main(String[] args) {
		// Spring bileşenleri konsol açıldığında başlatılsın.
		SpringApplication.run(Application.class, args);
	}

}
