package chapter.five;

import java.util.Scanner;

public class Test5_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = input.nextInt();
		int max = number;
		while (number != 0) {
			number = input.nextInt();
			if (max < number) {
				max = number;
			}
		}
		System.out.println("max is " + max);
		System.out.println("number is " + number);
	}
}
