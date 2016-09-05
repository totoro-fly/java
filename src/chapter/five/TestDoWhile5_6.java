package chapter.five;

import java.util.Scanner;

public class TestDoWhile5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int data;
		Scanner input=new Scanner(System.in);
		do{
			System.out.println("Enter an integer(the input ends if it is 0)");
			data=input.nextInt();
			sum+=data;
		}while(data!=0);
		System.out.println("The sum is "+sum);
	}

}
