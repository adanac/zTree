package com.adanac.study.ztree.util;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DBCPUtil {
	private static DataSource dataSource;
	
	static{
		try {
			Properties props = new Properties();
			InputStream in = DBCPUtil.class.getClassLoader().getResourceAsStream("dbcpconfig.properties");
			props.load(in);
			dataSource = BasicDataSourceFactory.createDataSource(props);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static DataSource getDataSource(){
		return dataSource;
	}
	public static Connection getConnection(){
		try {
			Connection conn = dataSource.getConnection();
			return conn;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
