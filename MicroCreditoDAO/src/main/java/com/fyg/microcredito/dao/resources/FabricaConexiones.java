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
	private FabricaConexiones()
	{

	}
	/**
	 * Sesion SqlSessionFactory
	 */
	private static SqlSessionFactory factoryTX;
	/**
	 * Sesion Factory NTX
	 */
	private static SqlSessionFactory factoryNTX;

	static
	{
		iobtenerSesionTx();
		iobtenerSesionNTx();

	}
	/**
	 * Obtiene una sesion a la base de datos.
	 * @throws IOException
	 */
	private static void iobtenerSesionTx() {
		Reader readerTx;
		SqlSessionFactoryBuilder builderTx;
		SqlSessionFactory sqlMapperTx = null;

		try
		{
			readerTx = Resources.getResourceAsReader("com/fyg//microcredito/dao/resources/database-config.xml");
			builderTx = new SqlSessionFactoryBuilder();
			sqlMapperTx = builderTx.build(readerTx);

		}

		catch (Exception e)
		{
			System.out.print("Error en la Fabrica de Conexiones Tx" + e);
		}

		factoryTX = sqlMapperTx;
	}

	/**
	 * Obtiene una sesion a la base de datos.
	 * @throws IOException
	 */
	private static void iobtenerSesionNTx()
	{
		Reader readerNTx;
		SqlSessionFactoryBuilder builderNTx;
		SqlSessionFactory sqlMapperNTx = null;

		try
		{
			readerNTx = Resources.getResourceAsReader("com/fyg//microcredito/dao/resources/database-config.xml");
			builderNTx = new SqlSessionFactoryBuilder();
			sqlMapperNTx = builderNTx.build(readerNTx);

		}

		catch (Exception e)
		{
			System.out.print("Error en la Fabrica de Conexiones NTx" + e);
		}

		factoryNTX = sqlMapperNTx;
	}
	/**
	 * Obtiene una sesion a la base de datos.
	 * @return Sesion.
	 * @throws IOException
	 */
	public static SqlSession obtenerSesionTx() throws SQLException
	{
		SqlSession regreso = null;

		try
		{
			if (factoryTX == null)
			{
				iobtenerSesionTx();
			}
			if (factoryTX != null)
			{
				regreso = factoryTX.openSession(false);
			}
			if (regreso == null)
			{
				throw new Exception();
			}
		}
		catch (Exception e)
		{
			System.out.print("Sin conexión TX a la base de datos" + e);
			throw new SQLException("Sin conexión TX a la base de datos");
		}
		return regreso;
	}
	/**
	 * Obtiene una sesion a la base de datos.
	 * @return Sesion.
	 * @throws IOException
	 */
	public static SqlSession obtenerSesionNTx() throws SQLException
	{
		SqlSession regreso = null;

		try
		{
			if (factoryNTX == null)
			{
				iobtenerSesionNTx();
			}
			if (factoryNTX != null)
			{
				regreso = factoryNTX.openSession(true);
			}
			if (regreso == null)
			{
				throw new Exception();
			}
		}
		catch (Exception e)
		{
			System.out.print("Sin conexión NTX a la base de datos" + e);
			throw new SQLException("Sin conexión NTX a la base de datos");
		}
		return regreso;
	}
	/**
	 * Cierra una sesion a la base de datos.
	 * @param con tipo SqlSession
	 * @throws IOException
	 */
	public static void close(SqlSession con)
	{
		if (con != null)
		{
			con.close();
			con = null;
		}
	}
	/**
	 * Regresa los cambios de la base de datos.
	 * @param con tipo SqlSession
	 * @throws IOException
	 */
	public static void rollBack(SqlSession con)
	{
		if (con != null)
		{
			con.rollback(true);
		}
	}

}
