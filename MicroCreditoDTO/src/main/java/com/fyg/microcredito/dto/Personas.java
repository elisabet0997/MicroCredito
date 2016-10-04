package com.fyg.microcredito.dto;

import java.util.Date;
/**
 * @author Elisabet Vasquez
 *
 */
public class Personas {
	/**
	 *Identificador de la persona
	 */
private String persona;
/**
*Nombre de la persona
*/
private String nombre;
/**
*Apellido paterno de la persona
*/
private String apellido_pat;
/**
*Apellido materno de la persona
*/
private String apellido_mat;
/**
*Sexo de la persona
*/
private String sexo;
/**
*RFC de la persona
*/
private String rfc;
/**
*Curp de la persona
*/
private String curp;
/**
*Fecha de ncimiento de la persona
*/
private String fecha_nacimiento;
/**
*Fecha en la que se di de alta a la persona
*/
private Date fecha_alta;
/**
*Fecha en la que fue modificado el registro de la persona
*/
private Date fecha_ult_mod;
/**
*Estatus de la persona
*/
private String estatus;
/**
 * @return Obtiene el identificador de la persona
 */
	public String getPersona()
	{
		return persona;
	}
	/**
	 * @param persona ingresa el identificador a la persona
	 */
	public void setPersona(String persona)
	{
		this.persona = persona;
	}
	/**
	 * @return Obtiene el nombre de la persona
	 */
	public String getNombre()
	{
		return nombre;
	}
	/**
	 * @param nombre ingresa el nombre de la persona
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	/**
	 * @return Obtiene el apelliddo paterno de la persona
	 */
	public String getApellido_pat()
	{
		return apellido_pat;
	}
	/**
	 * @param apellido_pat ingresa el apellido paterno de la persona
	 */
	public void setApellido_pat(String apellido_pat)
	{
		this.apellido_pat = apellido_pat;
	}
	/**
	 * @return Obtiene el apellido aterno de la persona
	 */
	public String getApellido_mat()
	{
		return apellido_mat;
	}
	/**
	 * @param apellido_mat ingresa el apellido materno de la persona
	 */
	public void setApellido_mat(String apellido_mat)
	{
		this.apellido_mat = apellido_mat;
	}
	/**
	 * @return Obtiene el sexo de la persona
	 */
	public String getSexo()
	{
		return sexo;
	}
	/**
	 * @param sexo ingresa el sexo de la persona
	 */
	public void setSexo(String sexo)
	{
		this.sexo = sexo;
	}
	/**
	 * @return Obtiene el RFC de la persona
	 */
	public String getRfc()
	{
		return rfc;
	}
	/**
	 * @param rfc ingresa el RFC de la persona
	 */
	public void setRfc(String rfc)
	{
		this.rfc = rfc;
	}
	/**
	 * @return Obtiene el CURP de la persona
	 */
	public String getCurp()
	{
		return curp;
	}
	/**
	 * @param curp ingresa el CURP de la persona
	 */
	public void setCurp(String curp)
	{
		this.curp = curp;
	}
	/**
	 * @return Obtiene la fecha de ncimiento de la persona
	 */
	public String getFecha_nacimiento()
	{
		return fecha_nacimiento;
	}
	/**
	 * @param fecha_nacimineto ingresa la fecha de nacimiento de la persona
	 */
	public void setFecha_nacimiento(String fecha_nacimineto)
	{
		this.fecha_nacimiento = fecha_nacimineto;
	}
	/**
	 * @return Obtiene la fecha en la que se dio de alta la persona
	 */
	public Date getFecha_alta()
	{
		return fecha_alta;
	}
	/**
	 * @param fecha_alta ingresa la fecha de alta de la persona
	 */
	public void setFecha_alta(Date fecha_alta)
	{
		this.fecha_alta = fecha_alta;
	}
	/**
	 * @return Obtiene la ultima fecha de modificacion del regisro de la persona
	 */
	public Date getFecha_ult_mod()
	{
		return fecha_ult_mod;
	}
	/**
	 * @param fecha_ult_mod ingresa la ultima fecha de modificacion del regisro de la persona
	 */
	public void setFecha_ult_mod(Date fecha_ult_mod)
	{
		this.fecha_ult_mod = fecha_ult_mod;
	}
	/**
	 * @return Obtiene el estatus de la persona
	 */
	public String getEstatus()
	{
		return estatus;
	}
	/**
	 * @param estatus ingresa el estatus de la persona
	 */
	public void setEstatus(String estatus)
	{
		this.estatus = estatus;
	}
}