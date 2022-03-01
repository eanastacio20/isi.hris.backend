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

	@Column(name = "Category", columnDefinition = "ENUM('TABULAR','BAR_CHART')", length = 9)
	private String category;

	@Column(name = "RefreshRate", columnDefinition = "ENUM('EVERY_15_MINUTES','EVERY_30_MINUTES','EVERY_HOUR','NONE')", nullable = false, length = 16)
	private String refreshRate;

	@Column(name = "IncludeCompletedItems", nullable = false)
	private byte includeCompletedItems;

	@Column(name = "DisplayInclusion", columnDefinition = "ENUM('CURRENT_WEEK','LAST_WEEK','TWO_WEEKS_AGO','THREE_WEEKS_AGO','LAST_MONTH','OLDER','NONE')", nullable = false, length = 15)
	private String displayInclusion;

	@Column(name = "IconClass", length = 50)
	private String iconClass;

	@Column(name = "RecordActiveFlag", nullable = false)
	private byte recordActiveFlag;

	@Column(name = "FilterBy", columnDefinition = "ENUM('WORKFLOW_RELATED','COLLECTION_SPECIFIC')", length = 19)
	private String filterBy;

	@Column(name = "Description", columnDefinition = "text", length = 65535)
	private String description;

	@Column(name = "IsMultipleInstance", nullable = false)
	private byte isMultipleInstance;

}
