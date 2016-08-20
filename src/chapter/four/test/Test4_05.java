package chapter.four.test;

import java.util.Scanner;

public class Test4_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of side:");
		int number=input.nextInt();
		System.out.println("Enter the side:");
		double s=input.nextDouble();
		double area=(number*s*s)/(4*Math.tan(Math.PI/(double)number));
		System.out.println("The area of the hexagon is "+area);
		
	}

}
