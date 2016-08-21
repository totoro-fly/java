package chapter.four.test;

import java.util.Scanner;

public class Test4_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hex digit:");
		String str = input.nextLine();
		if (str.length() != 1) {
			System.out.println(str + " is an invalid input.");
			System.exit(1);
		}
		char ch = Character.toUpperCase(str.charAt(0));
		if (ch >= '0' && ch <= '9') {
			System.out.println((int) '0');
			System.out.println(Integer.toBinaryString(ch - '0'));

		} else if (ch >= 'A' && ch <= 'F') {
			System.out.println((int) 'A');
			System.out.println(Integer.toBinaryString(ch - 'A' + 9));
		} else
			System.out.println(ch + " is an invalid input");

	}

}
