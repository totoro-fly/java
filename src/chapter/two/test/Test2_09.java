package chapter.two.test;

import java.util.Scanner;

public class Test2_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter v0 v1 and t:");
		double v0=input.nextDouble();
		double v1=input.nextDouble();
		double t=input.nextDouble();
		double a=(v1-v0)/t;
		System.out.println("The average acceleration is "+a);
		
	}

}
