package com.fyg.microcredito.dto;
/**
 * @author Elisabet Vasquez
 *
 */
public class Menu {
	/**
	 *Identificdor unico de menu
	 */
private int id_menu;
	/**
	*Identificador padre
	*/
private int id_padre;
	/**
	*Nombre del menu
	*/
private String menu;
	/**
	*Descripcion del menu
	*/
private String descripcion;
	/**
	*URL del menu
	*/
private String url;
	/**
	*Estatus del menu
	*/
private String estatus;
	/**
	 * @return Obtiene el id del menu
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
	 * @return Obtiene el id padre del menu
	 */
	public int getId_padre() {
		return id_padre;
	}
	/**
	 * @param id_padre ingresa el id padre
	 */
	public void setId_padre(int id_padre) {
		this.id_padre = id_padre;
	}
	/**
	 * @return Obtiene el nombre del menu
	 */
	public String getMenu() {
		return menu;
	}
	/**
	 * @param menu ingresa nombre del menu
	 */
	public void setMenu(String menu) {
		this.menu = menu;
	}
	/**
	 * @return Obtiene la descripcion del menu
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion ingresa la descripcion del menu
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return Obtiene la direccion url del menu
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url ingresa la direccion url del menu
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return Obtiene el estatus del menu
	 */
	public String getEstatus() {
		return estatus;
	}
	/**
	 * @param estatus ingresa el estatus del menu
	 */
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
}
