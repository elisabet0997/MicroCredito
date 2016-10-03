package com.fyg.microcredito.dao;

import org.apache.ibatis.session.SqlSession;

import com.fyg.microcredito.dao.resources.FabricaConexiones;
import com.fyg.microcredito.dto.Personas;
import com.fyg.microcredito.dto.Usuarios;

public class RegistraMicroCredito {
	
	private Personas ObjPersonas;
	//Método que inactiva un usuario
	public void inactivaUsuarios(Usuarios usuarios)
	{
		SqlSession sessionTx = null;
		try
		{
			sessionTx = FabricaConexiones.obtenerSesionTx();
			int actualizar = sessionTx.update("RegistraMicroCredito.actualizaRegistroUsuarios", usuarios);
			if(actualizar == 0)
			{
				System.out.print("Error al actualizar usuario");
			}
			sessionTx.commit();
		}
		catch(Exception e)
		{
			FabricaConexiones.rollBack(sessionTx);
			System.out.println("Se realizo un rollBack" + e);
		}
		finally
		{
			FabricaConexiones.close(sessionTx);
		}
	}
	//Registro de una persona 
	public void registraPersonas(Personas personas)
	{
		SqlSession sessionTx = null;
		try
		{
			sessionTx = FabricaConexiones.obtenerSesionTx();
			
			int registros = sessionTx.insert("RegistraMicroCredito.insertaRegistroPersonas", personas);
			
			if(registros == 0)
			{
				System.out.print("No se pudo guardar la persona");
				
			}
				sessionTx.commit();
		}
		catch(Exception e)
		{
			System.out.print("No se pudo guardar la persona" + e);
		}
		finally 
		{
			FabricaConexiones.close(sessionTx);
		}
	}
	//Registro de un usuario 
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
