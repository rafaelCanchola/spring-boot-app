package com.siap.dti.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.siap.dti.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({"/index","/","","/home"})
	public String index(Model model) {
		model.addAttribute("titulo", "hola Spring Framework con Model!");
		return "index";
	}
	
	@GetMapping("/perfil")
	public String perfil(Model model) {
		Usuario user = new Usuario("Raf","Canchola","rafa_zkeleton@hotmail.com");
		model.addAttribute("usuario", user);
		model.addAttribute("titulo", "Perfil del usuario: ".concat(user.getNombre()));
		return "perfil";
	}
	
	@GetMapping("/lista")
	public String lista(Model model) {
		
		model.addAttribute("titulo", "Listado de Usuarios");
		return "lista";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Raf","Canchola","rafa_zkeleton@hotmail.com"));
		usuarios.add(new Usuario("Leticia","Angeles","rafa_zkeleton@hotmail.com"));
		usuarios.add(new Usuario("Mich","Cuellar",null));
		return usuarios;
	}
}
