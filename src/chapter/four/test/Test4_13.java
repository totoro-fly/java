package chapter.four.test;

import java.util.Scanner;

public class Test4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a letter grade:");
		String str=input.nextLine();
		if(str.length()!=1){
			System.out.println("error");
			System.exit(1);
		}
			if(str.equalsIgnoreCase("a")||str.equalsIgnoreCase("e")||str.equalsIgnoreCase("i")||str.equalsIgnoreCase("o")||str.equalsIgnoreCase("u"))
			System.out.println(str+" is a vowel.");
		else
			System.out.println(str+" is an invalid input.");
	}

}
