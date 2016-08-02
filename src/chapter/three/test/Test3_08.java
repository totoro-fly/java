package chapter.three.test;

import java.util.Scanner;

public class Test3_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		if (number1 > number2)
			;
		else {
			int t = 0;
			t = number1;
			number1 = number2;
			number2 = t;
		}
		if (number1 > number3)
			;
		else {
			int t = 0;
			t = number1;
			number1 = number3;
			number3 = t;
		}
		if (number2 > number3)
			;
		else {
			int t = 0;
			t = number2;
			number2 = number3;
			number3 = t;
		}
		System.out.println(number1 + "\t" + number2 + "\t" + number3);
		System.out.println(number1 + "\t" + number3 + "\t" + number2);
		System.out.println(number2 + "\t" + number1 + "\t" + number3);
		System.out.println(number2 + "\t" + number3 + "\t" + number1);
		System.out.println(number3 + "\t" + number2 + "\t" + number1);
		System.out.println(number3 + "\t" + number1 + "\t" + number2);

	}

}
