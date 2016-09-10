package chapter.five;

import java.util.Scanner;

public class GreatestCommonDivisor5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first integer");
		int n1 = input.nextInt();
		System.out.println("Enter second integer");
		int n2 = input.nextInt();
		int gcd=1;
		for (int k = 2; k <= n1 && k <= n2; k++) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd=k;
		}
		System.out.println("The greattest common divisor for " + n1 + " and " + n2 + " is " + gcd);
	}

}
