package chapter.three.test;

import java.util.Scanner;

public class Test3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a three integer");
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		int one=number/100;
		int three=number%10;
		if(one==three)
			System.out.println(number+" is a palindrome");
		else
			System.out.println(number+" is not a palindrome");
	}

}
