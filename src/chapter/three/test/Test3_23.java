package chapter.three.test;

import java.util.Scanner;

public class Test3_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a point with two coordinates ");
		double x=input.nextDouble();
		double y=input.nextDouble();
		if(x<=10/2.0||y<=5/2.0)
			System.out.println("Point ("+x+", "+y+")"+" is in the rectangle.");
		else
			System.out.println("Point ("+x+", "+y+")"+" is not in the rectangle.");
				
			
	}

}
