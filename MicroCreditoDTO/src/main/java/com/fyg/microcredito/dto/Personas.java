package com.fyg.microcredito.dto;

import java.util.Date;

public class Personas {
private String persona;
private String nombre;
private String apellido_pat;
private String apellido_mat;
private String sexo;
private String rfc;
private String curp;
private String fecha_nacimiento;
private Date fecha_alta;
private Date fecha_ult_mod;
private String estatus;

	public String getPersona() 
	{
		return persona;
	}
	public void setPersona(String persona)
	{
		this.persona = persona;
	}
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public String getApellido_pat()
	{
		return apellido_pat;
	}
	public void setApellido_pat(String apellido_pat) 
	{
		this.apellido_pat = apellido_pat;
	}
	public String getApellido_mat()
	{
		return apellido_mat;
	}
	public void setApellido_mat(String apellido_mat)
	{
		this.apellido_mat = apellido_mat;
	}
	public String getSexo()
	{
		return sexo;
	}
	public void setSexo(String sexo)
	{
		this.sexo = sexo;
	}
	public String getRfc() 
	{
		return rfc;
	}
	public void setRfc(String rfc)
	{
		this.rfc = rfc;
	}
	public String getCurp()
	{
		return curp;
	}
	public void setCurp(String curp) 
	{
		this.curp = curp;
	}
	public String getFecha_nacimiento()
	{
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimineto) 
	{
		this.fecha_nacimiento = fecha_nacimineto;
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