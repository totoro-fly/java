package chapter.four.test;

import java.util.Scanner;

public class Test4_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter point 1 (latitude and longitude) in degress");
		double x1=Math.toRadians(input.nextDouble());
		double y1=Math.toRadians(input.nextDouble());
		System.out.println("Enter point 2 (latitude and longitude) 2in degress");
		double x2=Math.toRadians(input.nextDouble());
		double y2=Math.toRadians(input.nextDouble());
		double r=6371.01;
		double d=r*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
		System.out.println("The distance between the two points is "+d);
	}

}
