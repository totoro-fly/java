package chapter.three.test;

import java.util.Scanner;

public class Test3_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds");
		double weight = input.nextDouble();
		System.out.println("Enter feet");
		double feet = input.nextDouble();
		System.out.println("Enter inches");
		double inches = input.nextDouble();
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		// double weightInKilograms =193;
		double heightInMeters = (feet*12+inches) * METERS_PER_INCH;//1 feet=12 inches
		// double heightInMeters =1.75;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25.0)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}

}
