package chapter.two.test;

import java.util.Scanner;

public class Test2_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the subtotal and a gratuity rate:");
		double subtotal=input.nextDouble();
		double gratuityRate=input.nextDouble();
		double total=subtotal*(1+gratuityRate/100);
		System.out.println("The gratuity is $ "+subtotal*(gratuityRate/100)+" and total is "+total);
	}

}
