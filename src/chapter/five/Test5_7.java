package chapter.five;

import java.util.Scanner;

public class Test5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,data;
		Scanner input=new Scanner(System.in);
		do{
			System.out.println("Enter an Integer(the input ends if it is 0)");
			data=input.nextInt();
			sum+=data;
		}while(data!=0);
		System.out.println("sum "+sum);
		System.out.println("data "+data);
		
	}

}
