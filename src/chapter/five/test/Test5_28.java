package chapter.five.test;

import java.util.Scanner;

public class Test5_28 {

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
		for (int i = 1; i <= 12; i++) {
			if (i == 1) {
				number=number%7;
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
			System.out.println(year + "/" + i + "/1 is " + number);
		}
	}

}
