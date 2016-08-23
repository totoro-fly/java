package chapter.four.test;

import java.util.Scanner;

public class Test4_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputStr = new Scanner(System.in);
		System.out.println("Enter two characters:");
		String str = inputStr.nextLine();
		char x = str.charAt(0);
		char y = str.charAt(1);
		switch (x) {
		case 'M':
			switch (y) {
			case '1':
				System.out.println("Math one");
				break;
			case '2':
				System.out.println("Math two");
				break;
			case '3':
				System.out.println("Math three");
				break;
			case '4':
				System.out.println("Math four");
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
			break;
		case 'C':
			switch (y) {
			case '1':
				System.out.println("computer one");
				break;
			case '2':
				System.out.println("computer two");
				break;
			case '3':
				System.out.println("computer three");
				break;
			case '4':
				System.out.println("computer four");
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
			break;
		case 'I':
			switch (y) {
			case '1':
				System.out.println("information one");
				break;
			case '2':
				System.out.println("information two");
				break;
			case '3':
				System.out.println("information three");
				break;
			case '4':
				System.out.println("information four");
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
	}

}
