package com.isi.hris.persistence.master.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MasterAuditLogReport")
public class MasterAuditLogReport {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "TransactionID", unique = true, nullable = false)
	private Long transactionId;
	
	@Column(name = "CompanyID")
	private Long companyId;
	
	@Column(name = "GeneratedByUserID")
	private Integer generatedByUserId;
	
	@Column(name = "ReportType", length = 14)
	private String reportType;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "StartTimeStamp", length = 26)
	private Date startTimeStamp;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EndTimeStamp", length = 26)
	private Date endTimeStamp;
	
	@Column(name = "ReportStatus", length = 11)
	private String reportStatus;
	
	@Column(name = "FilterParameter", length = 65535)
	private String filterParameter;
	
	@Column(name = "CallParameter", length = 65535)
	private String callParameter;
	
	@Column(name = "Remarks", length = 65535)
	private String remarks;
	
	@Column(name = "ReportFileName")
	private String reportFileName;
	
	@Column(name = "TotalGeneratedRows")
	private Long totalGeneratedRows;
	
	@Column(name = "IsViewed")
	private Byte isViewed;

}
