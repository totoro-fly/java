package chapter.two.test;

import java.util.Scanner;

public class Test2_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the driving distance:");
		double distance=input.nextDouble();
		System.out.println("Enter miles per gallon:");
		double gallon=input.nextDouble();
		System.out.println("Enter price per gallon:");
		double price=input.nextDouble();
		double totalCost=distance/gallon*price;
		System.out.println("The cost drining is &"+(int)(totalCost*100)/100.0);
	}

}
