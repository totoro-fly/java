package chapter.three.test;

import java.util.Scanner;

public class Test3_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter today's day ");
		int today = input.nextInt();
		System.out.println("Enter the number of days elapsed since today:");
		int number = input.nextInt();
		int futureDay = (today + number) % 7;
		switch (futureDay) {
		case 0:
			System.out.println("周日");
			break;
		case 1:
			System.out.println("周一");
			break;
		case 2:
			System.out.println("周二");
			break;
		case 3:
			System.out.println("周三");
			break;
		case 4:
			System.out.println("周四");
			break;
		case 5:
			System.out.println("周五");
			break;
		case 6:
			System.out.println("周六");
			break;
		default:
			System.out.println("error");
			break;
		}
	}

}
