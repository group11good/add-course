package com.bfmz.entity;

public class Person {
	private String coursename;
	private String coid;
	private String tuitionfee;
	
	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getCoid() {
		return coid;
	}

	public void setCoid(String coid) {
		this.coid = coid;
	}

	public String getTuitionfee() {
		return tuitionfee;
	}

	public void setTuitionfee(String tuitionfee) {
		this.tuitionfee = tuitionfee;
	}

	@Override
	public String toString() {
		return "Person [coursename=" + coursename + ", coid=" + coid + ", tuitionfee=" + tuitionfee + "]";
	}
}
