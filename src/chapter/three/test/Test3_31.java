package chapter.three.test;

import java.util.Scanner;

public class Test3_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubst
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the exchange rate form dollars to RMB:");
		double rate = input.nextDouble();
		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa:");
		int number = input.nextInt();
		System.out.println("Enter the dollar amount");
		double amount = input.nextDouble();
		double amountAfter = 0;
		switch (number) {
		case 0:
			amountAfter = amount * rate;
			System.out.println("$" + amount + " is " + amountAfter + " yuan");
			break;
		case 1:
			amountAfter = amount / rate;
			System.out.println(amount + " yuan is $" + amountAfter);
		}
	}

}
