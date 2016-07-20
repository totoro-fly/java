package chapter.two;

import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter purchase amount");
		double purchase=input.nextDouble();
		double tax=purchase*0.06;
		System.out.println("Sales tax is "+(int)(tax*100)/100.0);
		System.out.println("Sales tax is "+(int)tax*100/100.0);
		System.out.println("Sales tax is "+(int)(tax*100)/100);
	}

}
