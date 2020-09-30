package javamethodoverriding;

public class Main {
	
	public static void main(String[] args) {
		
		ESB e = new ESB();
		System.out.println(e.interest());//overrides the method of interest() from the Bank class
		ISSB i = new ISSB();
		System.out.println(i.interest());
		KSB k = new KSB();
		System.out.println(k.interest());
	}

}

//output: 8 7 9
