package com.isi.hris.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isi.hris.persistence.company.configuration.DataSourceContextHolder;
import com.isi.hris.persistence.company.configuration.DataSourceRouting;
//import com.isi.hris.persistence.company.configuration.IsiErpCompanyDBConfig;
//import com.isi.hris.persistence.company.configuration.IsiErpCompanyDBConfig;
import com.isi.hris.persistence.company.model.CompanyPayCodeMaster;
import com.isi.hris.persistence.company.repository.CompanyPayCodeMasterRepository;
import com.isi.hris.persistence.master.model.MasterModule;
import com.isi.hris.persistence.master.repository.MasterModuleRepository;

@Service
public class SampleTestServices {

	@Autowired
	MasterModuleRepository mmr;

	@Autowired
	CompanyPayCodeMasterRepository cpcmr;

	@Autowired
	private DataSourceContextHolder dataSourceContextHolder;

	@Autowired
	DataSourceRouting dataSourceRouting;

	
	public List<MasterModule> getMasterModuleList() {
		return mmr.findAll();
	}

	public List<CompanyPayCodeMaster> getCompanyPayCodeMasterList() {
		return cpcmr.findAll();
	}

	public void testPool(Integer cid) {
		String dbName = String.format("%010d_erpcompany", cid);
		String db = String.format("jdbc:mysql://172.20.20.169:3306/%s", dbName);
		dataSourceRouting.setSelectedCompany(dbName);
		dataSourceRouting.switchDb(dbName, db, "case", "case", "com.mysql.cj.jdbc.Driver");
		dataSourceContextHolder.setBranchContext(cid.toString());
	}

}
