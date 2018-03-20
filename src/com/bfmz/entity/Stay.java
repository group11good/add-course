package com.bfmz.entity;

public class Stay {
	private String clnumber;
	private String ronumber;
	private String stintime;
	private String stouttime;
	private String stnumber;
	private String user1id;
	
	public String getClnumber() {
		return clnumber;
	}

	public void setClnumber(String clnumber) {
		this.clnumber = clnumber;
	}

	public String getRonumber() {
		return ronumber;
	}

	public void setRonumber(String ronumber) {
		this.ronumber = ronumber;
	}

	public String getStintime() {
		return stintime;
	}

	public void setStintime(String stintime) {
		this.stintime = stintime;
	}

	public String getStouttime() {
		return stouttime;
	}

	public void setStouttime(String stouttime) {
		this.stouttime = stouttime;
	}

	public String getStnumber() {
		return stnumber;
	}

	public void setStnumber(String stnumber) {
		this.stnumber = stnumber;
	}

	public String getUser1id() {
		return user1id;
	}

	public void setUser1id(String user1id) {
		this.user1id = user1id;
	}

	@Override
	public String toString() {
		return "Stay [clnumber=" + clnumber + ", ronumber=" + ronumber + ", stintime="
				+ stintime + ",stouttime="+stouttime+",stnumber="+stnumber+",user1id="+user1id+"]";
	}
}
