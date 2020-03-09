package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PersonaDto;

@RestController
public class ParameterController {

	@GetMapping("/get/persona/{id}")
	public PersonaDto updateGroupDsOne(@PathVariable Long id) {	
		PersonaDto persona = new PersonaDto();		
		try {
			persona.setId(id);
			persona.setTipoDoc("CC");
			persona.setNumeroDoc("123455");
			persona.setNombre("Aldonsa");
			persona.setApellido("del Toboso");			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return persona;
	}

}