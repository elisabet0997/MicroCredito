package com.fyg.microcredito.negocio.test;

import org.junit.Before;
import org.junit.Test;

import com.fyg.microcredito.dto.Perfil;
import com.fyg.microcredito.negocio.OperacionesMicroCreditoNegocio;

public class PerfilTest {
	/**
	 * Se crea el objeto data para mandarle valores al perfil
	 */
private OperacionesMicroCreditoNegocio data;
	/**
	 * Objeto perfil para mandar valores
	 */
    private Perfil registroPerfil;
    /**
     * @author Elisabet Vasquez
     * @throws Exception
     */
	@Before
	public void setUp() throws Exception {
		   data = new OperacionesMicroCreditoNegocio();
		   registroPerfil = new Perfil();
		   registroPerfil.setId_perfil(134267);
		   registroPerfil.setNombre("perfil1");
		   registroPerfil.setDescripcion("Este es el perfil de un usuario comun");
		   registroPerfil.setEstatus("A");

	}
		   /**
			 * @Test ,para las pruebas unitarias
			 */
			@Test
			@SuppressWarnings("static-access")
			public void testRegistraPerfil() {

				try {
					data.registraPerfil(registroPerfil);
					System.out.println("Prueba exitosa");
				}
				catch (Exception e) {
				 System.out.printf("Error", e);
				}

			}
}
