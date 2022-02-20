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
@Table(name = "MasterModuleTree")
public class MasterModuleTree {

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "moduleId", column = @Column(name = "ModuleID", nullable = false)),
			@AttributeOverride(name = "memberModuleId", column = @Column(name = "MemberModuleID", nullable = false))})
	private MasterModuleTreeId id;
	
	@Column(name = "DisplayNameOverride", length = 65535)
	private String displayNameOverride;
	
	@Column(name = "OrderSequence")
	private Short orderSequence;
	
	@Column(name = "ModuleMode", length = 6)
	private String moduleMode;
	
	@Column(name = "ParentModuleID")
	private Short parentModuleId;
	
	@Column(name = "URLOverride", length = 120)
	private String urloverride;
	
	@Column(name = "IconPathOverride", length = 120)
	private String iconPathOverride;
	
	@Column(name = "UserTypePermissionOverride", length = 1)
	private Character userTypePermissionOverride;
	
	@Column(name = "ClientPermissionOverride", length = 1)
	private Character clientPermissionOverride;
	
	@Column(name = "CompanyPermissionOverride", length = 1)
	private Character companyPermissionOverride;
	
	@Column(name = "UserPermissionOverride", length = 1)
	private Character userPermissionOverride;
	
	@Column(name = "RequiredAccessLevelOverride", length = 1)
	private Character requiredAccessLevelOverride;
	
	@Column(name = "MethodCallOverride", length = 65535)
	private String methodCallOverride;
	
	@Column(name = "RerenderTargetOverride", length = 65535)
	private String rerenderTargetOverride;
	
	@Column(name = "ShowInNavigationMenuOverride", nullable = false)
	private byte showInNavigationMenuOverride;
	
	@Column(name = "InternalGroup", length = 1)
	private Character internalGroup;
	
	@Column(name = "UrlParam", length = 50)
	private String urlParam;
	
	@Column(name = "CustomCss", length = 50)
	private String customCss;
	
	@Column(name = "PermissionProxyModuleID")
	private Short permissionProxyModuleId;

}
