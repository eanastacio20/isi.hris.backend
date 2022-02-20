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
@Table(name = "MasterCompanyPermission")
public class MasterCompanyPermission {

	private MasterCompanyPermissionId id;
	
	@Column(name = "PermissionAccess", length = 1)
	private Character permissionAccess;
	
	@Column(name = "EnabledFlag")
	private Byte enabledFlag;
	
	@Column(name = "RecordActiveFlag")
	private Byte recordActiveFlag;

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "companyId", column = @Column(name = "CompanyID", nullable = false)),
			@AttributeOverride(name = "moduleId", column = @Column(name = "ModuleID", nullable = false)),
			@AttributeOverride(name = "memberModuleId", column = @Column(name = "MemberModuleID", nullable = false))})
	public MasterCompanyPermissionId getId() {
		return this.id;
	}

	public void setId(MasterCompanyPermissionId id) {
		this.id = id;
	}
	
}
