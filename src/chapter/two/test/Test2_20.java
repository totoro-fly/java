package chapter.two.test;

import java.util.Scanner;

public class Test2_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter balance and interest rate(e.g., 3 for 3%");
		double balance=input.nextDouble();
		double rate=input.nextDouble();
		double interest=balance*(rate/1200.0);
		System.out.println("The interest is "+(int)(interest*100)/100.0);
	}

}
