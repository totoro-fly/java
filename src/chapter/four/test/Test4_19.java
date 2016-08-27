package chapter.four.test;

import java.util.Scanner;

public class Test4_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberSum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the frist 9 digits of an ISBN as integer ");
		String str = input.nextLine();
		for (int i = 0; i < str.length(); i++) {
			int number = str.charAt(i);
			numberSum += number * i;
		}
		int isbn_10 = numberSum % 11;
		if (isbn_10 != 10)
			System.out.println("The ISBN-10 number is " + isbn_10);
		else
			System.out.println("The ISBN-10 number is x");
	}

}
