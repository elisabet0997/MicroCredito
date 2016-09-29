package com.fyg.microcredito.dto;

import java.sql.Date;

public class Usuarios {
	
	private String usuario;
	private int id_perfil;
	private String persona;
	private String contrasenia;
	private String cambio_contrasenia;
	private Date fecha_alta;
	private Date fecha_ult_mod;
	private String estatus;
	
	
	public String getUsuario()
	{
		return usuario;
	}
	
	public void setUsuario(String usuario) 
	{
		this.usuario = usuario;
	}
	
	public int getId_perfil() 
	{
		return id_perfil;
	}
	
	public void setId_perfil(int id_perfil)
	{
		this.id_perfil = id_perfil;
	}
	
	public String getPersona()
	{
		return persona;
	}
	
	public void setPersona(String persona)
	{
		this.persona = persona;
	}
	
	public String getContrasenia() 
	{
		return contrasenia;
	}
	
	public void setContrasenia(String contrasenia)
	{
		this.contrasenia = contrasenia;
	}
	
	public String getCambio_contrasenia()
	{
		return cambio_contrasenia;
	}
	
	public void setCambio_contrasenia(String cambio_contrasenia) 
	{
		this.cambio_contrasenia = cambio_contrasenia;
	}
	
	public Date getFecha_alta() 
	{
		return fecha_alta;
	}
	
	public void setFecha_alta(Date fecha_alta) 
	{
		this.fecha_alta = fecha_alta;
	}
	
	public Date getFecha_ult_mod() 
	{
		return fecha_ult_mod;
	}
	
	public void setFecha_ult_mod(Date fecha_ult_mod) 
	{
		this.fecha_ult_mod = fecha_ult_mod;
	}
	
	public String getEstatus() 
	{
		return estatus;
	}
	
	public void setEstatus(String estatus) 
	{
		this.estatus = estatus;
	}
	

}
