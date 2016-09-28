package com.fyg.microcredito.dao.resources;

import java.io.Reader;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;




public final class FabricaConexiones {

	/**
	 * Constructor de la clase FabricaConexiones
	 */
	private FabricaConexiones() {
	}

	/**
	 * sesion SqlSessionFactory
	 */
	private static SqlSessionFactory fACTORY_TX;
	/**
	 * sesion FACTORY_NTX
	 */
	private static SqlSessionFactory fACTORY_NTX;

	static {
		//Tx
		iobtenerSesionTx();

		//NTx
		iobtenerSesionNTx();
	}

	/**
	 * Obtiene una sesion a la base de datos.
	 * @throws IOException
	 */
	private static void iobtenerSesionTx() {
		Reader 						readerTx;
		SqlSessionFactoryBuilder 	builderTx;
		SqlSessionFactory 			sqlMapperTx = null;
		try {
			readerTx 		= Resources.getResourceAsReader( "com/fyg/microcredito/dao/resources/database-config.xml" );
			builderTx 		= new SqlSessionFactoryBuilder( );
			sqlMapperTx 	= builderTx.build( readerTx );
		} catch ( Exception e ) {
			
			System.out.printf("Existio un error en la Fabrica de Conexiones Tx", e);
 		}
		fACTORY_TX = sqlMapperTx;
		}

	/**
	 * Obtiene una sesion a la base de datos.
	 * @throws IOException
	 */
	private static void iobtenerSesionNTx()	{
		Reader 						readerNTx;
		SqlSessionFactoryBuilder 	builderNTx;
		SqlSessionFactory 			sqlMapperNTx = null;
		try {
			readerNTx 		= Resources.getResourceAsReader( "com/fyg/microcredito/dao/resources/database-config.xml" );
			builderNTx 		= new SqlSessionFactoryBuilder( );
			sqlMapperNTx 	= builderNTx.build( readerNTx );
		} catch ( Exception e ) {
			System.out.printf("Existio un error en la Fabrica de Conexiones Tx", e);
 		}
		fACTORY_NTX = sqlMapperNTx;
		}

	/**
	 * Obtiene una sesion a la base de datos.
	 * @return Sesion.
	 * @throws IOException
	 */
	public static SqlSession obtenerSesionTx( ) throws SQLException {
		SqlSession regreso = null;
		try {
			if ( fACTORY_TX == null ) {
				iobtenerSesionTx();
			}
			if ( fACTORY_TX != null ) {
				regreso = fACTORY_TX.openSession( false );
			}
			if ( regreso == null ) {
				throw new Exception(  );
			}
		} catch (Exception e) {
			System.out.printf("Sin conexion TX a la base de datos", e);
		}
		return regreso;
	}


	/**
	 * Obtiene una sesion a la base de datos.
	 * @return Sesion.
	 * @throws IOException
	 */
	public static SqlSession obtenerSesionNTx( ) throws SQLException {
		SqlSession regreso = null;
		try {
			if ( fACTORY_NTX == null ) {
				iobtenerSesionNTx();
			}
			if ( fACTORY_NTX != null ) {
				regreso = fACTORY_NTX.openSession( true ); //Autocommit ON, no permite transacciones
			}
			if ( regreso == null ) {
				throw new Exception(  );
			}
		} catch (Exception e) {
			System.out.printf("Sin conexion NTX a la base de datos", e);
		}
		return regreso;
	}

	/**
	 * Cierra una sesion a la base de datos.
	 * @param conn tipo SqlSession
	 * @throws IOException
	 */
	public static void close(SqlSession conn) {
		if ( conn != null ) {
			conn.close( );
			conn = null;
			}
	}
	/**
	 * Regresa los cambios de la base de datos.
	 * @param conn tipo SqlSession
	 * @throws IOException
	 */
	public static void rollBack(SqlSession conn) {
		if ( conn != null ) {
			conn.rollback( true );
		}
	}

}
