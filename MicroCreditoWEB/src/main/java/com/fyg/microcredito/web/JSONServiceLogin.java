package com.fyg.microcredito.web;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

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
		contrasenia.setContrasenia(f);
		
		List<Login> lista = new ConsultasMicroCreditoNegocio().consultaUsuarios(contrasenia);
		for (int i = 0; i < lista.size(); i++)
		{
			String usuario = lista.get(i).getUsuario();
			String estatusUsuario = lista.get(i).getEstatusUsuario();
			String nombrePerfil = lista.get(i).getNombrePerfil();
			String descripcionPerfil = lista.get(i).getDescripcionPerfil();
			String estatusPerfil = lista.get(i).getEstatusPerfil();
			
			jsonObject.put("usuario", usuario);
			jsonObject.put("estatusUsuario", estatusUsuario);
			jsonObject.put("nombrePerfil", nombrePerfil);
			jsonObject.put("descripcionPerfil", descripcionPerfil);
			jsonObject.put("estatusPerfil", estatusPerfil);
		}
		String result = "" + jsonObject;
		return Response.status(200).entity(result).build();
	}

}
