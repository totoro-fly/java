package chapter.three.test;

import java.util.Scanner;

public class Test3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter yeaer:(e.g., 2012):");
		int year = input.nextInt();
		System.out.println("Enter month:1-12");
		int month = input.nextInt();
		System.out.println("Enter the day fo the month:1-31");
		int day = input.nextInt();
		String week=null;
		if (month == 1) {
			month = 13;
			year--;
		} else if (month == 2) {
			month = 14;
			year--;
		}
		int h = (day + (26 * (month + 1) / 10) + year % 100 + year % 100 / 4 + Math.abs(year / 100) / 4
				+ 5 * Math.abs(year / 100)) % 7;
		switch(h){
		case 0:
			week="����";
			break;
		case 1:
			week="����";
			break;
		case 2:
			week="��һ";
			break;
		case 3:
			week="�ܶ�";
			break;
		case 4:
			week="����";
			break;
		case 5:
			week="����";
			break;
		case 6:
			week="����";
			break;
			
		}
		System.out.println(week);
		//000

	}

}
