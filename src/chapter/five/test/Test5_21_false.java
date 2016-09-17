package chapter.five.test;

import java.util.Scanner;

public class Test5_21_false {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Loan Amount:");
		double amount = input.nextDouble();
		System.out.println("Number Of Years:");
		int year = input.nextInt();
		System.out.println("Interest Rate\tMonthly Payment\tTotal Payment\n");
		double[] a = new double[25];
		double[] b = new double[25];
		double j = 0.05;
		for (int k = 0; k < 25; k++) {
			int yearIn=year;
			double amountIn=amount;
			while (yearIn > 0) {
				amountIn *= (1 + j);
				yearIn--;
			}
			b[k]=amountIn;
			a[k]=amountIn / (year * 12);
			j=j+0.00125;
		}
		for (double i = 5,l=0; i <= 8; i = i + 0.125,l++) {
			int m=(int)l;
			System.out.printf("%.3f\t        %.2f\t        %.2f\t\n", i,a[m],b[m]);
		}

	}

}
