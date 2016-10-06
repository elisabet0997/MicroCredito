package com.fyg.microcredito.dao;



import org.apache.ibatis.session.SqlSession;

import com.fyg.microcredito.dao.resources.FabricaConexiones;
import com.fyg.microcredito.dto.Menu;
import com.fyg.microcredito.dto.Perfil;
import com.fyg.microcredito.dto.Perfilmenu;
import com.fyg.microcredito.dto.Personas;
import com.fyg.microcredito.dto.Usuarios;

public class RegistraMicroCredito {
	/**
	 * Inactiva un registro de la usuarios
	 * @param usuarios variable para la actualizacion
	 */
	public void inactivaUsuarios(Usuarios usuarios)
	{
		SqlSession sessionTx = null;
		try
		{
			sessionTx = FabricaConexiones.obtenerSesionTx();
			int actualizar = sessionTx.update("RegistraMicroCredito.actualizaRegistroUsuarios", usuarios);
			if (actualizar == 0)
			{
				System.out.print("Error al actualizar usuario");
			}
			sessionTx.commit();
		}
		catch (Exception e)
		{
			FabricaConexiones.rollBack(sessionTx);
			System.out.println("Se realizo un rollBack" + e);
		}
		finally
		{
			FabricaConexiones.close(sessionTx);
		}
	}
	/**
	 * Metodo registra personas, Ingresa un registro en la tabla personas
	 * @param personas variable para registro
	 */
	public void registraPersonas(Personas personas) {
		SqlSession sessionTx = null;
		try
		{
			sessionTx = FabricaConexiones.obtenerSesionTx();
			int registros = sessionTx.insert("RegistraMicroCredito.insertaRegistroPersonas", personas);
			if (registros == 0) {
				System.out.print("No se pudo guardar la persona");
			}
				sessionTx.commit();
		}
		catch (Exception e)
		{
			System.out.print("No se pudo guardar la persona" + e);
		}
		finally
		{
			FabricaConexiones.close(sessionTx);
		}
	}
	/**
	 * Metodo registra usuarios, Ingresa un registro en la tabla usuarios
	 * @param usuarios variable para registro
	 */
	public void registraUsuarios(Usuarios usuarios) {
		SqlSession sessionTx = null;
		try
		{
			sessionTx = FabricaConexiones.obtenerSesionTx();

			int registros = sessionTx.insert("RegistraMicroCredito.insertaRegistroUsuarios", usuarios);

			if (registros == 0)
			{
				System.out.print("No se pudo guardar el usuario");

			}
				sessionTx.commit();
		}
		catch (Exception e)
		{
			System.out.print("No se pudo guardar el usuario" + e);
		}
		finally
		{
			FabricaConexiones.close(sessionTx);
		}
	}
	/**
	 * Metodo registra perfil, Ingresa un registro en la tabla perfil
	 * @param perfil variable para registro
	 */
	public void registraPerfil(Perfil perfil) {
		SqlSession sessionTx = null;
		try
		{
			sessionTx = FabricaConexiones.obtenerSesionTx();

			int registro = sessionTx.insert("RegistraMicroCredito.insertaRegistroPerfil", perfil);

			if (registro == 0)
			{
				System.out.print("No se pudo guardar el perfil");

			}
				sessionTx.commit();
		}
		catch (Exception e)
		{
			System.out.print("No se pudo guardar el perfil" + e);
		}
		finally
		{
			FabricaConexiones.close(sessionTx);
		}
	}
	/**
	 * Se crea un ObjetoMenu para obtener el id cuando se registra en la tabla menu
	 */
	private Menu objMenu;
	/**
	 * Metodo registra menu , registra el menu para perfil_menu
	 * @param menu variable para registro
	 * @param session sesion, en caso de ser atomica la transaccion
	 * @return menu registrado
	 * @throws Exception en caso de existir un error
	 */
	private Menu registraMenu(Menu menu, SqlSession session) throws Exception
	{
		SqlSession sessionTx = null;

		//Logica para saber si es atomica la transaccion
		if (session == null)
		{
			sessionTx = FabricaConexiones.obtenerSesionTx();
		}
		else
		{
			sessionTx = session;
		}
		//Registra el menu
		int registro = sessionTx.insert("RegistraMicroCredito.insertaRegistroMenu", menu);
		//Se valida el regisro
		if (registro == 0)
		{
			if (session == null)
			{
				FabricaConexiones.rollBack(sessionTx);
				FabricaConexiones.close(sessionTx);
			}
		}
		//Obtenemos el id del menu que se genero al insertar y se le asigna al objeto menu
		objMenu = menu;
		//Como la conexion no es atomica se reliza un comit
		if (session == null)
		{
			sessionTx.commit();
		}
		//Como la conexion no es atomica se cierra
		if (session == null)
		{
			FabricaConexiones.close(sessionTx);
		}
		return menu;
	}
	/**
	 * Metodo registra perfil_menu, Ingresa un registro en la tabla perfil_menu
	 * @param perfilmenu variable para registro
	 * */
	public void registraPerfilmenu(Perfilmenu perfilmenu)
	{
		SqlSession sessionTx = null;
		try
		{
			//Abrimos conexion transaccional
			sessionTx = FabricaConexiones.obtenerSesionTx();
			//Primero se registra el menu
			registraMenu(perfilmenu.getObjetoMenu(), sessionTx);
			//Se le asigna el id del menu resultante en la tabla de perfil_menu
			perfilmenu.setId_menu(objMenu.getId_menu());
			//Registra el perfil_menu
			int registro = sessionTx.insert("RegstraMicroCredito.insertaRegistroPerfilmenu", perfilmenu);
			if (registro == 0)
			{
				System.out.println("Error en registrar el perfilmenu");
			}
			//Se realiza un commit
			sessionTx.commit();
		}
		catch (Exception e)
		{
			//Se realiza un rollBack
			FabricaConexiones.rollBack(sessionTx);
			System.out.println("Se relizo un rollBack");
		}
		finally
		{
			FabricaConexiones.close(sessionTx);
		}
	}

}
