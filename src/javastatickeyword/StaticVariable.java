package javastatickeyword;

/*
 *The static variable can be used to refer to the common property of all objects (which is not unique for each object), 
 *for example, the company name of employees, college name of students, etc.
 *
 * The static variable gets memory only once in the class area at the time of class loading.*/

public class StaticVariable {

	public static void main(String[] args) {
		
		Student st = new Student(101, "jak");
		Student st1 = new Student(102, "tom");
		
		//we can change the college of all objects by the single line of code  
		 //Student.college="BBDIT";  
		 st.display();  
		 st1.display();  

	}

}

/*output: 101 jak ITS
         102 tom ITS*/
