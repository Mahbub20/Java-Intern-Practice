package javaoopobject;

public class ObjectInitializationbyreference {
	
	public static void main(String[]args) {
		
		Student st = new Student();//creating student object 'st' by reference variable
		st.id = 101;
		st.name = "John";
		System.out.println(st.id+" "+st.name);//printing id and name of the student with whitespace
	}
 
}

//output: 101 John
