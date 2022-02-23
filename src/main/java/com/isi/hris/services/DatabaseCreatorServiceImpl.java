package com.isi.hris.services;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.isi.hris.configurations.ISIHrisApplicationProperties;
import com.isi.hris.persistence.company.database.creation.DatabaseCreateParam;
import com.isi.hris.persistence.company.database.creation.DatabaseCreator;

@Service
@Lazy
public class DatabaseCreatorServiceImpl implements DatabaseCreatorService {

	@Autowired
	DatabaseCreator dbCreator;

	@Autowired
	ISIHrisApplicationProperties appProperties;

	@Override
	public void createDatabase(String host, String username, String password, String dbTemplate,
			String dumpFileDestination, String newDatabaseName, String characterSet) {

		File file = new File(
				appProperties.getFileSystemOS().equals("linux") ? appProperties.getDatabaseCreatorScriptLinux()
						: appProperties.getDatabaseCreatorScriptWindows());
		if (file.exists()) {
			String shFile = file.toString();
			DatabaseCreateParam dbParam = new DatabaseCreateParam();
			dbParam.setShFile(shFile);
			dbParam.setHost(host);
			dbParam.setUsername(username);
			dbParam.setPassword(password);
			dbParam.setTemplateDB(dbTemplate);
			dbParam.setDumpFileDestination("C:/Workspaces/" + newDatabaseName + ".sql");
			dbParam.setNewDatabaseName(newDatabaseName);
			dbParam.setCharacterSet(characterSet);
			dbCreator.createDatabase(dbParam);
		}

	}

}
