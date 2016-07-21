package chapter.two.test;

import java.util.Scanner;

public class Test2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the monthly saving amount and months:");
		double savingAmount=input.nextDouble();
		int months=input.nextInt();
		double amount=0;
		for(int i=0;i<months;i++){
			amount=(savingAmount+amount)*(1+0.00417);
		}
		System.out.println("After the "+months+" months"+"the account value is $"+(int)(amount*100)/100.0);
	}

}
