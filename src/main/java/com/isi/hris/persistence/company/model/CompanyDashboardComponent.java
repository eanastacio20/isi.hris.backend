package com.isi.hris.persistence.company.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CompanyDashboardComponent")
public class CompanyDashboardComponent {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "RecordID", unique = true, nullable = false)
	private Long recordId;
	
	@Column(name = "CompanyDashboardID", nullable = false)
	private int companyDashboardId;
	
	@Column(name = "ComponentID", nullable = false)
	private int componentId;
	
	@Column(name = "PropertyID")
	private String propertyId;
	
	@Column(name = "PropertyValue")
	private String propertyValue;
	
	@Column(name = "RefreshRate", nullable = false, length = 16)
	private String refreshRate;
	
	@Column(name = "IncludeCompletedItems", nullable = false)
	private byte includeCompletedItems;
	
	@Column(name = "DisplayInclusion", nullable = false, length = 15)
	private String displayInclusion;
	
	@Column(name = "ColumnNumber", nullable = false)
	private byte columnNumber;
	
	@Column(name = "PositionNumber", nullable = false)
	private byte positionNumber;
	
	@Column(name = "DisplayPropertyID")
	private String displayPropertyId;
	
	@Column(name = "ReviewSetObjectID", nullable = false)
	private long reviewSetObjectId;
	
}
