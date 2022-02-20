package com.isi.hris.persistence.master.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class MasterClientModulesId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "ClientID", nullable = false)
	private int clientId;

	@Column(name = "ModuleID", nullable = false)
	private short moduleId;

	@Column(name = "EnabledByUserID")
	private Integer enabledByUserId;

	@Column(name = "EnabledTimeStamp", nullable = false, length = 26)
	private Date enabledTimeStamp;

	@Column(name = "DisabledByUserID")
	private Integer disabledByUserId;

	@Column(name = "DisabledTimeStamp", nullable = false, length = 26)
	private Date disabledTimeStamp;

	@Column(name = "RecordActiveFlag")
	private Byte recordActiveFlag;

}
