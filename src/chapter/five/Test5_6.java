package chapter.five;

import java.util.Scanner;

public class Test5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int number,max;
		number=input.nextInt();
		max=number;
		do{
			number=input.nextInt();
			if(number>max)
				max=number;
			
		}while(number!=0);
		System.out.println("max is "+max);
		System.out.println("number is "+number);
	}
	

}
