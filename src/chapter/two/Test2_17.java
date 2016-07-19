package chapter.two;

import java.util.Scanner;

public class Test2_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two integer m and r");
		System.out.println("mr^2");
		int m = input.nextInt();
		int r = input.nextInt();
		double mr2 = m * Math.pow(r, 2);
		System.out.println(mr2);
	}

}
