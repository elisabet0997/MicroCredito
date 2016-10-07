package com.fyg.microcredito.dto;

public class Login {
/**
*
*/
private String usuario;
/**
*
*/
private String contrasenia;
/**
*
*/
private String estatusUsuario;
/**
*
*/
private Integer id_perfil;
/**
*
*/
private String nombrePerfil;
/**
*
*/
private String descripcionPerfil;
/**
*
*/
private String estatusPerfil;
/**
*@return obtiene el usuario
*/
public String getUsuario() {
	return usuario;
}
/**
*@param usuario ingresa el usuario
*/
public void setUsuario(String usuario) {
	this.usuario = usuario;
}
/**
*@return obtiene la contraseña
*/
public String getContrasenia() {
	return contrasenia;
}
/**
*@param contrasenia ingresa la contraseña
*/
public void setContrasenia(String contrasenia) {
	this.contrasenia = contrasenia;
}
/**
*@return obtiene el estatus del usuario
*/
public String getEstatusUsuario() {
	return estatusUsuario;
}
/**
*@param estatusUsuario ingresa el estatus del usuario
*/
public void setEstatusUsuario(String estatusUsuario) {
	this.estatusUsuario = estatusUsuario;
}
/**
*@return obtiene el id del perfil
*/
public Integer getId_perfil() {
	return id_perfil;
}
/**
*@param id_perfil ingresa el id del perfil
*/
public void setId_perfil(Integer id_perfil) {
	this.id_perfil = id_perfil;
}
/**
*@return obtiene el nombre del pefil
*/
public String getNombrePerfil() {
	return nombrePerfil;
}
/**
*@param nombrePerfil ingresa el nombre del perfil
*/
public void setNombrePerfil(String nombrePerfil) {
	this.nombrePerfil = nombrePerfil;
}
/**
*@return obtiene la descripcion del perfil
*/
public String getDescripcionPerfil() {
	return descripcionPerfil;
}
/**
*@param descripcionPerfil ingresa la descripcion del perfil
*/
public void setDescripcionPerfil(String descripcionPerfil) {
	this.descripcionPerfil = descripcionPerfil;
}
/**
*@return obtiene el estatus del perfil
*/
public String getEstatusPerfil() {
	return estatusPerfil;
}
/**
*@param estatusPerfil ingresa el estatus de perfil
*/
public void setEstatusPerfil(String estatusPerfil) {
	this.estatusPerfil = estatusPerfil;
}
}
