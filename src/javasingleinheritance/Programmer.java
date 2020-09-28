package javasingleinheritance;

/*use of inheritance

For Method Overriding (so runtime polymorphism can be achieved).
For Code Reusability.*/

public class Programmer extends Employee {
	
	//Programmer class inherits the properties of Employee class

	int bonus = 1000;
	
	public static void main(String[]args) {
		
		Programmer pg = new Programmer();
		pg.name = "John Doe";
		pg.salary = 20000;
		int total_salary = pg.salary+pg.bonus;
		System.out.println("Name: "+pg.name+" salary: "+total_salary);
	}
}

//output: Name: John Doe salary: 21000
