package com.fyg.microcredito.negocio;

import java.util.List;

import com.fyg.microcredito.dao.ConsultaMicroCredito;
import com.fyg.microcredito.dto.Inicio;
import com.fyg.microcredito.dto.Login;


public class ConsultasMicroCreditoNegocio {
	/**
	 * Metodo que se conecta con el dao para hacer una consulta
	 * @param usuarios recibe valores de usuarios
	 * @return regresa la lista de usuarios-perfil
	 */
	public List<Login> consultaUsuariosGeneral(Login usuarios)
	{

		List<Login> listaUsuarios = null;
		try
		{
			listaUsuarios = new ConsultaMicroCredito().consultasUsuariosGeneral(usuarios);
		}
		catch (Exception e)
		{
			System.out.println("Error" + e);
		}

		return listaUsuarios;
	}
	/**
	 * Metodo que se conecta con el dao para hacer una consulta
	 * @param perfilmenu recibe valores de perfilmenu
	 * @return regresa la lista de perfil-perfilmenu-perfil
	 */
public List<Inicio> consultaPerfilmenuGeneral(Inicio perfilmenu)
{
	List<Inicio> listaPerfilmenu = null;

	try
	{
		listaPerfilmenu = new ConsultaMicroCredito().consultaPerfilmenuGeneral(perfilmenu);
	}
	catch (Exception e)
	{
		System.out.println("Error consultas perfilmeu" + e);
	}
	return listaPerfilmenu;
}
}
