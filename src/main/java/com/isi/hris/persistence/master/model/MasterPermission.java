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
@Table(name = "MasterPermission")
public class MasterPermission {

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "userType", column = @Column(name = "UserType", nullable = false)),
			@AttributeOverride(name = "moduleId", column = @Column(name = "ModuleID", nullable = false)),
			@AttributeOverride(name = "memberModuleId", column = @Column(name = "MemberModuleID", nullable = false))})
	private MasterPermissionId id;
	
	@Column(name = "PermissionAccess", nullable = false, length = 1)
	private char permissionAccess;

}
