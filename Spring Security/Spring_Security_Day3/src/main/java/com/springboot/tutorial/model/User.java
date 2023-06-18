package com.springboot.tutorial.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_tbl1")
public class User {
	
	@Id
	private int id;
	private String uname;
	private String upass;
	
	public User() {
		super();
	}
	
	public User(String uname, String upass) {
		super();
		this.uname = uname;
		this.upass = upass;
	}
	
	public User(int id, String uname, String upass) {
		super();
		this.id = id;
		this.uname = uname;
		this.upass = upass;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	
	
}
