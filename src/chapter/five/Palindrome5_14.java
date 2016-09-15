package chapter.five;

import java.util.Scanner;

public class Palindrome5_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println(("Enter a string"));
		String str = input.nextLine();
		int low = 0;
		int high = str.length() - 1;
		boolean isPal = true;
		while (low < high) {
			if (str.charAt(low) != str.charAt(high)) {
				isPal = false;
				break;
			}
			low++;
			high--;
		}
		if (isPal)
			System.out.println(str+" is a palindrome");
		else
			System.out.println(str+"is not a palindrome");

	}

}
