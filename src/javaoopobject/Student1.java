package javaoopobject;

public class Student1 {
	
	public int id;
	public String name;
	
	//Constructor
	public Student1(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void insertRecord(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public void displayRecord() {
		System.out.println("id: "+this.id+" name: "+this.name);
	}

}
