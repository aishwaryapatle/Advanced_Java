package model;

import org.springframework.beans.factory.annotation.Autowired;


public class Employee {
	
	@Autowired
	private Address add;

	public Employee() {
		super();
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Employee(Address add) {
		super();
		this.add = add;
	}

	@Override
	public String toString() {
		return "Employee [add=" + add + "]";
	}
	
	
}
