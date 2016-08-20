package chapter.four.test;

import java.util.Scanner;

public class Test4_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a character:");
		String x=input.nextLine();
		char y=x.charAt(0);
		System.out.println("The Unicode for the character "+x+" is "+(int)y);
		
	}

}
