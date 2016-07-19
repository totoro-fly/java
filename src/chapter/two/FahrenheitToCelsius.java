package chapter.two;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a degree in Fahrenhei");
		double fahrenhei = input.nextDouble();
		double celsius = (5.0 / 9) * (fahrenhei - 32);
		System.out.println("Fahrenheit " + fahrenhei + " is " + celsius + " in celsius");
	}

}
