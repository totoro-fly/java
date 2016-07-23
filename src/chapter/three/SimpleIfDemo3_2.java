package chapter.three;

import java.util.Scanner;

public class SimpleIfDemo3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an integer");
		int number=input.nextInt();
		if(number%5==0)
			System.out.println("Hi Five");
		if(number%2==0)
			System.out.println("Hi Two");
		System.out.println("The End");
	}

}
