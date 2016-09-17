package chapter.five.test;

import java.util.Scanner;

public class Test5_21_right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Loan Amount:");
		double amount = input.nextDouble();
		System.out.println("Number Of Years:");
		int year = input.nextInt();
		System.out.println("Interest Rate\tMonthly Payment\tTotal Payment\n");
		double month=0;
		double total=0;
		for (double i = 0.05; i <= 0.081; i = i + 0.00125) {
			double monthRate=i/12;
			month=amount*(monthRate*Math.pow(1+monthRate, year*12))/(Math.pow(1+monthRate, year*12)-1);
			total=month*year*12;
			System.out.printf("%.3f%%\t%.2f\t%.2f\n", i*100,month,total);
		}

	}
}
