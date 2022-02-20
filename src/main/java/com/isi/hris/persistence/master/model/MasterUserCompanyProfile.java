package com.isi.hris.persistence.master.model;

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
@Table(name = "MasterUserCompanyProfile")
public class MasterUserCompanyProfile {

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "userId", column = @Column(name = "UserID", nullable = false)),
			@AttributeOverride(name = "companyId", column = @Column(name = "CompanyID", nullable = false)),
			@AttributeOverride(name = "profileId", column = @Column(name = "ProfileID", nullable = false))})
	private MasterUserCompanyProfileId id;
	
}
