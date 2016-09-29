package com.fyg.microcredito.dao.resources;

import java.io.Reader;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public final class FabricaConexiones {
	
	private FabricaConexiones()
	{
		
	}
	
	private static SqlSessionFactory FactoryTX;
	
	private static SqlSessionFactory FactoryNTX;
	
	static 
	{
		iobtenerSesionTx();
		iobtenerSesionNTx();
		
	}
	//Conexión del tipo Tx
	private static void iobtenerSesionTx()
	{
		Reader readerTx;
		SqlSessionFactoryBuilder builderTx;
		SqlSessionFactory sqlMapperTx = null;
		
		try
		{
			readerTx = Resources.getResourceAsReader("com/fyg//microcredito/dao/resources/database-config.xml");
			builderTx = new SqlSessionFactoryBuilder();
			sqlMapperTx = builderTx.build(readerTx);
			
		}
		
		catch(Exception e)
		{
			System.out.print("Error en la Fabrica de Conexiones Tx" + e);
		}
		
		FactoryTX = sqlMapperTx;
	}
	
	//Conexión del tipo NTx
	
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
		
		catch(Exception e)
		{
			System.out.print("Error en la Fabrica de Conexiones NTx" + e);
		}
		
		FactoryNTX = sqlMapperNTx;
	}
	
	public static SqlSession obtenerSesionTx() throws SQLException
	{
		SqlSession regreso = null;
		
		try
		{
			if(FactoryTX == null)
			{
				iobtenerSesionTx();
			}
			if(FactoryTX != null)
			{
				regreso = FactoryTX.openSession(false);
			}
			if(regreso == null)
			{
				throw new Exception();
			}
		}
		catch(Exception e)
		{
			System.out.print("Sin conexión TX a la base de datos" + e);
			throw new SQLException("Sin conexión TX a la base de datos");
		}
		return regreso;
	}
	
	public static SqlSession obtenerSesionNTx() throws SQLException
	{
		SqlSession regreso = null;
		
		try
		{
			if(FactoryNTX == null)
			{
				iobtenerSesionNTx();
			}
			if(FactoryNTX != null)
			{
				regreso = FactoryNTX.openSession(true);
			}
			if(regreso == null)
			{
				throw new Exception();
			}
		}
		catch(Exception e)
		{
			System.out.print("Sin conexión NTX a la base de datos" + e);
			throw new SQLException("Sin conexión NTX a la base de datos");
		}
		return regreso;
	}
	
	public static void close(SqlSession con)
	{
		if (con != null)
		{
			con.close();
			con = null;
		}
	}
	
	public static void rollBack(SqlSession con)
	{
		if(con != null)
		{
			con.rollback(true);
		}
	}
	
	
}
