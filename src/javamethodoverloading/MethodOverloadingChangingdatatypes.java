package javamethodoverloading;

public class MethodOverloadingChangingdatatypes {
	
	public static void main(String[]args) {
		System.out.println(Adderdata.sum(2,2));//invokes two arguments sum method which are int types
		System.out.println(Adderdata.sum(12.5,2.5));//invokes two arguments sum method which are double types
	}

}

//output: 4 15.0
