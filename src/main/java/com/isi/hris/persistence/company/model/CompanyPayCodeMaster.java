package com.isi.hris.persistence.company.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CompanyPayCodeMaster {

	@Id
	private Integer payCode;
	private String payCodeDescription;
	
}
