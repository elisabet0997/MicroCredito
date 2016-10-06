package com.fyg.microcredito.negocio;

import java.util.List;

import com.fyg.microcredito.dao.ConsultaMicroCredito;
import com.fyg.microcredito.dto.Inicio;
import com.fyg.microcredito.dto.Login;

public class ConsultasMicroCreditoNegocio {
	
public List<Login> consultaUsuarios(Login usuarios)
	{
		List<Login> listaUsuarios = null;
	
		try
		{
			listaUsuarios = new ConsultaMicroCredito().consultaUsuarios(usuarios);
		}
		catch (Exception e)
		{
			System.out.println("Error consultas usuarios" + e);
		}
		return listaUsuarios;
	}

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
