package com.isi.hris.persistence.company.database.creation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class DatabaseCreator {

	public final Logger log = LoggerFactory.getLogger(getClass());
	
	public abstract void createDatabase(DatabaseCreateParam databaseCreateParam);
	
}
