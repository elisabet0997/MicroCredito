package com.fyg.microcredito.negocio;

import com.fyg.microcredito.dao.RegistraMicroCredito;
import com.fyg.microcredito.dto.Personas;
import com.fyg.microcredito.dto.Usuarios;

public class OperacionesMicroCreditoNegocio
{
	/**
	 * Metodo para registrar personas
	 * @param personas variable con los datos de l persona
	 * @throws Exception
	 */
	public void registraPersonas(Personas personas)
	{
		try
		{
			RegistraMicroCredito dao = new RegistraMicroCredito();
			dao.registraPersonas(personas);

		}
		catch ( Exception e )
		{
			System.out.printf("Error", e);
		}
	}
	/**
	 * Metodo para registrar usuarios
	 * @param usuarios variable con los datos del usuario
	 * @throws Exception
	 */
	public void registraUsuarios(Usuarios usuarios)
	{
		try
		{
			RegistraMicroCredito dao = new RegistraMicroCredito();
			dao.registraUsuarios(usuarios);

		}
		catch ( Exception e )
		{
			System.out.printf("Error", e);
		}
	}
	/**
	 * Metodo para inctivar un usuario
	 * @param usuarios variable para inactivar un usuario
	 * @throws Exception
	 */
	public void inactivaUsuarios(Usuarios usuarios)
	{
		try
		{
			RegistraMicroCredito dao = new RegistraMicroCredito();
			dao.inactivaUsuarios(usuarios);
		}
		catch (Exception e)
		{
			System.out.printf("Error", e);
		}
	}
}
