package chapter.three.test;

import java.util.Scanner;

public class Test3_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 or 0 to guess");
		int number = input.nextInt();
		if (number == 0 || number == 1) {
			int x = (int) (Math.random() * 10) > 4 ? 1 : 0;
			System.out.println(x);
			System.out.println(x == number ? true : false);
		} else
			System.out.println("error");
	}

}
