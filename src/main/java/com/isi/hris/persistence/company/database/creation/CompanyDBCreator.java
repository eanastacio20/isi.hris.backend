package com.isi.hris.persistence.company.database.creation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.isi.hris.util.ShExecutor;

@Component
@Lazy
public class CompanyDBCreator extends DatabaseCreator {

	@Autowired
	ShExecutor shExecutor;

	@Override
	public void createDatabase(DatabaseCreateParam dbParams) {
		executeShellScript(dbParams.getShFile(), dbParams.getHost(), dbParams.getUsername(), dbParams.getPassword(),
				dbParams.getTemplateDB(), dbParams.getDumpFileDestination(), dbParams.getNewDatabaseName(),
				dbParams.getCharacterSet());

	}

	private void executeShellScript(String shFile, String host, String username, String password, String dbTemplate,
			String dumpFileDestination, String newDatabaseName, String characterSet) {

		List<String> params = new ArrayList<>();
		params.add(shFile);
		params.add(host);
		params.add(username);
		params.add(password);
		params.add(dbTemplate);
		params.add(dumpFileDestination);
		params.add(newDatabaseName);
		params.add(characterSet);
		try {
			shExecutor.executeShellScript(params);
		} catch (IOException e) {
			log.error("{}", e);
		}
	}

}
