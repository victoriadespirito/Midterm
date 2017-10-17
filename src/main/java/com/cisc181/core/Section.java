package com.cisc181.core;

import java.util.UUID;


public class Section {

	UUID CourseID, SemesterId, SectionID;
	int RoomID;
	
	
	public Section(UUID CourseID, UUID SemesterID, int RoomID) {
		//  Auto-generated constructor stub
	}

	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public UUID getSemesterId() {
		return SemesterId;
	}
	public void setSemesterId(UUID semesterId) {
		SemesterId = semesterId;
	}
	public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}
	
}