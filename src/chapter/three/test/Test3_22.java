package chapter.three.test;

import java.util.Scanner;

public class Test3_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double l = Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 0.5);
		if(l<=10)
			System.out.println("Point ("+x+" , "+y+") is in the circle.");
		else
			System.out.println("Point ("+x+" , "+y+") is not in the circle.");
	}

}
