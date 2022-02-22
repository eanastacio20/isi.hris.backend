package com.isi.hris.persistence.company.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class CompanyReferenceMasterId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "ReferenceType", nullable = false, length = 12)
	private String referenceType;
	
	@Column(name = "ReferenceID", nullable = false, length = 10)
	private String referenceId;

}
