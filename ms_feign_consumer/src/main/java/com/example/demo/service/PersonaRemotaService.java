package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dto.PersonaDto;


@FeignClient(url = "http://localhost:8087", name = "PersonaRemotaService")

public interface  PersonaRemotaService {

	@GetMapping("/get/persona/{id}")
    PersonaDto getPersona(@PathVariable Long id);
		
	
}
