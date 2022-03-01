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
	@AttributeOverrides({ @AttributeOverride(name = "moduleId", column = @Column(name = "ModuleID", nullable = false)),
			@AttributeOverride(name = "memberModuleId", column = @Column(name = "MemberModuleID", nullable = false)) })
	private MasterModuleTreeId id;

	@Column(name = "DisplayNameOverride", columnDefinition = "text", length = 65535)
	private String displayNameOverride;

	@Column(name = "OrderSequence")
	private Short orderSequence;

	@Column(name = "ModuleMode", columnDefinition = "ENUM('MODULE','ACTION','PAGE')", length = 6)
	private String moduleMode;

	@Column(name = "ParentModuleID")
	private Short parentModuleId;

	@Column(name = "URLOverride", length = 120)
	private String urloverride;

	@Column(name = "IconPathOverride", length = 120)
	private String iconPathOverride;

	@Column(name = "UserTypePermissionOverride", columnDefinition = "ENUM('0','1','2','3')", length = 1)
	private Character userTypePermissionOverride;

	@Column(name = "ClientPermissionOverride", columnDefinition = "ENUM('0','1','2','3')", length = 1)
	private Character clientPermissionOverride;

	@Column(name = "CompanyPermissionOverride", columnDefinition = "ENUM('0','1','2','3')", length = 1)
	private Character companyPermissionOverride;

	@Column(name = "UserPermissionOverride", columnDefinition = "ENUM('0','1','2','3')", length = 1)
	private Character userPermissionOverride;

	@Column(name = "RequiredAccessLevelOverride", columnDefinition = "ENUM('0','1','2')", length = 1)
	private Character requiredAccessLevelOverride;

	@Column(name = "MethodCallOverride", columnDefinition = "text", length = 65535)
	private String methodCallOverride;

	@Column(name = "RerenderTargetOverride", columnDefinition = "text", length = 65535)
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
