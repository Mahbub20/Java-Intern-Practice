package javaIfElse;

import java.util.Scanner;

public class IfElseTernary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String output = (n%2==0)?"Even":"Odd";
		System.out.println(output);
		sc.close();
	}

}
