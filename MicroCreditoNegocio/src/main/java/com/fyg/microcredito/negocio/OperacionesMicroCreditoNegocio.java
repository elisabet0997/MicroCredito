package com.fyg.microcredito.negocio;

import com.fyg.microcredito.dao.RegistraMicroCredito;
import com.fyg.microcredito.dto.Usuarios;

public class OperacionesMicroCreditoNegocio {
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
}
