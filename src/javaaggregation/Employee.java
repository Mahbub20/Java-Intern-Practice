package javaaggregation;

public class Employee {
	
	public int id;
	public String name;
	public int salary;
	public Address address;// aggregation
	
	public Employee(int id, String name, int salary, Address address) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	
	public void display() {
		
		System.out.println("id: "+id+" Name: "+name+" Salary: "+salary);
		System.out.println("Address");
		System.out.println("State: "+address.state+" City: "+address.city+" Country: "+address.country);
	}

}
