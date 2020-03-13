package com.solidprinciples.dependencyinversion;

import java.sql.Connection;

public class H2DataSource implements DataSource {

	// Datasource for h2 database..
	
//	private JdbcDataSource dataSource;

	@Override
	public void createConnection(DatabaseConfig databaseConfig) {
		
//		dataSource = new JdbcDataSource();
//		dataSource.setURL(databaseConfig.getUrl());
//		dataSource.setUser(databaseConfig.getUserName());
//		dataSource.setPassword(databaseConfig.getPassword());
	}

	@Override
	public Connection getConnection() {
//		try {
//			return dataSource.getConnection();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return null;
	}
}