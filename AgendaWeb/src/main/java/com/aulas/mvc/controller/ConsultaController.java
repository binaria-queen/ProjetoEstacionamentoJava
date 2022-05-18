package com.aulas.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aulas.mvc.entidades.Contato;

@Controller
@RequestMapping("/consulta")
public class ConsultaController {
	
	@GetMapping
	public String listaContatos(Model model) {
		List<Contato> lista = new ArrayList<>();
		lista.add(new Contato(1, "Ursula", "ursulinha@gmail.com"));
		lista.add(new Contato(2, "Gabriela", "gabi@gmail.com"));
		lista.add(new Contato(3, "Mozart", "mo@gmail.com"));
		lista.add(new Contato(4, "Michele", "mi@gmail.com"));
		lista.add(new Contato(5, "Vilson", "vilson@gmail.com"));
		
		model.addAttribute("lista", lista);

		return "tabelacontatos";
	}
}
