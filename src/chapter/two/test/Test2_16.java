package chapter.two.test;

import java.util.Scanner;

public class Test2_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the side");
		double side=input.nextDouble();
		double area=(3.0*Math.pow(3, 1.0/2.0)/2.0)*side*side;
		System.out.println("The area of the  is "+area);
	}

}
