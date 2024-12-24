package com.sit;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hostel {
	@Id
	private int stdId;
	private String stdName;
	private int stdAge;
	private String stdCourse;

	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getStdAge() {
		return stdAge;
	}
	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}
	public String getStdCourse() {
		return stdCourse;
	}
	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdAge=" + stdAge + ", stdCourse=" + stdCourse
				+ "]";
	}
	public Hostel(int stdId, String stdName, int stdAge, String stdCourse) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAge = stdAge;
		this.stdCourse = stdCourse;
	}
	
	public Hostel() {
		
	}
	

}
