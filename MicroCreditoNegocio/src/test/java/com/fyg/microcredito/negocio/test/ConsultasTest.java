package com.fyg.microcredito.negocio.test;

import org.junit.Before;
import org.junit.Test;

import com.fyg.microcredito.dto.Login;
import com.fyg.microcredito.negocio.ConsultasMicroCreditoNegocio;

public class ConsultasTest {
	private ConsultasMicroCreditoNegocio data;
	private Login dataUsuarios;
	
	@Before
	public void setUp() throws Exception {
		data = new ConsultasMicroCreditoNegocio();
		dataUsuarios = new Login();
		dataUsuarios.setContrasenia("123456");
	}

	@Test
	public void testConsultaUsuarios() {
		try {
			data.consultaUsuarios(dataUsuarios);
			
		}
		catch (Exception e) 
		{
			System.out.println("No se pudo hacer la consulta a usuarios 2" + e);
		}
	}
}