package com.cisc181.core;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.UUID;

public class Section {
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;

	public Section() {
	}

	public Section(UUID CourseID, UUID SemesterID, UUID SectionID, int RoomID) {
		this.CourseID=CourseID;
		this.SemesterID=SemesterID;
		this.SectionID= SectionID;
		this.RoomID= RoomID;
	}

	public UUID getCourseID() {
		return CourseID;
	}

	
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
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
