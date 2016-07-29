package chapter.three;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottery=(int)(Math.random()*100);
		int lottery1=lottery/10;
		int lottery2=lottery%10;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your lottery pick (two digits): ");
		int guess=input.nextInt();
		int guessDigit1=guess/10;
		int guessDigit2=guess%10;
		System.out.println("The lottery number is "+lottery1+lottery2);
		if(lottery==guess)
			System.out.println("Exact match: you win $10000");
		else if(lottery1==guessDigit2&&lottery2==guessDigit1)
			System.out.println("Match all digits: you win $1000");
		else if(lottery1==guessDigit1||lottery1==guessDigit2||lottery2==guessDigit1||lottery2==guessDigit1)
			System.out.println("Match one digit: you win $100");
		else 
			System.out.println("Sorry,no match");
	}

}
