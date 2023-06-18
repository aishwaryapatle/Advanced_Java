package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_tbl")
public class User {
	
	@Id @GeneratedValue
	private int id;
	private String name;
	private String email;
	private String pass;
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public User(String name, String email, String pass) {
		super();
		this.name = name;
		this.email = email;
		this.pass = pass;
	}

	public User(int id, String name, String email, String pass) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pass = pass;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}