package com.cisc181.core;

import java.util.UUID;
import java.util.Date;

public class Semester {

	UUID SemesterID;
	Date StartDate;
	Date EndDate;
	
	public Semester(UUID randomUUID, Date time, Date time2) {
		//  Auto-generated constructor stub
	}

	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	
	
}