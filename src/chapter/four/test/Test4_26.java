package chapter.four.test;

import java.util.Scanner;

public class Test4_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputStr=new Scanner(System.in);
		System.out.println("Enter an amount in double,for example 11.56");
		String strAmount=inputStr.nextLine();
		String s1=strAmount.substring(0, strAmount.indexOf('.'));
		String s2=strAmount.substring(strAmount.indexOf('.')+1);
		int remainingAmount=Integer.parseInt(s2);
		int numberOfOneDollars=Integer.parseInt(s1);
		remainingAmount=remainingAmount%100;
		int numberOfQuarters=remainingAmount/25;
		remainingAmount=remainingAmount%25;
		int numberOfDimes=remainingAmount/10;
		remainingAmount=remainingAmount%10;
		int numberOfNickels=remainingAmount/5;
		remainingAmount=remainingAmount%5;
		int numberOfPennies=remainingAmount;
		System.out.println("Your amount "+strAmount+" consists of");
		System.out.println("           "+numberOfOneDollars+" dollars");
		System.out.println("           "+numberOfQuarters+" quarters");
		System.out.println("           "+numberOfDimes+" dimes");
		System.out.println("           "+numberOfNickels+" nickels");
		System.out.println("           "+numberOfPennies+" pennies");
		
	}

}
