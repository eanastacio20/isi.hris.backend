package com.isi.hris.persistence.master.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "MasterCompanyModules")
public class MasterCompanyModules {

	private MasterCompanyModulesId id;

	public MasterCompanyModules() {
	}

	public MasterCompanyModules(MasterCompanyModulesId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "companyId", column = @Column(name = "CompanyID", nullable = false)),
			@AttributeOverride(name = "moduleId", column = @Column(name = "ModuleID", nullable = false)),
			@AttributeOverride(name = "enabledByUserId", column = @Column(name = "EnabledByUserID")),
			@AttributeOverride(name = "enabledTimeStamp", column = @Column(name = "EnabledTimeStamp", nullable = false, length = 26)),
			@AttributeOverride(name = "disabledByUserId", column = @Column(name = "DisabledByUserID")),
			@AttributeOverride(name = "disabledTimeStamp", column = @Column(name = "DisabledTimeStamp", nullable = false, length = 26)),
			@AttributeOverride(name = "recordActiveFlag", column = @Column(name = "RecordActiveFlag", nullable = false))})
	public MasterCompanyModulesId getId() {
		return this.id;
	}

	public void setId(MasterCompanyModulesId id) {
		this.id = id;
	}

}
