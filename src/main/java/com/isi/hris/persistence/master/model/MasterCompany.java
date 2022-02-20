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
@Table(name = "MasterCompany")
public class MasterCompany {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CompanyID", unique = true, nullable = false)
	private Integer companyId;
	
	@Column(name = "CompanyName", nullable = false, length = 50)
	private String companyName;
	
	@Column(name = "CompanyURL", length = 50)
	private String companyUrl;
	
	@Column(name = "CompanyIPAddress", length = 50)
	private String companyIpaddress;
	
	@Column(name = "Notes", length = 500)
	private String notes;
	
	@Column(name = "PrimaryCompanyAdminUserID", nullable = false)
	private int primaryCompanyAdminUserId;
	
	@Column(name = "CompanyLogoImageURL", length = 120)
	private String companyLogoImageUrl;
	
	@Column(name = "CompanySplashImageURL", length = 120)
	private String companySplashImageUrl;
	
	@Column(name = "CompanyCSSURL", length = 120)
	private String companyCssurl;
	
	@Column(name = "CompanyThemeName", length = 120)
	private String companyThemeName;
	
	@Column(name = "CompanyEmail", length = 120)
	private String companyEmail;
	
	@Column(name = "CompanyCountryCode", length = 5)
	private String companyCountryCode;
	
	@Column(name = "CompanyPhoneNo", length = 20)
	private String companyPhoneNo;
	
	
	@Column(name = "IMSAccessURL", length = 120)
	private String imsaccessUrl;
	
	@Column(name = "IMSAccessGroupID")
	private Integer imsaccessGroupId;
	
	@Column(name = "IMSAccessClientID")
	private Integer imsaccessClientId;
	
	@Column(name = "IMSAccessCaseID")
	private Integer imsaccessCaseId;
	
	@Column(name = "IMSAccessCallURL", length = 120)
	private String imsaccessCallUrl;
	
	@Column(name = "IMSAccessFlag", nullable = false)
	private byte imsaccessFlag;
	
	@Column(name = "CreatedByUserID", nullable = false)
	private int createdByUserId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreatedTimeStamp", nullable = false, length = 26)
	private Date createdTimeStamp;
	
	@Column(name = "DisabledByUserID")
	private Integer disabledByUserId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DisabledTimeStamp", nullable = false, length = 26)
	private Date disabledTimeStamp;
	
	@Column(name = "CompanyStatusFlag", nullable = false)
	private byte companyStatusFlag;
	
}
