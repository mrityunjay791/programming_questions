package com.solidprinciples.dependencyinversion;

import java.sql.Connection;

public interface DataSource {
	void createConnection(DatabaseConfig config);

	Connection getConnection();

}