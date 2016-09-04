package chapter.five;

import java.util.Scanner;

public class SentinelValue5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer end of if it is 0");
		int data = input.nextInt();
		int sum = 0;
		while (data != 0) {
			sum += data;
			System.out.println("Enter an integer end of if it is 0");
			data = input.nextInt();

		}
		System.out.println("The sun is " + sum);
	}

}
