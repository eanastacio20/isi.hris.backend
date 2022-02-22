package com.isi.hris.persistence.company.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "CompanyShiftMaster")
public class CompanyShiftMaster {

	@Id
	@Column(name = "ShiftCode", unique = true, nullable = false, length = 10)
	private String shiftCode;
	
	@Column(name = "ShiftDescription", length = 50)
	private String shiftDescription;
	
	@Column(name = "Hours_Sunday", precision = 12, scale = 0)
	private Float hoursSunday;
	
	@Column(name = "Hours_Monday", precision = 12, scale = 0)
	private Float hoursMonday;
	
	@Column(name = "Hours_Tuesday", precision = 12, scale = 0)
	private Float hoursTuesday;
	
	@Column(name = "Hours_Wednesday", precision = 12, scale = 0)
	private Float hoursWednesday;
	
	@Column(name = "Hours_Thursday", precision = 12, scale = 0)
	private Float hoursThursday;
	
	@Column(name = "Hours_Friday", precision = 12, scale = 0)
	private Float hoursFriday;
	
	@Column(name = "Hours_Saturday", precision = 12, scale = 0)
	private Float hoursSaturday;
	
	@Column(name = "Lunch_Sunday", precision = 12, scale = 0)
	private Float lunchSunday;
	
	@Column(name = "Lunch_Monday", precision = 12, scale = 0)
	private Float lunchMonday;
	
	@Column(name = "Lunch_Tuesday", precision = 12, scale = 0)
	private Float lunchTuesday;
	
	@Column(name = "Lunch_Wednesday", precision = 12, scale = 0)
	private Float lunchWednesday;
	
	@Column(name = "Lunch_Thursday", precision = 12, scale = 0)
	private Float lunchThursday;
	
	@Column(name = "Lunch_Friday", precision = 12, scale = 0)
	private Float lunchFriday;
	
	@Column(name = "Lunch_Saturday", precision = 12, scale = 0)
	private Float lunchSaturday;
	
	@Column(name = "Break_Sunday", precision = 12, scale = 0)
	private Float breakSunday;
	
	@Column(name = "Break_Monday", precision = 12, scale = 0)
	private Float breakMonday;
	
	@Column(name = "Break_Tuesday", precision = 12, scale = 0)
	private Float breakTuesday;
	
	@Column(name = "Break_Wednesday", precision = 12, scale = 0)
	private Float breakWednesday;
	
	@Column(name = "Break_Thursday", precision = 12, scale = 0)
	private Float breakThursday;
	
	@Column(name = "Break_Friday", precision = 12, scale = 0)
	private Float breakFriday;
	
	@Column(name = "Break_Saturday", precision = 12, scale = 0)
	private Float breakSaturday;
	
	@Temporal(TemporalType.TIME)
	@Column(name = "Start_Sunday", length = 16)
	private Date startSunday;
	
	@Temporal(TemporalType.TIME)
	@Column(name = "Start_Monday", length = 16)
	private Date startMonday;
	
	@Temporal(TemporalType.TIME)
	@Column(name = "Start_Tuesday", length = 16)
	private Date startTuesday;
	
	@Temporal(TemporalType.TIME)
	@Column(name = "Start_Wednesday", length = 16)
	private Date startWednesday;
	
	@Temporal(TemporalType.TIME)
	@Column(name = "Start_Thursday", length = 16)
	private Date startThursday;
	
	@Temporal(TemporalType.TIME)
	@Column(name = "Start_Friday", length = 16)
	private Date startFriday;
	
	@Temporal(TemporalType.TIME)
	@Column(name = "Start_Saturday", length = 16)
	private Date startSaturday;
	
	@Column(name = "FlexTime", precision = 12, scale = 0)
	private Float flexTime;
	
	@Column(name = "Allowance_Food", precision = 12, scale = 0)
	private Float allowanceFood;
	
	@Column(name = "Allowance_Transport", precision = 12, scale = 0)
	private Float allowanceTransport;
	
	@Column(name = "IsEnabled")
	private Boolean isEnabled;
	
}
