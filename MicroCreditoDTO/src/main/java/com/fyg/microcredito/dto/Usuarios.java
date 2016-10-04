package com.fyg.microcredito.dto;

import java.util.Date;

public class Usuarios {
	/**
	 *Identificador del usuario
	 */
	private String usuario;
	/**
	 *Identificaor del perfil del usuario
	 */
	private int id_perfil;
	/**
	 *Identificador de la persona
	 */
	private String persona;
	/**
	 *Contraseña del usuario
	 */
	private String contrasenia;
	/**
	 *Cambio de contraseña del usuario
	 */
	private String cambio_contrasenia;
	/**
	 *Fecha en la que se dio de alta el usuario
	 */
	private Date fecha_alta;
	/**
	 *Ultima fecha de modificación del usuario
	 */
	private Date fecha_ult_mod;
	/**
	 *Estatus del usuario
	 */
	private String estatus;
	/**
	 * @return Obtiene el identificador del usuario
	 */
	public String getUsuario()
	{
		return usuario;
	}
	/**
	 * @param usuario ingresa el identificdor del usuario
	 */
	public void setUsuario(String usuario)
	{
		this.usuario = usuario;
	}
	/**
	 * @return Obtiene el identificador del perfil del usuario
	 */
	public int getId_perfil()
	{
		return id_perfil;
	}
	/**
	 * @param id_perfil ingresa el identificador del perfil del usuario
	 */
	public void setId_perfil(int id_perfil)
	{
		this.id_perfil = id_perfil;
	}
	/**
	 * @return Obtiene el identificador de la persona del usuario
	 */
	public String getPersona()
	{
		return persona;
	}
	/**
	 * @param persona ingresa el identificador de la persona del usuario
	 */
	public void setPersona(String persona)
	{
		this.persona = persona;
	}
	/**
	 * @return Obtiene la contraseña del usuario
	 */
	public String getContrasenia()
	{
		return contrasenia;
	}
	/**
	 * @param contrasenia ingresa la contraseña del usuario
	 */
	public void setContrasenia(String contrasenia)
	{
		this.contrasenia = contrasenia;
	}
	/**
	 * @return Obtiene el cambio de contraseña del usuario
	 */
	public String getCambio_contrasenia()
	{
		return cambio_contrasenia;
	}
	/**
	 * @param cambio_contrasenia ingresa el cambio de contraseña del usuario
	 */
	public void setCambio_contrasenia(String cambio_contrasenia)
	{
		this.cambio_contrasenia = cambio_contrasenia;
	}
	/**
	 * @return Obtiene la fecha en la que se dio de alta al usuario
	 */
	public Date getFecha_alta()
	{
		return fecha_alta;
	}
	/**
	 * @param fecha_alta ingresa la fecha de alta del usuario
	 */
	public void setFecha_alta(Date fecha_alta)
	{
		this.fecha_alta = fecha_alta;
	}
	/**
	 * @return Obtiene la ultima fecha de modificacion del regisro del usuario
	 */
	public Date getFecha_ult_mod()
	{
		return fecha_ult_mod;
	}
	/**
	 * @param fecha_ult_mod ingresa la ultima fecha de modificacion del regisro del usuario
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
