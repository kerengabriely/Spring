package com.hellooworld.hello.controller2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/Obj")
public class HelloController2 {
	
	@GetMapping()
	public String Objetivo() {
		return "Absorver todo o conteúdo passado e não surtar e entrar na zona de pânico.";
	}

}
