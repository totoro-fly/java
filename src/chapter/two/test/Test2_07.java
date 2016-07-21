package chapter.two.test;

import java.util.Scanner;

public class Test2_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes");
		int minuites = input.nextInt();
		int days = minuites / 60 / 24 % 365;
		int years = minuites / 60 / 24 / 365;
		System.out.println(minuites + " minuites is approximately " + years + " years " + " and " + days + " days");
	}

}
