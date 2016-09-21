package chapter.five.test;

import java.util.Scanner;

public class Test5_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = input.nextInt();
		System.out.println("请输入1月1日为周几(用1-7表示)");
		int number = input.nextInt();
		boolean isYear = false;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			isYear = true;
		int day = 0;
		for (int i = 1; i <= 12; i++) {
			if (i == 1) {
				number = number % 7;
			}
			if (i == 2)
				number = (number + 31) % 7;
			if (i == 3) {
				if (isYear)
					number = (number + 29) % 7;
				else
					number = (number + 28) % 7;
			}
			if (i == 4)
				number = (number + 31) % 7;
			if (i == 5)
				number = (number + 30) % 7;
			if (i == 6)
				number = (number + 31) % 7;
			if (i == 7)
				number = (number + 30) % 7;
			if (i == 8)
				number = (number + 31) % 7;
			if (i == 9)
				number = (number + 31) % 7;
			if (i == 10)
				number = (number + 30) % 7;
			if (i == 11)
				number = (number + 31) % 7;
			if (i == 12)
				number = (number + 30) % 7;
			System.out.println("\t\t" + year + "/" + i);
			System.out.println("_______________________________________");
			System.out.print("Sun   Mon   Tue   Wed   Thu   Fri   sat  \n");
			for (int j = 0; j < number; j++) {
				System.out.print("      ");
			}
			if (i == 2) {
				if (isYear)
					day = 29;
				else
					day = 28;
			} else if (i == 4 || i == 6 || i == 9 || i == 11)
				day = 30;
			else
				day = 31;
			for (int k = 1; k <= day; k++) {
				if (k < 10)
					System.out.print(" " + k + "    ");
				else
					System.out.print(" " + k + "   ");
				if ((k + number) % 7 == 0)
					System.out.println();
			}
			System.out.println();
		}
	}

}
