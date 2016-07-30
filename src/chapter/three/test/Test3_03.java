package chapter.three.test;

import java.util.Scanner;

public class Test3_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ax+by=e");
		System.out.println("xc+dy=f");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a ,b,c,d,e,f");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		if (a * d - b * c == 0) {
			System.out.println("The equation has no solution");
			System.exit(1);
		}
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);
		System.out.println("x is " + x + " y is " + y);
	}

}
