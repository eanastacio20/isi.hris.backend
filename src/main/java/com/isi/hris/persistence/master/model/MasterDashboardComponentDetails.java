package com.isi.hris.persistence.master.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MasterDashboardComponentDetails")
public class MasterDashboardComponentDetails {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ComponentID", unique = true, nullable = false)
	private Integer componentId;
	
	@Column(name = "ComponentName", nullable = false)
	private String componentName;
	
	@Column(name = "ModuleID")
	private Short moduleId;
	
	@Column(name = "Category", length = 9)
	private String category;
	
	@Column(name = "RefreshRate", nullable = false, length = 16)
	private String refreshRate;
	
	@Column(name = "IncludeCompletedItems", nullable = false)
	private byte includeCompletedItems;
	
	@Column(name = "DisplayInclusion", nullable = false, length = 15)
	private String displayInclusion;
	
	@Column(name = "IconClass", length = 50)
	private String iconClass;
	
	@Column(name = "RecordActiveFlag", nullable = false)
	private byte recordActiveFlag;
	
	@Column(name = "FilterBy", length = 19)
	private String filterBy;
	
	@Column(name = "Description", length = 65535)
	private String description;

	@Column(name = "IsMultipleInstance", nullable = false)
	private byte isMultipleInstance;
	
}
