package com.example.demo.dto;

public class UsuarioDto {
	
	private Long id;
	private String nombreUsuario;
	private String rol;
	private PersonaDto persona;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public PersonaDto getPersona() {
		return persona;
	}
	public void setPersona(PersonaDto persona) {
		this.persona = persona;
	}
	
	
	@Override
	public String toString() {
		return "UsuarioDto [id=" + id + ", nombreUsuario=" + nombreUsuario + ", rol=" + rol + ", persona=" + persona
				+ "]";
	}

	
}
