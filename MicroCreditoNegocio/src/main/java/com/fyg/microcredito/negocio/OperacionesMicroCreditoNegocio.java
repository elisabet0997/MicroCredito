package com.fyg.microcredito.negocio;

import com.fyg.microcredito.dao.RegistraMicroCredito;
import com.fyg.microcredito.dto.Personas;
import com.fyg.microcredito.dto.Usuarios;

public class OperacionesMicroCreditoNegocio
{
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
	
	public void inactivaUsuarios(Usuarios usuarios)
	{
		try
		{
			RegistraMicroCredito dao = new RegistraMicroCredito();
			dao.inactivaUsuarios(usuarios);
		}
		catch(Exception e)
		{
			System.out.printf("Error", e);
		}
	}
}
