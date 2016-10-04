package com.fyg.microcredito.dto;

public class Perfil {
	/**
	*Identificador del perfil
	*/
private int	id_perfil;
	/**
	*Nombre del perfil
	*/
private String nombre;
	/**
	*Descripcion del perfil
	*/
private	String descripcion;
	/**
	*Estatus del perfil
	*/
private String estatus;
	/**
	 * @return obtiene el id del perfil
	 */
	public int getId_perfil() {
		return id_perfil;
	}
	/**
	 * @param id_perfil ingresa el id del perfil
	 */
	public void setId_perfil(int id_perfil) {
		this.id_perfil = id_perfil;
	}
	/**
	 * @return obtiene el nombre del perfil
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre ingresa el nombre del perfil
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return obtiene la descripcion del perfil
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion ingresa la descripcion de perfil
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return obtiene el estatus del perfil
	 */
	public String getEstatus() {
		return estatus;
	}
	/**
	 * @param estatus ingresa el estatus del perfil
	 */
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

}
