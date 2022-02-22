package com.isi.hris.persistence.company.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CompanyControl", uniqueConstraints = @UniqueConstraint(columnNames = { "MatterID", "CompanyID" }))
public class CompanyControl {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CompanyID", unique = true, nullable = false)
	private Integer companyId;

	@Column(name = "CompanyName", nullable = false, length = 120)
	private String companyName;

	@Column(name = "ClientID", nullable = false)
	private int clientId;

	@Column(name = "MatterID")
	private Integer matterId;

	@Column(name = "DatabaseApplianceID", nullable = false)
	private int databaseApplianceId;

	@Column(name = "CompanyFileRepository", nullable = false, length = 65535)
	private String companyFileRepository;

	@Column(name = "WebURL", nullable = false, length = 65535)
	private String webUrl;

	@Column(name = "EncodingScheme", nullable = false, length = 40)
	private String encodingScheme;

	@Column(name = "CreatedByUserID", nullable = false)
	private int createdByUserId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreatedTimeStamp", nullable = false, length = 26)
	private Date createdTimeStamp;

	@Column(name = "LastModifiedByUserID", nullable = false)
	private int lastModifiedByUserId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LastModifiedTimeStamp", nullable = false, length = 26)
	private Date lastModifiedTimeStamp;

	@Column(name = "CompanyPassword", length = 40)
	private String companyPassword;

	@Column(name = "CompanyStatus", nullable = false)
	private byte companyStatus;

	@Column(name = "SQLFullTextLanguage", length = 20)
	private String sqlfullTextLanguage;

	@Column(name = "Keywords", length = 65535)
	private String keywords;

	@Column(name = "Notes", length = 65535)
	private String notes;

	@Column(name = "CompanyObjectID", nullable = false)
	private long companyObjectId;

	@Column(name = "CompanyAdminID", nullable = false)
	private int companyAdminId;

	@Column(name = "RecordActiveFlag", nullable = false)
	private byte recordActiveFlag;

	@Column(name = "CompanyControl")
	private String companyControl;

	@Column(name = "RedactionReasons", length = 100)
	private String redactionReasons;

	@Column(name = "RedactionDefault", length = 25)
	private String redactionDefault;

	@Column(name = "ECADBApplianceID")
	private Integer ecadbapplianceId;

	@Column(name = "ECAIndexApplianceID")
	private Integer ecaindexApplianceId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ECADBCreationDate", length = 26)
	private Date ecadbcreationDate;

	@Column(name = "TimeZoneID")
	private Integer timeZoneId;

	@Column(name = "ExportFilePath", length = 65535)
	private String exportFilePath;

	@Column(name = "UseSingleVolume")
	private Boolean useSingleVolume;

	@Column(name = "DefaultView")
	private Byte defaultView;

	@Column(name = "OCRTimeout")
	private Integer ocrtimeout;

	@Column(name = "MaxFileSize")
	private Integer maxFileSize;

	@Column(name = "LoadFileDocIDPrefix", nullable = false, length = 10)
	private String loadFileDocIdprefix;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "companyControl")
	private Set<CompanyAccessProfile> companyAccessProfiles = new HashSet<CompanyAccessProfile>(0);

}
