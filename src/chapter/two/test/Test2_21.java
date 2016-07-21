package chapter.two.test;

import java.util.Scanner;

public class Test2_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter investment amount:");
		double amount=input.nextDouble();
		System.out.println("Enter annual interest rate in percentage:");
		double rate=input.nextDouble();
		System.out.println("Enter number of years:");
		double year=input.nextDouble();
		double value=amount*Math.pow(1+rate/1200.0, year*12);
		System.out.println("Accumulated value is %"+(int)(value*100)/100.0);
	}

}
