package com.isi.hris.services;

public interface DatabaseCreatorService {

	void createDatabase(String host, String username, String password, String dbTemplate,
			String dumpFileDestination, String newDatabaseName, String characterSet);
	
}
