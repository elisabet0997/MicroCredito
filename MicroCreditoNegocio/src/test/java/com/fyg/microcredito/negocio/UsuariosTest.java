package com.fyg.microcredito.negocio;

import java.sql.Date;

import org.junit.Before;
import org.junit.Test;

import com.fyg.microcredito.dto.Usuarios;

public class UsuariosTest 
{
private OperacionesMicroCreditoNegocio data;
	
    private Usuarios  registroUsuarios;
    
@Before
	public void setUp() throws Exception {
		   data = new OperacionesMicroCreditoNegocio();
		   
		   Date fecha_alta = new Date(0);
		   
		   registroUsuarios = new Usuarios();
		   registroUsuarios.setUsuario("elisabet0997");
		   registroUsuarios.setId_perfil(123456);
		   registroUsuarios.setPersona("persona");
		   registroUsuarios.setContrasenia("123456");
		   registroUsuarios.setCambio_contrasenia("N");
		   registroUsuarios.setFecha_alta(fecha_alta);
		   registroUsuarios.setFecha_ult_mod(fecha_alta);
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
