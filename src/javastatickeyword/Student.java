package javastatickeyword;

public class Student {
	
	int rollno;//instance variable  
	String name;  
	static String college ="ITS";//static variable  
	//constructor  
	Student(int r, String n){  
    rollno = r;  
	name = n;  
	 } 
	
	//static method to change the value of static variable  
	
	public static void changeCollege() {
		
		college = "BBDIT";
	}
	
	//method to display the values  
	void display (){
		System.out.println(rollno+" "+name+" "+college);
	
	}  

}
