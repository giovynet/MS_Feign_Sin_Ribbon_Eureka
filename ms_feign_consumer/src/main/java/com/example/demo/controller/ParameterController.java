package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UsuarioDto;
import com.example.demo.service.UsuarioService;

@RestController
public class ParameterController {

	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("/get/user/{id}")
	public UsuarioDto updateGroupDsOne(@PathVariable Long id) {	
		UsuarioDto usuario = new UsuarioDto();		
		try {
			
			usuario = usuarioService.getUsuarioById(id);
			
			System.out.println("USUARIO OBTENIDO :" + usuario);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuario;
	}

}