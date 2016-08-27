package chapter.four.test;

import java.util.Scanner;

public class Test4_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputStr=new Scanner(System.in);
		Scanner input=new Scanner(System.in);
		System.out.println("Enter enployee's name:");
		String name=inputStr.nextLine();
		System.out.println("Enter numer of hours worked in a week:");
		double hours=input.nextDouble();
		System.out.println("Enter hourly pay rate:");
		double hourlyPayRate=input.nextDouble();
		System.out.println("Enter federal tax withholding rate:");
		double fedral=input.nextDouble();
		System.out.println("Enter state tax withholding rate:");
		double state=input.nextDouble();
		System.out.println("Employee Name: "+name);
		System.out.println("Hours Worked "+hours);
		System.out.println("Pay Rate : $"+hourlyPayRate);
		System.out.println("Gorss Pay: $"+hours*hourlyPayRate);
		System.out.println("Deducctions");
		System.out.printf("\tFederal Withholding(%2.1f%%): $"+hours*hourlyPayRate*fedral+"\n",fedral*100);
		System.out.printf("\tFederal Withholding(%1.1f%%): $"+hours*hourlyPayRate*state+"\n",state*100);
		System.out.printf("\tTotal Deduction: $%2.2f\n",(hours*hourlyPayRate*fedral+hours*hourlyPayRate*state));
		System.out.println("Net Pay : $"+(hours*hourlyPayRate-hours*hourlyPayRate*fedral-hours*hourlyPayRate*state));
	}

}
