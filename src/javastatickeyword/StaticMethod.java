package javastatickeyword;

/*A static method belongs to the class rather than the object of a class.
A static method can be invoked without the need for creating an instance of a class.
A static method can access static data member and can change the value of it.*/

public class StaticMethod {

	public static void main(String[] args) {
		 Student.changeCollege();//calling change method without creating instance 
		    //creating objects  
		    Student s1 = new Student(111,"Karan");  
		    Student s2 = new Student(222,"Aryan");  
		    Student s3 = new Student(333,"Sonoo");  
		    //calling display method  
		    s1.display();  
		    s2.display();  
		    s3.display();  

	}

}

/*output: 111 Karan BBDIT
        222 Aryan BBDIT
        333 Sonoo BBDIT*/
