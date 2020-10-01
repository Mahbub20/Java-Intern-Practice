package javasuperkeyword;

public class Dog extends Animal{
	
	String color = "Black";
	
	public Dog() {
		System.out.println(super.color);//this will print the parent class property color;
		System.out.println(color);//this will print child class color property
		
	}
	
	public void eat() {
		System.out.println("dog is eating...");
	}
	
	public void bark() {
		System.out.println("dog is barking...");
	}
	
	public void work() {
		
	   super.eat();//this will invoke parent class eat method
	   eat();
	   bark();
	}

}
