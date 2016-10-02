package chapter.six;

import java.util.Scanner;

public class GreatestCommonDivisorMethod6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first integer");
		int n1 = input.nextInt();
		System.out.println("Enter second integer");
		int n2 = input.nextInt();
		System.out.println("The greatest commmon divistor for "+n1+" and "+n2+" is "+gcd(n1,n2));
	}

	public static int gcd(int n1, int n2) {
		int num = 1;
		for (int i = 1; i <= Math.max(n1, n2); i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				num=i;
			}
		}
		return num;
	}

}
