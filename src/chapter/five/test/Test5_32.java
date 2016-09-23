package chapter.five.test;

import java.util.Scanner;

public class Test5_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lotteryOne = (int) (Math.random() * 9);
		int lottery1 = lotteryOne;
		int lottery2 = -1;
		for (;;) {
			int lotteryTwo = (int) (Math.random() * 9);
			lottery2 = lotteryTwo;
			System.out.println("\t\t"+lottery1+"\t"+lottery2);
			if (lottery1 != lottery2)
				break;
		}
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		System.out.println("The lottery number is " + lottery1 + lottery2);
		if (lottery1 == guessDigit1&&lottery2==guessDigit2)
			System.out.println("Exact match: you win $10000");
		else if (lottery1 == guessDigit2 && lottery2 == guessDigit1)
			System.out.println("Match all digits: you win $1000");
		else if (lottery1 == guessDigit1 || lottery1 == guessDigit2 || lottery2 == guessDigit1
				|| lottery2 == guessDigit1)
			System.out.println("Match one digit: you win $100");
		else
			System.out.println("Sorry,no match");
	}

}
