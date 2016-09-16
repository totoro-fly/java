package chapter.five.test;

import java.util.Scanner;

public class Test5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("£Ånter the number of lines:?");
		int number = input.nextInt();
		for (int i = 1; i <= number; i++) {
			for (int j = number; j >= i; j--) {
				System.out.print("  ");
			}
			// for (int j = 1; j <= i; j++) {
			// System.out.print(" ");
			// System.out.print(j);
			// }
			for (int j = i; j >= 1; j--) {
				System.out.print(" ");
				System.out.print(j);
			}
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
				System.out.print(j);
			}
			System.out.println();
		}

	}
}