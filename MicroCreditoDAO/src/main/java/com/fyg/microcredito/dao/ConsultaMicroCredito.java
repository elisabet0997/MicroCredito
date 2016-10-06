package com.fyg.microcredito.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.fyg.microcredito.dao.resources.FabricaConexiones;
import com.fyg.microcredito.dto.Inicio;
import com.fyg.microcredito.dto.Login;

public class ConsultaMicroCredito {

@SuppressWarnings("unchecked")
public List<Inicio> consultaPerfilmenu(Inicio perfilmenu)
	{
		SqlSession sessionTx = null;
		List<Inicio> listaPerfilmenu = null;
		try
		{
			//Abrimos conexion Transaccional
			sessionTx = FabricaConexiones.obtenerSesionTx();
			//Se hace una consulta a la tabla perfilmenu
			listaPerfilmenu = sessionTx.selectList("ConsultaMultiSitio.consultaPerfilmenuGeneral", perfilmenu);
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

@SuppressWarnings("unchecked")
public List<Login> consultaUsuarios(Login usuarios)
{
	SqlSession sessionTx = null;
	List<Login> listaUsuarios = null;
	try
	{
		//Abrimos conexion Transaccional
		sessionTx = FabricaConexiones.obtenerSesionTx();
		//Se hace una consulta a la tabla usuarios
		listaUsuarios = sessionTx.selectList("ConsultaMultiSitio.consultaUsuariosGeneral", usuarios);
	}
	catch (Exception e)
	{
		System.out.println("No se pudo realizar la consulta a usuarios");
	}
	finally
	{
		FabricaConexiones.close(sessionTx);
	}
	return listaUsuarios;
}
}
