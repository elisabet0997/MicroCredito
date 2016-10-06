package com.fyg.microcredito.dto;

public class Login {
private String usuario;

private String contrasenia;

private String estatusUsuario;

private Integer id_perfil;

private String nombrePerfil;

private String descripcionPerfil;

private String estatusPerfil;

public String getUsuario() {
	return usuario;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
}
public String getContrasenia() {
	return contrasenia;
}
public void setContrasenia(String contrasenia) {
	this.contrasenia = contrasenia;
}
public String getEstatusUsuario() {
	return estatusUsuario;
}
public void setEstatusUsuario(String estatusUsuario) {
	this.estatusUsuario = estatusUsuario;
}
public Integer getId_perfil() {
	return id_perfil;
}
public void setId_perfil(Integer id_perfil) {
	this.id_perfil = id_perfil;
}
public String getNombrePerfil() {
	return nombrePerfil;
}
public void setNombrePerfil(String nombrePerfil) {
	this.nombrePerfil = nombrePerfil;
}
public String getDescripcionPerfil() {
	return descripcionPerfil;
}
public void setDescripcionPerfil(String descripcionPerfil) {
	this.descripcionPerfil = descripcionPerfil;
}
public String getEstatusPerfil() {
	return estatusPerfil;
}
public void setEstatusPerfil(String estatusPerfil) {
	this.estatusPerfil = estatusPerfil;
}
}
