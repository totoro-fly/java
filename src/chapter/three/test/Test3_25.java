package chapter.three.test;

import java.util.Scanner;

public class Test3_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("(y1-y2)x-(x1-x2)y=(y1-y2)x1-(x1-x2)y1");
		System.out.println("(y3-y4)x-(x3-x4)y=(y3-y4)x3-(x3-x4)y3");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1 y1 x2 y2 x3 y3 x4 y4:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		double a=y1-y2;
		double b=x1-x2;
		double e=(y1-y2)*x1-(x1-x2)*y1;
		double c=(y3-y4);
		double d=x3-x4;
		double f=(y3-y4)*x3-(x3-x4)*y3;
		if (a * d - b * c == 0) {
			System.out.println("The two lines are parallel.");
			System.exit(1);
		}
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);
		System.out.println("The intersecting point is at ("+x+","+y+")");
	}

}
