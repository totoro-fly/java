package chapter.three;

import java.util.Scanner;

public class LeapYear3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=input.nextInt();
		//布尔表达式判断
		boolean isLeapYear=(year%4==0&&year%100!=0)||(year%400==0);
		System.out.println(year+" is a leap year? "+isLeapYear);
	}

}
