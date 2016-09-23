package chapter.five.test;

import java.util.Scanner;

public class Test5_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = -1;
		int max = 0;
		int count = 0;
		do {
			System.out.println("Enter number");
			number = input.nextInt();
			if(number==max)
				count++;
			if (number > max) {
				max=number;
				count=0;
			}
		} while (number!=0);
		System.out.println(max+" "+(count+1));
	}

}
