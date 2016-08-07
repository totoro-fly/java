package chapter.three.test;

import java.util.Scanner;

public class Test3_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter circle1's center x-,y-coordinates,and radius:");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double r1=input.nextDouble();
		System.out.println("Enter circle2's center x-,y-coordinates,and radius:");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double r2=input.nextDouble();
		if(Math.sqrt(Math.pow(Math.abs(x1-x2), 2)+Math.pow(Math.abs(y1-y2), 2))<=Math.abs(r1-r2))
			System.out.println("circle2 is inside circle1");
		else if(Math.sqrt(Math.pow(Math.abs(x1-x2), 2)+Math.pow(Math.abs(y1-y2), 2))<=Math.abs(r1+r2))
			System.out.println("circle2 is overlaps circle1");
		else
			System.out.println("circle2 is not overlaps circle1");
			
	}

}
