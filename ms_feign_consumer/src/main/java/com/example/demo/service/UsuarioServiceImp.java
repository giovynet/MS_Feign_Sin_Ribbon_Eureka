package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PersonaDto;
import com.example.demo.dto.UsuarioDto;
import com.example.demo.exception.DaoException;


@Service
public class UsuarioServiceImp implements UsuarioService {
	
	@Autowired
	PersonaRemotaService personaRemotaService;
	
	@Override
	public UsuarioDto getUsuarioById(Long id) throws DaoException {
		UsuarioDto usuario = null;
		try {			
			//Se obtiene usuario como si de un query se trarará
			usuario = new UsuarioDto();
			usuario.setId(id);
			usuario.setNombreUsuario("@zancho");
			usuario.setRol("Escudero");
			
			// obtiene la persona de otro microservicio
			PersonaDto persona = this.personaRemotaService.getPersona(1000L);
			
			// se agrega la persona al 
			usuario.setPersona(persona);
		}catch (Exception e) {
			e.getStackTrace();
		}
		return usuario;
	}


}
