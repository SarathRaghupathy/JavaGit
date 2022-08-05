package org.inter;

public class ChildClass implements FullyAbstraction {

	@Override
	public void empName() {
		System.out.println("sarath");	
	}

	@Override
	public void empAdd() {
		System.out.println("Chennai");
	}

	@Override
	public void empSalary() {
System.out.println("14l");		
	}

	@Override
	public void empLoc() {
		System.out.println("India");	
	}

	private void emdId() {
		System.out.println("check git hub");

	
}

	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.empAdd();
		c.empLoc();
		c.empName();
		c.empSalary();
		
	}
}
