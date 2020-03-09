package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dto.UsuarioDto;
import com.example.demo.service.UsuarioService;

@SpringBootTest
class MsFeignConsumerApplicationTests {

	@Autowired
	UsuarioService usuarioService;
		
	@Test
	void obtenerUsuario() {
		try {
			UsuarioDto usuario = usuarioService.getUsuarioById(11L);
			System.out.println("EL USUARIO RECUPERADO: " + usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
