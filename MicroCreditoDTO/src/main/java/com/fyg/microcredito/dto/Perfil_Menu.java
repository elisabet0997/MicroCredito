package com.fyg.microcredito.dto;

public class Perfil_Menu {
	/**
	*Identificador del perfil
	*/
private int id_perfil;
	/**
	*Identificador unico del menu
	*/
private int id_menu;
	/**
	*Orden del perfil_menu
	*/
private int orden;
	/**
	*Estatus del perfil_menu
	*/
private String estatus;
	/**
	*Se crea objeto para el uso del metodo registra menu
	*/
private Menu objetoMenu;
	/**
	 * @return Obtiene el id de perfil
	 */
	public int getId_perfil() {
		return id_perfil;
	}
	/**
	 * @param id_perfil ingresa id del perfil
	 */
	public void setId_perfil(int id_perfil) {
		this.id_perfil = id_perfil;
	}
	/**
	 * @return Obtiene el identificador unico del menu
	 */
	public int getId_menu() {
		return id_menu;
	}
	/**
	 * @param id_menu ingresa el id unico del menu
	 */
	public void setId_menu(int id_menu) {
		this.id_menu = id_menu;
	}
	/**
	 * @return Obtiene el orden del perfil_menu
	 */
	public int getOrden() {
		return orden;
	}
	/**
	 * @param orden ingresa el orden de perfil_menu
	 */
	public void setOrden(int orden) {
		this.orden = orden;
	}
	/**
	 * @return Obtiene el estatus del perfil_menu
	 */
	public String getEstatus() {
		return estatus;
	}
	/**
	 * @param estatus ingresa el estatus de perfil_menu
	 */
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	/**
	 * @return Obtiene el objeto del menu para el metodo registra menu
	 */
	public Menu getObjetoMenu() {
		return objetoMenu;
	}
	/**
	 * @param recibeMenu recibe la informacion del menu para el metodo
	 */
	public void setObjetoMenu(Menu recibeMenu) {
		this.objetoMenu = recibeMenu;
	}
}
