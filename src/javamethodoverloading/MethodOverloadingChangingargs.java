package javamethodoverloading;

public class MethodOverloadingChangingargs {
	
	public static void main(String[]args) {
		System.out.println(Adder.sum(2, 2));//invokes two arguments sum method
		System.out.println(Adder.sum(2, 2, 2));//invokes three arguments sum method
	}

}

//output: 4 6
