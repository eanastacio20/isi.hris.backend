package com.isi.hris.persistence.master.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "MasterClientModules")
public class MasterClientModules {

	private MasterClientModulesId id;

	public MasterClientModules() {
	}

	public MasterClientModules(MasterClientModulesId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "clientId", column = @Column(name = "ClientID", nullable = false)),
			@AttributeOverride(name = "moduleId", column = @Column(name = "ModuleID", nullable = false)),
			@AttributeOverride(name = "enabledByUserId", column = @Column(name = "EnabledByUserID")),
			@AttributeOverride(name = "enabledTimeStamp", column = @Column(name = "EnabledTimeStamp", nullable = false, length = 26)),
			@AttributeOverride(name = "disabledByUserId", column = @Column(name = "DisabledByUserID")),
			@AttributeOverride(name = "disabledTimeStamp", column = @Column(name = "DisabledTimeStamp", nullable = false, length = 26)),
			@AttributeOverride(name = "recordActiveFlag", column = @Column(name = "RecordActiveFlag"))})
	public MasterClientModulesId getId() {
		return this.id;
	}

	public void setId(MasterClientModulesId id) {
		this.id = id;
	}

}
