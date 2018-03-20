package com.bfmz.entity;

public class Course {
	private String coname;
	private String coid;
	private String acyear;
	private String semester;
	private String max;
	private String credit;
	private String tid;


		public String getConame() {
		return coname;
	}


	public void setConame(String coname) {
		this.coname = coname;
	}


	public String getCoid() {
		return coid;
	}


	public void setCoid(String coid) {
		this.coid = coid;
	}


	public String getAcyear() {
		return acyear;
	}


	public void setAcyear(String acyear) {
		this.acyear = acyear;
	}


	public String getSemester() {
		return semester;
	}


	public void setSemester(String semester) {
		this.semester = semester;
	}


	public String getMax() {
		return max;
	}


	public void setMax(String max) {
		this.max = max;
	}


	public String getCredit() {
		return credit;
	}


	public void setCredit(String credit) {
		this.credit = credit;
	}


	public String getTid() {
		return tid;
	}


	public void setTid(String tid) {
		this.tid = tid;
	}


		@Override
		public String toString() {
			return "Course [coname=" + coname + ", coid=" + coid + ", acyear=" + acyear + ", semester="
					+ semester + ", max=" + max + ", credit=" + credit + ", tid=" + tid + "]";
		}
}
