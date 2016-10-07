package com.fyg.microcredito.negocio.test;

import java.sql.Date;

import org.junit.Before;
import org.junit.Test;

import com.fyg.microcredito.dto.Usuarios;
import com.fyg.microcredito.negocio.OperacionesMicroCreditoNegocio;

public class InactivaUsuario
{
	/**
	 * Se crea el objeto data para mandarle valores a usuarios
	 */
	private OperacionesMicroCreditoNegocio data;
	/**
     * Objeto usuarios para mandar valores
     */
    private Usuarios  inactivaUsuarios;
    /**
     * @author Elisabet Vasquez
     * @throws Exception
     */
	@Before
	public void setUp() throws Exception
	{
		   data = new OperacionesMicroCreditoNegocio();
		   Date fecha = new Date(0);
		   inactivaUsuarios = new Usuarios();
		   inactivaUsuarios.setUsuario("elisabet0997");
		   inactivaUsuarios.setFecha_ult_mod(fecha);
		   inactivaUsuarios.setEstatus("I");
	}
	/**
	 * @Test ,para las pruebas unitarias
	 */
	@Test
	@SuppressWarnings("static-access")

	public void testInactivaUsuarios()
	{

		try
		{
			data.inactivaUsuarios(inactivaUsuarios);
			System.out.println("Prueba exitosa");
		}
		catch (Exception e)
		{
		 System.out.printf("Error", e);
		}
	}
}
