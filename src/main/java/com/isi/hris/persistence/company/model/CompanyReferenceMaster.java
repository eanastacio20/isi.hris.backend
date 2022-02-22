package com.isi.hris.persistence.company.model;
// Generated Feb 21, 2022 9:22:39 AM by Hibernate Tools 3.2.4.GA

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CompanyReferenceMaster")
public class CompanyReferenceMaster {

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "referenceType", column = @Column(name = "ReferenceType", nullable = false, length = 12)),
			@AttributeOverride(name = "referenceId", column = @Column(name = "ReferenceID", nullable = false, length = 10))})
	private CompanyReferenceMasterId id;
	
	@Column(name = "ReferenceDescription", length = 50)
	private String referenceDescription;
	
	@Column(name = "ReferenceStatusFlag")
	private Boolean referenceStatusFlag;
	
}
