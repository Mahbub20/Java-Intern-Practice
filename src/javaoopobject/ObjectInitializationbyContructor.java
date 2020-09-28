package javaoopobject;

public class ObjectInitializationbyContructor {
	
	public static void main(String[]args) {
		
		Student1 st = new Student1(101,"John");//initializing student object 'st' by constructor
		st.displayRecord();//printing id and name of the student with whitespace
	}

}

//output: id: 101 name: John
