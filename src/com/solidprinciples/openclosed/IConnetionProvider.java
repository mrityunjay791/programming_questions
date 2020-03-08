package com.solidprinciples.openclosed;

import java.sql.Connection;

public interface IConnetionProvider {
	public Connection establishconnection();
}