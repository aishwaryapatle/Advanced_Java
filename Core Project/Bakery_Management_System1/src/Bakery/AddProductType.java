package Bakery;

public class AddProductType {

	String ptype, des1;
	public AddProductType(String ptype, String des1)
	{
		super();
		this.ptype=ptype;
		this.des1=des1;
	}
	
	public AddProductType()
	{
		
	}
	
	public void setPtype(String ptype)
	{
		this.ptype=ptype;
	}
	
	public void setDes1(String des1)
	{
		this.des1=des1;
	}
	
	public String getPtype()
	{
		return ptype;
	}
	
	public String getDes1()
	{
		return des1;
	}
}
