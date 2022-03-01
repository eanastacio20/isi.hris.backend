package com.isi.hris.persistence.master.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MasterModule", uniqueConstraints = @UniqueConstraint(columnNames = "FullDisplayName"))
public class MasterModule {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ModuleID", unique = true, nullable = false)
	private Short moduleId;

	@Column(name = "FullDisplayName", unique = true, length = 50)
	private String fullDisplayName;

	@Column(name = "Description", columnDefinition = "text", length = 65535)
	private String description;

	@Column(name = "MenuLevel", nullable = false)
	private byte menuLevel;

	@Column(name = "ModuleMode", columnDefinition = "ENUM('MODULE','ACTION','PAGE')", length = 6)
	private String moduleMode;

	@Column(name = "ParentModuleID")
	private Short parentModuleId;

	@Column(name = "URL", length = 120)
	private String url;

	@Column(name = "IconPath", length = 120)
	private String iconPath;

	@Column(name = "PermissionType", columnDefinition = "ENUM('COMPANY','SYSTEM')", length = 7)
	private String permissionType;

	@Column(name = "ModuleType", columnDefinition = "ENUM('COMPANY','SYSTEM')", length = 7)
	private String moduleType;

	@Column(name = "RequiresSelected", columnDefinition = "ENUM('CLIENT','COMPANY')", length = 7)
	private String requiresSelected;

	@Column(name = "MethodCall", columnDefinition = "text", length = 65535)
	private String methodCall;

	@Column(name = "RerenderTarget", columnDefinition = "text", length = 65535)
	private String rerenderTarget;

	@Column(name = "ShowInNavigationMenu", nullable = false)
	private byte showInNavigationMenu;

	@Column(name = "UserTypePermissionSetting", nullable = false, length = 1)
	private char userTypePermissionSetting;

	@Column(name = "RequiredAccessLevelSetting", nullable = false, length = 1)
	private char requiredAccessLevelSetting;

	@Column(name = "SystemRequiredFlag", nullable = false)
	private byte systemRequiredFlag;

	@Column(name = "ShortDisplayName", length = 50)
	private String shortDisplayName;

	@Column(name = "RecordActiveFlag", nullable = false)
	private byte recordActiveFlag;

}
