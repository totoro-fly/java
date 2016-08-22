package chapter.four.test;

import java.util.Scanner;

public class Test4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter grade");
		String str = input.nextLine();
		if (str.length() != 1)
			System.out.println("Error");
		switch (str) {
		case "A":
			System.out.println("The number value for grade " + str + " is 4");
			break;
		case "B":
			System.out.println("The number value for grade " + str + " is 3");
			break;
		case "C":
			System.out.println("The number value for grade " + str + " is 2");
			break;
		case "D":
			System.out.println("The number value for grade " + str + " is 1");
			break;
		case "F":
			System.out.println("The number value for grade " + str + " is 0");
			break;
		default:
			System.out.println("Error");
			break;
		}
	}

}
