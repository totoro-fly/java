package chapter.five.test;

import java.util.Scanner;

public class Test5_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer,the input ends of it is 0:");
		int i=0;
		double sum = 0;
		int count = 0;
		double average = 0;
		int positives = 0;
		int negatives = 0;
		do {
			i = input.nextInt();
			sum += i;
			count++;
			average = sum / count;
			if (i > 0)
				positives++;
			else
				negatives=count-positives-1;
		} while (i!= 0);
		if (count == 0)
			System.out.println("No numbers are entered except 0");
		else {
			System.out.println("The number of positives is " + positives);
			System.out.println("The number of negatives is " + negatives);
			System.out.println("The total is " + sum);
			System.out.println("The average is " + average);
		}

	}

}
