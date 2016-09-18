package chapter.five.test;

import java.util.Scanner;

public class Test5_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Loan Amount:");
		double amount = input.nextDouble();
		System.out.println("Number of Years:");
		double years = input.nextDouble();
		System.out.println("Annual Interest Rate:");
		double rate = input.nextDouble();
		double monthRate = rate * 0.01 / 12;
		double monthPay = (amount * monthRate) / (1 - 1 / Math.pow(1 + monthRate, years * 12));
		double totalPay = monthPay * years * 12;
		System.out.printf("Monthly Payment: %.2f\n", monthPay);
		System.out.printf("Total Payment: %.2f\n", totalPay);
		System.out.println("Payment\t\tInterest\t\tPrincipal\t\tBalance");
		double interest = 0;
		double principal = 0;
		for (int i = 1; i <= years * 12; i++) {
			if (i == years*12) {
				interest = monthRate * amount;
				principal = monthPay - interest;
				amount = amount - principal;
				principal=principal+amount;
				amount=0;
			} else {
				interest = monthRate * amount;
				principal = monthPay - interest;
				amount = amount - principal;

			}
			System.out.printf(i + "\t\t%.2f\t\t\t%.2f\t\t\t%.2f\n", interest, principal, amount);

		}

	}

}
