package chapter.four.test;

import java.util.Scanner;

public class Test4_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length from the center to a vertex:");
		double s=2*input.nextDouble()*Math.sin(Math.PI/5);
		double area=(5*s*s)/(4*Math.tan(Math.PI/5));
		System.out.printf("The area of the pentagon is %5.2f.",area);
	}

}
