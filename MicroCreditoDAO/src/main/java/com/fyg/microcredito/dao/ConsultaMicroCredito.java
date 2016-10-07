package com.fyg.microcredito.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.fyg.microcredito.dao.resources.FabricaConexiones;
import com.fyg.microcredito.dto.Inicio;
import com.fyg.microcredito.dto.Login;

public class ConsultaMicroCredito {

	@SuppressWarnings("unchecked")
	public List<Login> consultasUsuariosGeneral(Login usuarios)
	{
		SqlSession sessionTx = null;
		List<Login> listaUsuarios = null;
		try
		{
			sessionTx = FabricaConexiones.obtenerSesionTx();
			listaUsuarios = sessionTx.selectList("ConsultaMicroCredito.consultasUsuariosGeneral", usuarios);
		}
		catch (Exception e)
		{
			System.out.println("No se pudo hacer la consulta a la tabla usuarios" + e);
		}
		finally
		{
			FabricaConexiones.close(sessionTx);
		}
		System.out.println("Consulta:" + listaUsuarios);
		return listaUsuarios;
		
	}

@SuppressWarnings("unchecked")
public List<Inicio> consultaPerfilmenuGeneral(Inicio perfilmenu)
{
	SqlSession sessionTx = null;
	List<Inicio> listaPerfilmenu = null;
	try
	{
		sessionTx = FabricaConexiones.obtenerSesionTx();

		listaPerfilmenu = sessionTx.selectList("ConsultaMicroCredito.consultaPerfilmenuGeneral", perfilmenu);
	}
	catch (Exception e)
	{
		System.out.println("No se pudo realizar la consulta a perfilmenu");
	}
	finally
	{
		FabricaConexiones.close(sessionTx);
	}
	return listaPerfilmenu;
}
}
