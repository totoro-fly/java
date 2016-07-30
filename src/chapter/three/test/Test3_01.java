package chapter.three.test;

import java.util.Scanner;

public class Test3_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("b^2-4ac" + "\n" + "r1=(-b+(b^2-4ac)^1/2)/2a r2=(-b-(b^2-4ac)^1/2)/2a");
		System.out.println("Enter a,b,c");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double number = Math.pow(b, 2) - 4 * a * c;
		double r1, r2;
		if (number > 0) {
			r1 = (-b + Math.pow(number, 0.5)) / 2 * a;
			r2 = (-b - Math.pow(number, 0.5)) / 2 * a;
			System.out.println("两个实数根" + r1 + " " + r2);
		} else if (number == 0) {
			r1 = (-b + Math.pow(number, 0.5)) / 2 * a;
			System.out.println("一个实数根  "+r1);
		} else if (number < 0)
			System.out.println("无实数根");
	}

}
