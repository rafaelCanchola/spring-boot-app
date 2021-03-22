package com.siap.dti.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

	@GetMapping("/string")
	public String param(@RequestParam(name="texto",required=false) String texto, Model model) {
		model.addAttribute("titulo", "Recibir parametros del Request HTTP GET - URL");
		model.addAttribute("resultado", "El texto enviado es: "+texto);
		return "params/ver";
	}
}
