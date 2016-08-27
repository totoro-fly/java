package chapter.four.test;

import java.util.Scanner;

public class Test4_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 0;
		Scanner inputStr = new Scanner(System.in);
		System.out.println("Enter a SSN:");
		String str = inputStr.nextLine();
		if (str.length() != 11) {
			System.out.println(str + " is an invalid social security number 1");
			System.exit(1);
		}
		if (str.charAt(3) == '-' && str.charAt(6) == '-') {
			for (int i = 0; i < 11; i++) {
				if (i == 3 || i == 6)
					continue;
				if (Character.isDigit(str.charAt(i)))
					j++;
			}
			if (j == 9)
				System.out.println(str + " is a nvalid social security number");
			else
				System.out.println(str + " is an invalid social security number 3");
		} else
			System.out.println(str + " is an invalid social security number 2");
	}

}
