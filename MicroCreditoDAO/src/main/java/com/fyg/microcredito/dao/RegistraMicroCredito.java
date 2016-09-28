package com.fyg.microcredito.dao;

import org.apache.ibatis.session.SqlSession;
import com.fyg.microcredito.dao.resources.FabricaConexiones;
import com.fyg.microcredito.dto.Usuario;


public class RegistraMicroCredito {
	
	/**
	 * Ingresa un  registro a la tabla usuarios
	 * @param usuario 
	 * @return estatus respuesta
	 */

	public void registraUsuarios(Usuario usuarios) {
		SqlSession sessionTx = null;
		
		try {
			//Abrimos conexion Transaccional
			sessionTx = FabricaConexiones.obtenerSesionTx();
			sessionTx.insert("RegistraMicroCredito.insertaRegistroUsuarios", usuarios);
	
			//Realizamos commit
			sessionTx.commit();
		}
		catch (Exception ex) {
			//Realizamos rollBack
			
			FabricaConexiones.rollBack(sessionTx);
           
		}
		finally {
			FabricaConexiones.close(sessionTx);
		}
	}

}
