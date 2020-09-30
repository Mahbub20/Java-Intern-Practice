package javamethodoverloading;

public class MainMethodOverloading {

	//we can also overload main method of java but which method has the String[] array args that will be called
	public static void main(String[] args) {
		
		System.out.println("from String array args main method");
		
	}
	
    public static void main(String args) {
		
		System.out.println("from String args main method");
		
	}
    
    public static void main() {
		
		System.out.println("from null args main method");
		
	}

}

//output: from String array args main method
