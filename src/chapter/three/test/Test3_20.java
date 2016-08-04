package chapter.three.test;

import java.util.Scanner;

public abstract class Test3_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit between -15.F and 41.F :");
		double temperature = input.nextDouble();
		System.out.println("Enter the wind speed(>=2) in miles per hour:");
		double speed = input.nextDouble();
		if ((temperature > -58 && temperature < 41) && speed >= 2) {
			double chillIndex = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16)
					+ 0.4275 * temperature * Math.pow(speed, 0.16);
			System.out.println("The wind chill index is " + chillIndex);
		} else
			System.out.println("error");

	}
}
