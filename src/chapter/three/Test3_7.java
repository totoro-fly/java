package chapter.three;

import java.util.Scanner;

public class Test3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		int number = input.nextInt();
		if (number % 2 == 0)
			System.out.println(number + " is even");
		else
			System.out.println(number + " is odd");
		// if(number%2==0)
		// System.out.println(number+" is even");
		// System.out.println(number+" is odd");
		//
	}

}
