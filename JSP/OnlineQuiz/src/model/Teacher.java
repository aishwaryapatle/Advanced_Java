package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher_tbl")
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tid;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String phone;
	@Column
	private String password;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	
	public Teacher(int tid, String name, String email, String phone, String password) {
		super();
		this.tid = tid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	public Teacher(String name, String email, String phone, String password) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
	
	public Teacher(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
