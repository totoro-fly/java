package chapter.four.test;

import java.util.Scanner;

public class Test4_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Entera decimal value(0 to 15):");
		int number=input.nextInt();
		char ch;
		if(number>=0&&number<=9)
			System.out.println("The hex value is "+number);
		else if(number>=10&&number<=15){
			ch=(char)(number+((int)'A'-10));
			System.out.println("The hex value is "+ch);
		}else
			System.out.println(number+" is an invalid input.");
			
	}

}
