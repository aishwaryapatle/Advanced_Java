package model;

public class User {

	private int id;
	private String fname;
	private String lname;
	private String email;
	private String phonenumber;
	private String password;
	private String cpassword;
	private String bloodgroup;
	private String pincode;
	private int roleid;
	private String created_datetime;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public User(String fname, String lname, String email, String phonenumber, String password, String cpassword,
			String bloodgroup, String pincode, int roleid) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phonenumber = phonenumber;
		this.password = password;
		this.cpassword = cpassword;
		this.bloodgroup = bloodgroup;
		this.pincode = pincode;
		this.roleid = roleid;
	}

	public User(int id, String fname, String lname, String email, String phonenumber, String password, String cpassword,
			String bloodgroup, String pincode, int roleid) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phonenumber = phonenumber;
		this.password = password;
		this.cpassword = cpassword;
		this.bloodgroup = bloodgroup;
		this.pincode = pincode;
		this.roleid = roleid;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getCreated_datetime() {
		return created_datetime;
	}

	public void setCreated_datetime(String created_datetime) {
		this.created_datetime = created_datetime;
	}
	
	
}
