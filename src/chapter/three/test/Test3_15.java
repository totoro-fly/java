package chapter.three.test;

import java.util.Scanner;

public class Test3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100 + (int) (Math.random() * 900);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three-digit number");
		int number = input.nextInt();
		System.out.println(x + "  " + number);
		int x1 = x % 10;
		int x2 = (int) (x / 10) % 10;
		int x3 = x / 100;
		int number1 = number % 10;
		int number2 = (int) (number / 10) % 10;
		int number3 = number / 100;
		if (x == number)
			System.out.println("win $10000");
		else if ((x1 == number1 || x1 == number2 || x1 == number3) && (x2 == number1 || x2 == number2 || x2 == number3)
				&& (x3 == number1 || x3 == number2 || x3 == number3))
			System.out.println("win $3000");
		else if (x1 == number1 || x1 == number2 || x1 == number3 || x2 == number1 || x2 == number2 || x2 == number3
				|| x3 == number1 || x3 == number2 || x3 == number3)
			System.out.println("win $1000");
		else
			System.out.println("sorry");
	}
}
