package com.fyg.microcredito.negocio;

import com.fyg.microcredito.dao.RegistraMicroCredito;
import com.fyg.microcredito.dto.Usuario;

public class OperacionesMicroCreditoNegocio {
	
	public void registraUsuario(Usuario usuarios){
		try 
		{
			RegistraMicroCredito dao = new RegistraMicroCredito();
			dao.registraUsuario(usuarios);
			
		}
		catch ( Exception e )
		{
			System.out.printf("Error", e);
		}
	}

}
