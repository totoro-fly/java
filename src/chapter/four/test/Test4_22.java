package chapter.four.test;

import java.util.Scanner;

public class Test4_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputStr=new Scanner(System.in);
		System.out.println("Enter String s1:");
		String s1=inputStr.nextLine();
		System.out.println("Enter String s2:");
		String s2=inputStr.nextLine();
		if(s1.contains(s2))
			System.out.println(s2+" is a substring of "+s1);
		else
			System.out.println(s2+" is not a substring of "+s1);
		
	}

}
