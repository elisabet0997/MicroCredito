package com.fyg.microcredito.negocio.test;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import com.fyg.microcredito.dto.Usuarios;
import com.fyg.microcredito.negocio.OperacionesMicroCreditoNegocio;

public class UsuariosTest {
	/**
	 * Se crea el objeto data para mandarle valores al usuario
	 */
	private OperacionesMicroCreditoNegocio data;
	/**
     * Objeto usuarios para mandar valores
     */
    private Usuarios  registroUsuarios;
    /**
     * @author Elisabet Vasquez
     * @throws Exception
     */
	@Before
	public void setUp() throws Exception {
		   data = new OperacionesMicroCreditoNegocio();

		   Date fecha = new Date();

		   registroUsuarios = new Usuarios();
		   registroUsuarios.setUsuario("elisabet0997");
		   registroUsuarios.setId_perfil(134267);
		   registroUsuarios.setPersona("persona");
		   registroUsuarios.setContrasenia("123456");
		   registroUsuarios.setCambio_contrasenia("N");
		   registroUsuarios.setFecha_alta(fecha);
		   registroUsuarios.setFecha_ult_mod(fecha);
		   registroUsuarios.setEstatus("A");


	}
	/**
	 * @Test ,para las pruebas unitarias
	 */
	@Test
	@SuppressWarnings("static-access")
	public void testRegistraUsuarios() {

		try {
			data.registraUsuarios(registroUsuarios);
			System.out.println("Prueba exitosa");
		}
		catch (Exception e) {
		 System.out.printf("Error", e);
		}

	}
}
