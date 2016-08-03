package chapter.three.test;

import java.util.Scanner;

public class Test3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year");
		int year = input.nextInt();
		System.out.println("Enter month");
		int month = input.nextInt();
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			System.out.println(year+"/"+month+" has 31 days");
		else if(month==4|month==6||month==9||month==11)
			System.out.println(year+"/"+month+" has 30 days");
		else if((year%4==0&&year%100!=0)||(year%400==0))
			System.out.println(year+"/"+month+" has 29 days");
		else
			System.out.println(year+"/"+month+" has 28 days");
	}

}