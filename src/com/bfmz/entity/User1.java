package com.bfmz.entity;

public class User1 {
	private String user1id;
	private String user1pass;
	private String user1name;
	
public String getUser1id() {
		return user1id;
	}

	public void setUser1id(String user1id) {
		this.user1id = user1id;
	}

	public String getUser1pass() {
		return user1pass;
	}

	public void setUser1pass(String user1pass) {
		this.user1pass = user1pass;
	}

	public String getUser1name() {
		return user1name;
	}

	public void setUser1name(String user1name) {
		this.user1name = user1name;
	}

@Override
	public String toString() {
		return "User1 [user1id=" + user1id + ", user1pass=" + user1pass + ", user1name=" + user1name + "]";
	}
}
