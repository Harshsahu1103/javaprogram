package com.OopsProgram;

 class Employee{
	int sallary;
	String name;
	
	
	public void setSallary(int salary) {
		sallary=salary;
	}
	public void setName(String n) {
		name = n;
	}
	
	public int getSallary() {
		return sallary;
	}
	public String getName() {
		return name;
	}
}
public class OopsClass {
public static void main(String[] args) {
	Employee employee =new Employee();
//	employee.name="ram";
//	System.out.println(employee.name="jam");
//	System.out.println(employee.sallary=65332);
	employee.setName("Sagar");
	employee.setSallary(565632);
	System.out.println("Employee name is = "+employee.getName());
	System.out.println("Employee Sallary is = "+employee.getSallary()+" per Anum");
}
}
