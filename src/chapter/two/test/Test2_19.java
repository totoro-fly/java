package chapter.two.test;

import java.util.Scanner;

public class Test2_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three points for triangle:");
		double x1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y1 = input.nextDouble();
		double y2 = input.nextDouble();
		double z1 = input.nextDouble();
		double z2 = input.nextDouble();
		double side1 = Math.pow((y1 - x1) * (y1 - x1) + (y2 - x2) * (y2 - x2), 1.0 / 2.0);
		double side2 = Math.pow((z1 - x1) * (z1 - x1) + (z2 - x2) * (z2 - x2), 1.0 / 2.0);
		double side3 = Math.pow((z1 - y1) * (z1 - y1) + (z2 - y2) * (z2 - y2), 1.0 / 2.0);
		double s = (side1 + side2 + side3) / 2.0;
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 1.0 / 2.0);
		System.out.println("The area of the triangle is " + area);
	}

}
