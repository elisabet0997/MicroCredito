package com.fyg.microcredito.comun;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

import com.fyg.microcredito.dto.Inicio;
import com.fyg.microcredito.dto.Login;
import com.fyg.microcredito.negocio.ConsultasMicroCreditoNegocio;


@Path("/login")

public class JSONServiceLogin {
@Path("{i}")
@GET
@Produces("application/json")
	public Response jsonLogin(@PathParam("i") String f) throws JSONException 
	{
		JSONObject jsonObject = new JSONObject();
		Login contrasenia = new Login();
		Inicio id_perfil = new Inicio();
		contrasenia.setContrasenia(f);
		id_perfil.setId_perfil(134267);
		List<Inicio> listaP = new ConsultasMicroCreditoNegocio().consultaPerfilmenuGeneral(id_perfil);
		List<Login> listaU = new ConsultasMicroCreditoNegocio().consultaUsuariosGeneral(contrasenia);
		for (int i = 0; i < listaU.size(); i++)
		{
			String usuario = listaU.get(i).getUsuario();
			String estatusUsuario = listaU.get(i).getEstatusUsuario();
			String nombrePerfil = listaU.get(i).getNombrePerfil();
			String descripcionPerfil = listaU.get(i).getDescripcionPerfil();
			String estatusPerfil = listaU.get(i).getEstatusPerfil();
			
			String menu = listaP.get(i).getMenu();
			String descripcionMenu = listaP.get(i).getDescripcionMenu();
			String url = listaP.get(i).getUrl();
			String estatusMenu = listaP.get(i).getEstatusMenu();
			String orden = listaP.get(i).getOrden();
			String estatusPerfilmenu = listaP.get(i).getEstatusPerfilmenu();

			jsonObject.put("usuario", usuario);
			jsonObject.put("estatusUsuario", estatusUsuario);
			jsonObject.put("nombrePerfil", nombrePerfil);
			jsonObject.put("descripcionPerfil", descripcionPerfil);
			jsonObject.put("estatusPerfil", estatusPerfil);
			jsonObject.put("menu", menu);
			jsonObject.put("descripcionMenu", descripcionMenu);
			jsonObject.put("url", url);
			jsonObject.put("estatusMenu", estatusMenu);
			jsonObject.put("orden", orden);
			jsonObject.put("estatusPerfilmenu", estatusPerfilmenu);
			
		}
		String result = "" + jsonObject;
		return Response.status(200).entity(result).build();
		
	}

}
