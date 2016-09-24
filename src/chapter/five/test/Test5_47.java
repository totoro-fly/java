package chapter.five.test;

import java.util.Scanner;

public class Test5_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the frist 12 digits of an ISBN-13 as a string :");
		String str=input.nextLine();
		int sum=0;
		int number=-1;
		if(str.length()!=12)
			System.out.println(str+" is an invalid input.");
		else{
			for(int i=0;i<12;i++){
				if(i%2==0)
					sum+=(str.charAt(i)-(int)'0');
				else
					sum+=3*((int)str.charAt(i)-(int)'0');
			}
			number=10-sum%10;
			if(number==10)
				number=0;
			System.out.println("The ISBN-13 number is "+str+number);
		}
	}

}
