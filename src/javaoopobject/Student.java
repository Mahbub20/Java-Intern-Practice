package javaoopobject;

public class Student {
	
	public int id;
	public String name;
	

	public void insertRecord(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public void displayRecord() {
		System.out.println("id: "+this.id+" name: "+this.name);
	}

}
