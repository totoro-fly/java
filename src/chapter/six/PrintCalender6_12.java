package chapter.six;

import java.util.Scanner;

public class PrintCalender6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter full year (e.g.,2012)");
		int year = input.nextInt();
		System.out.println("Enter as a number between 1 and 12:");
		int month = input.nextInt();
		printMonth(year, month);
	}

	public static void printMonth(int year, int month) {
		printMonthTitle(year, month);
		printMonthBody(year, month);
	}

	public static void printMonthTitle(int year, int month) {
		System.out.print("\t\t" + getMonthName(month) + " " + year + "\n");
		System.out.print("---------------------------------------\n");
		System.out.print("Sun   Mon   Tue   Wed   Thu   Fri   Sat\n");
	}

	public static String getMonthName(int month) {
		switch (month) {
		case 1:
			return "Jan";
		case 2:
			return "Feb";
		case 3:
			return "Mar";
		case 4:
			return "Apr";
		case 5:
			return "May";
		case 6:
			return "Jun";
		case 7:
			return "Jul";
		case 8:
			return "Aug";
		case 9:
			return "Sep";
		case 10:
			return "Oct";
		case 11:
			return "Nov";
		case 12:
			return "Dec";
		default:
			return "Error";
		}
	}

	public static void printMonthBody(int year, int month) {
		int startDay = getStarDay(year, month);
		int numberOfDayMonth = getNumberOfDayMonth(year, month);
		for (int j = 0; j < startDay; j++) {
			System.out.print("      ");
		}
		for (int i = 1; i <= numberOfDayMonth; i++) {
			System.out.printf("%-6d",i);
			if ((i + startDay) % 7 == 0)
				System.out.println();
		}
	}

	public static int getStarDay(int year, int month) {
		final int START_DAY_FOR_JAN_1_1800 = 3;
		return (getTotalNumberOfDays(year, month) + START_DAY_FOR_JAN_1_1800) % 7;
	}

	public static int getTotalNumberOfDays(int year, int month) {
		int sum = 0;
		for (int i = 1800; i < year; i++) {
			if (isLeapYear(i))
				sum += 366;
			else
				sum += 365;
		}
		for (int i = 1; i < month; i++) {
			sum += getNumberOfDayMonth(year, i);
		}
		return sum;
	}

	public static int getNumberOfDayMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
		else if (month == 2) {
			if (isLeapYear(year))
				return 29;
			else
				return 28;
		} else
			return 30;
	}

	public static boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? true : false;
	}
}
