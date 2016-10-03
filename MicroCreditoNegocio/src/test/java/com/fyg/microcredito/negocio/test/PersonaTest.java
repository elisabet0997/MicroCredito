package com.fyg.microcredito.negocio.test;



import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.fyg.microcredito.dto.Personas;
import com.fyg.microcredito.negocio.OperacionesMicroCreditoNegocio;

public class PersonaTest {
private OperacionesMicroCreditoNegocio data;
	
    private Personas registroPersonas;
	@Before
	public void setUp() throws Exception {
		   data = new OperacionesMicroCreditoNegocio();
		   Date fecha = new Date();
		   registroPersonas = new Personas();
		   registroPersonas.setPersona("persona");
		   registroPersonas.setNombre("Elisabet");
		   registroPersonas.setApellido_pat("Vasquez");
		   registroPersonas.setApellido_mat("Martinez");
		   registroPersonas.setSexo("F");
		   registroPersonas.setRfc("ER4567");
		   registroPersonas.setCurp("VAME970109DFSRL06");
		   registroPersonas.setFecha_nacimiento("1997/01/09");
		   registroPersonas.setFecha_alta(fecha);
		   registroPersonas.setFecha_ult_mod(fecha);
		   registroPersonas.setEstatus("A");
	}
		   /**
			 * @Test ,para las pruebas unitarias
			 */
			@Test
			@SuppressWarnings("static-access")
			public void testRegistraPersonas() {

				try {
					data.registraPersonas(registroPersonas);
					System.out.println("Prueba exitosa");
				}
				catch (Exception e) {
				 System.out.printf("Error", e);
				}

			}
}
