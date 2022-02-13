package com.isi.hris.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	public List<MasterModule> getMasterModuleList(){
		return mmr.findAll();
	}
	
	public List<CompanyPayCodeMaster> getCompanyPayCodeMasterList(){
		return cpcmr.findAll();
	}

}
