package chapter.four;

import java.util.Scanner;

public class LotteryUsingStrings4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your lottery pick(two digits):");
		String str = input.nextLine();
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		String lottery = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10);
		System.out.println(lottery);
		char l1 = lottery.charAt(0);
		char l2 = lottery.charAt(1);
		if (str.equals(lottery)) {
			System.out.println("Exact match: you win $10000");
		} else if (l1 == ch2 && l2 == ch1) {
			System.out.println("Match all digits: you win $3000");
		} else if (ch1 == l1 || ch1 == l2 || ch2 == l1 || ch2 == l2) {
			System.out.println("Match one digit: you win $1000");
		}else
			System.out.println("Sorry,no match.");
	}

}
