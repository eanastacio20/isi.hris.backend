package com.isi.hris.persistence.company.model;

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
public class EmployeeAttendanceRecordId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "EmployeeID", nullable = false)
	private int employeeId;
	
	@Column(name = "EmployeeAttendanceDate", nullable = false, length = 10)
	private Date employeeAttendanceDate;
	
}
