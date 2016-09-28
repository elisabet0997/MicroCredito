package com.fyg.microcredito.negocio.test;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import com.fyg.microcredito.dto.Usuario;
import com.fyg.microcredito.negocio.OperacionesMicroCreditoNegocio;

public class UsuariosTest {
	private OperacionesMicroCreditoNegocio data;
	
    private Usuario  registroUsuario;
    
	@Before
	public void setUp() throws Exception {
		   data = new OperacionesMicroCreditoNegocio();
		   
		   Date fecha_alta = new Date();
		   
		   registroUsuario = new Usuario();
		   registroUsuario.setUsuario("elisabet0997");
		   registroUsuario.setId_perfil(123456);
		   registroUsuario.setPersona("persona");
		   registroUsuario.setContrasenia("123456");
		   registroUsuario.setCambio_contrasenia('N');
		   registroUsuario.setFecha_alta(fecha_alta);
		   registroUsuario.setFecha_ult_mod(fecha_alta);
		   registroUsuario.setEstatus('A');
		   

	}
	/**
	 * @Test ,para las pruebas unitarias
	 */
	@Test
	@SuppressWarnings("static-access")
	public void testRegistraUsuario() {

		try {
			data.registraUsuario(registroUsuario);
			System.out.println("Prueba exitosa");
		}
		catch (Exception e) {
		 System.out.printf("Error", e);
		}

	}
}
