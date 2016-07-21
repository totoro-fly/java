package chapter.two.test;

import java.util.Scanner;

public class Test2_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter weight in pounds:");
		double weight=input.nextDouble();
		System.out.println("Enter height in inches:");
		double height=input.nextDouble();
		double bmi=(weight*0.45359237)/Math.pow(height*0.0254,2);
		System.out.println("BMI is "+bmi);
	}

}
