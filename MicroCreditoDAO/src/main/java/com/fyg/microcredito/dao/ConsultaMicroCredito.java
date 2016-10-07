package com.fyg.microcredito.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.fyg.microcredito.dao.resources.FabricaConexiones;
import com.fyg.microcredito.dto.Inicio;
import com.fyg.microcredito.dto.Login;

public class ConsultaMicroCredito {
	/**
	 * Metodo que consulta un usuario
	 * @param usuarios para recibir valor de la tabla usuarios
	 * @return regresa una lista de usuarios-perfil
	 */
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

		return listaUsuarios;

	}
	/**
	 * Metodo que consulta perfilmenu
	 * @param perfilmenu para recibir valor de la tabla perfilmenu
	 * @return regresa una lista de perfilmenu-perfil-menu
	 */
@SuppressWarnings("unchecked")
public List<Inicio> consultaPerfilmenuGeneral(Inicio perfilmenu)
{
	SqlSession sessionTx = null;
	List<Inicio> listaPerfilmenu = null;
	try
	{
		sessionTx = FabricaConexiones.obtenerSesionTx();

		listaPerfilmenu = sessionTx.selectList("ConsultaMicroCredito.consultasPerfilmenuGeneral", perfilmenu);
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
