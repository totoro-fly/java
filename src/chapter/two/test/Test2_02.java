package chapter.two.test;

import java.util.Scanner;

public class Test2_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter radius and length of a cylinder");
		double r = input.nextDouble();
		double h = input.nextDouble();
		final double P = 3.1415926;
		double a = r * r * P;
		double v = a * h;
		System.out.println("The area is " + a);
		System.out.println("The volume is " + v);
	}

}
