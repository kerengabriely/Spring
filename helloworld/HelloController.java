package com.hellooworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/Hab")
public class HelloController {
	
	@GetMapping()
	public String Habilidade() {
		return "Para realizar esta atividade usei a habilidade de atenção aos detalhes e e proatividade."
				+ "E as mentalidades de persistência e mentalidade de crescimento.";
	}

}
