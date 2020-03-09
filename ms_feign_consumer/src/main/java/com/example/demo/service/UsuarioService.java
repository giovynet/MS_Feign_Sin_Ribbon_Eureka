package com.example.demo.service;

import com.example.demo.dto.UsuarioDto;
import com.example.demo.exception.DaoException;

public interface  UsuarioService {

	UsuarioDto getUsuarioById(Long id) throws DaoException;
	
}
