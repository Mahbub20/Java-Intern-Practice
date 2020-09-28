package javamultilevelinheritance;
//When there is a chain of inheritance, it is known as multilevel inheritance.
public class TestInheritance {

	public static void main(String[] args) {
		
		BabyDog d = new BabyDog();// this baby dog has all the attributes of animal,dog and its own attributs
		d.eat();
		d.bark();
		d.weep();

	}

}

/*output: eating...
		barking...
		weeping...*/
