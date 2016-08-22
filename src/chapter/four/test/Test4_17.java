package chapter.four.test;

import java.util.Scanner;

public class Test4_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		System.out.println("Enter a year:");
		String yearStr=input.nextLine();//循环判断吧？？？
		int year =Integer.parseInt(yearStr);
		System.out.println("Enter a month:");
		String str = inputStr.nextLine();
		if(!"JanMarMayJulAugOctDecAprJunSepNovFeb".contains(str)){//我TM真是个天才。
			System.out.println("Error month!");
			System.exit(1);
		}
		switch (str) {
		case "Jan":
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Oct":
		case "Dec":
			System.out.println(str + " " + year + " has 31 days.");
			break;
		case "Apr":
		case "Jun":
		case "Sep":
		case "Nov":
			System.out.println(str + " " + year + " has 30 days.");
			break;
		default:
			if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0))
				System.out.println(str + " " + year + " has 29 days.");
			else
				System.out.println(str + " " + year + " has 28 days.");

		}

	}

}
