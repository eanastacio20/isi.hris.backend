package com.isi.hris.persistence.master.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "MasterClientPermission")
public class MasterClientPermission {

	private MasterClientPermissionId id;

	public MasterClientPermission() {
	}

	public MasterClientPermission(MasterClientPermissionId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "clientId", column = @Column(name = "ClientID", nullable = false)),
			@AttributeOverride(name = "moduleId", column = @Column(name = "ModuleID", nullable = false)),
			@AttributeOverride(name = "memberModuleId", column = @Column(name = "MemberModuleID", nullable = false)),
			@AttributeOverride(name = "permissionAccess", column = @Column(name = "PermissionAccess", length = 1)),
			@AttributeOverride(name = "enabledFlag", column = @Column(name = "EnabledFlag", nullable = false)),
			@AttributeOverride(name = "recordActiveFlag", column = @Column(name = "RecordActiveFlag", nullable = false))})
	public MasterClientPermissionId getId() {
		return this.id;
	}

	public void setId(MasterClientPermissionId id) {
		this.id = id;
	}

}
