package chapter.two.test;

import java.util.Scanner;

public class Test2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the amount of water in kilograms:");
		double waterKilograms=input.nextDouble();
		System.out.println("Enter the initial temperature:");
		double temperature1=input.nextDouble();
		System.out.println("Enter the fial temperature:");
		double temperature2=input.nextDouble();
		double energy=waterKilograms*(temperature2-temperature1)*4184;
		System.out.println("The energy needed is "+energy);
	}

}
