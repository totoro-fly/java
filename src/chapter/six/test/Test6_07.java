package chapter.six.test;

import java.util.Scanner;

public class Test6_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter investment amount:");
		double amount=input.nextDouble();
		System.out.println("Enter annual interest rate in percentage:");
		double rate=input.nextDouble();
		System.out.print("Years        Future Value\n");
		for(int i=1;i<=30;i++){
			System.out.printf("%-2d\t\t",i);
			System.out.printf("%.2f",futureInvestmentValue(amount, rate, i));
			System.out.println();
		}
	}
	public static double futureInvestmentValue(double investmentAmount,double monthlyInterestRate,int years){
		double value=investmentAmount*Math.pow(1+monthlyInterestRate/1200.0, years*12);
		return (int)(value*100)/100.0;
	}

}
