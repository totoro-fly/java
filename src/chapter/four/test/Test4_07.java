package chapter.four.test;

import java.util.Scanner;

public class Test4_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a1 = Math.toRadians(18);
		double a2 = Math.toRadians(18 + 72);
		double a3 = Math.toRadians(18 + 72 + 72);
		double a4 = Math.toRadians(18 + 72 + 72 + 72);
		double a5 = Math.toRadians(18 + 72 + 72 + 72 + 72);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the bouding circle:");
		double r = input.nextDouble();
		double x1 = r * Math.cos(a1);
		double y1 = r * Math.sin(a1);
		double x2 = r * Math.cos(a2);
		double y2 = r * Math.sin(a2);
		double x3 = r * Math.cos(a3);
		double y3 = r * Math.sin(a3);
		double x4 = r * Math.cos(a4);
		double y4 = r * Math.sin(a4);
		double x5 = r * Math.cos(a5);
		double y5 = r * Math.sin(a5);
		System.out.println("The coordinates of five points on the pentagon are:");
		System.out.println("("+x1+","+y1+")");
		System.out.println("("+x2+","+y2+")");
		System.out.println("("+x3+","+y3+")");
		System.out.println("("+x4+","+y4+")");
		System.out.println("("+x5+","+y5+")");
	}

}
