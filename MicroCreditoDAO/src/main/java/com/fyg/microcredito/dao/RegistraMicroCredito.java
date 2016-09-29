package com.fyg.microcredito.dao;

import org.apache.ibatis.session.SqlSession;

import com.fyg.microcredito.dao.resources.FabricaConexiones;
import com.fyg.microcredito.dto.Usuarios;

public class RegistraMicroCredito {
	
	public void registraUsuarios(Usuarios usuarios)
	{
		SqlSession sessionTx = null;
		try
		{
			sessionTx = FabricaConexiones.obtenerSesionTx();
			
			int registros = sessionTx.insert("RegistraMicroCredito.insertaRegistroUsuarios", usuarios);
			
			if(registros == 0)
			{
				System.out.print("No se pudo guardar el usuario");
				
			}
				sessionTx.commit();
		}
		catch(Exception e)
		{
			System.out.print("No se pudo guardar el usuario" + e);
		}
		finally 
		{
			FabricaConexiones.close(sessionTx);
		}
	}

}
