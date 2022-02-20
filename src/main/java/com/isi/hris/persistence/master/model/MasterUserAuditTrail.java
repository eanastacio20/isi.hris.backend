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
@Table(name = "MasterUserAuditTrail")
public class MasterUserAuditTrail {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "RecordID", unique = true, nullable = false)
	private Long recordId;
	
	@Column(name = "ModifiedUserID", nullable = false)
	private int modifiedUserId;
	
	@Column(name = "ActionType", length = 6)
	private String actionType;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LastModifiedTimeStamp", nullable = false, length = 26)
	private Date lastModifiedTimeStamp;
	
	@Column(name = "LastModifiedByUseriD", nullable = false)
	private int lastModifiedByUseriD;
	
	@Column(name = "Remarks", length = 65535)
	private String remarks;
	
}
