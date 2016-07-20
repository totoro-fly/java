package chapter.two.test;

import java.util.Scanner;

public class Test2_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a degree in Celsius:");
		double celsius=input.nextDouble();
		double fathrenheit=9.0/5.0*celsius+32;
		System.out.println(celsius+" Celsius is "+fathrenheit+" Fathrenheit");
	}

}
