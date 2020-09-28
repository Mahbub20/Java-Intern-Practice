package javaaggregation;

public class TestAggregation {

	public static void main(String[] args) {
		
		Address address = new Address("New York", "New York", "USA");
		Address address1 = new Address("California", "Los Angeles", "USA");
		
		Employee emp1 = new Employee(101, "John", 50000, address);
		Employee emp2 = new Employee(102, "Wick", 60000, address1);
		
		emp1.display();
		emp2.display();

	}

}
