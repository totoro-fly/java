package chapter.three.test;

import java.util.Scanner;

public class Test3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=(int)(Math.random()*99);
		int number2=(int)(Math.random()*99);
		System.out.println(number1+"+"+number2+"= ?");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the answer");
		int answer=input.nextInt();
		System.out.println(number1+"+"+number2+"="+answer+" is "+(answer==number1+number2));
		
	}

}
