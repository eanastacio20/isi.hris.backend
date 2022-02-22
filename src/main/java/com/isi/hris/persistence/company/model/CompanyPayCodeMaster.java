package com.isi.hris.persistence.company.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CompanyPayCodeMaster")
public class CompanyPayCodeMaster {

	@Id
	@Column(name = "PayCode", unique = true, nullable = false)
	private byte payCode;
	
	@Column(name = "PayCodeDescription", length = 50)
	private String payCodeDescription;
	
}
