package javahirarchicalinheritance;

public class Testhirarchicalinheritance {

	public static void main(String[] args) {
		
		Cat c = new Cat();
		c.eat();
		c.meow();
		
		Dog d = new Dog();
		d.eat();
		d.bark();

	}

}

/*output : eating...
		 meowing....
		 eating...
		 barking...*/
