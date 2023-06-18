package model;

public class Employee {

	private int id;
	private String fname;
	private String lname;
	private String gender;
	private String email;
	private String mobile;
	private String dob;
	private String city;
	private String skill;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String fname, String lname, String gender, String email, String mobile, String dob,
			String city) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.email = email;
		this.mobile = mobile;
		this.dob = dob;
		this.city = city;
	}
	
	public Employee(int id, String fname, String lname, String gender, String email, String mobile, String dob,
			String city) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.email = email;
		this.mobile = mobile;
		this.dob = dob;
		this.city = city;
	}
	
	public Employee(int id, String fname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		
	}
	
	public Employee(int id, String fname, String lname, String gender, String email, String mobile, String dob,
			String city, String skill) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.email = email;
		this.mobile = mobile;
		this.dob = dob;
		this.city = city;
		this.skill = skill;
	}
	
	public Employee(String fname, String lname, String gender, String email, String mobile, String dob,
			String city, String skill) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.email = email;
		this.mobile = mobile;
		this.dob = dob;
		this.city = city;
		this.skill = skill;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", email="
				+ email + ", mobile=" + mobile + ", dob=" + dob + ", city=" + city + "]";
	}
	
	
	

}
