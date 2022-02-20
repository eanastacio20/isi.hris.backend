package com.isi.hris.persistence.master.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class MasterUserCompanyProfileId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "UserID", nullable = false)
	private int userId;
	
	@Column(name = "CompanyID", nullable = false)
	private int companyId;
	
	@Column(name = "ProfileID", nullable = false)
	private short profileId;
	
}
