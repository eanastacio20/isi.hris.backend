package com.isi.hris.persistence.company.model;

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
			@AttributeOverride(name = "referenceType", column = @Column(name = "ReferenceType", columnDefinition = "ENUM('Division','Department','Position','Designation','Salary Grade')", nullable = false, length = 12)),
			@AttributeOverride(name = "referenceId", column = @Column(name = "ReferenceID", nullable = false, length = 10)) })
	private CompanyReferenceMasterId id;

	@Column(name = "ReferenceDescription", length = 50)
	private String referenceDescription;

	@Column(name = "ReferenceStatusFlag")
	private Boolean referenceStatusFlag;

}
