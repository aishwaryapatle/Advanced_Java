package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher_tbl")
public class Teacher {
	
	@Id
	@GeneratedValue
	private int tid;
	
	@Column
	private String tname;
	@Column
	private String email;
	@Column
	private String pass;
	@Column
	private String mobile;

	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Teacher(String tname, String email, String pass, String mobile) {
		super();
		this.tname = tname;
		this.email = email;
		this.pass = pass;
		this.mobile = mobile;
	}
	
	public Teacher(int tid, String tname, String email, String pass, String mobile) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.email = email;
		this.pass = pass;
		this.mobile = mobile;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	

}
