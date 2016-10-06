package com.fyg.microcredito.negocio.test;

import org.junit.Before;
import org.junit.Test;

import com.fyg.microcredito.dto.Menu;
import com.fyg.microcredito.dto.Perfilmenu;
import com.fyg.microcredito.negocio.OperacionesMicroCreditoNegocio;

public class PruebaPerfilMenu {
	/**
	 * Se crea el objeto data para mandarle valores al usuario
	 */
	private OperacionesMicroCreditoNegocio data;
	/**
     * Objeto perfil_menu para mandar valores
     */
    private Perfilmenu  registroPerfilmenu;
    /**
     * Objeto menu para mandar valores
     */
    private Menu registroMenu;
    /**
     * @author Elisabet Vasquez
     * @throws Exception
     */
	@Before
	public void setUp() throws Exception {
		   data = new OperacionesMicroCreditoNegocio();
		   /**
		    * Datos que se enviaran a menu
		    */
		   registroMenu = new Menu();

		   registroMenu.setId_padre(123456);
		   registroMenu.setMenu("menu1");
		   registroMenu.setDescripcion("Este menu es el que va a utilizar un usuario comun");
		   registroMenu.setUrl("No hay url");
		   registroMenu.setEstatus("A");
		   /**
		    * Datos que se enviaran a perfil_menu
		    */
		   registroPerfilmenu = new Perfilmenu();

		   registroPerfilmenu.setObjetoMenu(registroMenu);
		   registroPerfilmenu.setId_perfil(134267);
		   registroPerfilmenu.setOrden(1);
		   registroPerfilmenu.setEstatus("A");



	}
	/**
	 * @Test ,para las pruebas unitarias
	 */
	@Test
	@SuppressWarnings("static-access")
	public void testRegistraPerfilmenu() {

		try {
			data.registraPerfilmenu(registroPerfilmenu);
			System.out.println("Prueba exitosa");
		}
		catch (Exception e) {
		 System.out.printf("Error", e);
		}
	}
}
