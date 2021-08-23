package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Lista1Controller {
	@GetMapping("/atividade1")
	
	public String atividade1() {
		return "A mentalidade utilizada foi a Persistência, já a habilidade foi a Atenção a detalhes";
	}
	@GetMapping("/atividade2")
	public String atividade2() {
		return "Compreender e ser capaz de realizar aplicações com o Spring";
	}
}
