package model;

public class Address {

	private int plot;
	private String city;
	
	public Address(int plot, String city) {
		super();
		this.plot = plot;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [plot=" + plot + ", city=" + city + "]";
	}
	
	
}
