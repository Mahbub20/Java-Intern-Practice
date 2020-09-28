package javaoopobject;

public class ObjectInitializationbymethod {
	
	public static void main(String[]args) {
		
		Student st = new Student();//creating student object 'st' by reference variable
		st.insertRecord(101, "John");//inserting data by method
		st.displayRecord();//printing id and name of the student with whitespace
	}

}

//output: id: 101 name: John
