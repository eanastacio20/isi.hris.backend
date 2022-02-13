package com.isi.hris.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isi.hris.persistence.company.model.CompanyPayCodeMaster;
import com.isi.hris.persistence.master.model.MasterModule;
import com.isi.hris.services.SampleTestServices;

import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
@RequestMapping("/isi-hris")
public class SampleTestController {

	@Autowired
	SampleTestServices sts;
	
	@GetMapping("/test")
	public List<TestDTO> testMapping() {
		List<TestDTO> list = new ArrayList<>();
		list.add(new TestDTO(1L, "Juan Dela Cruz"));
		list.add(new TestDTO(2L, "Juanna Dela Cruz"));
		return list;
	}
	
	@GetMapping("/getCompanyPayCodeMaster")
	public List<CompanyPayCodeMaster> getCompanyPayCodeMaster(){
		return sts.getCompanyPayCodeMasterList();
	}
	
	@GetMapping("/getMasterModuleList")
	public List<MasterModule> getMasterModuleList(){
		return sts.getMasterModuleList();
	}

	@Data
	@AllArgsConstructor
	class TestDTO {
		
		private Long idno;
		private String name;
		
	}

}
