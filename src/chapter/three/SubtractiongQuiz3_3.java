package chapter.three;

import java.util.Scanner;

public class SubtractiongQuiz3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=(int)(Math.random()*10);
		int number2=(int)(Math.random()*10);
		if(number1>number2){
			int temp=number1;
			number1=number2;
			number2=temp;				
		}
		System.out.println("What is "+number2+"-"+number1+" ?");
		Scanner input=new Scanner(System.in);
		int answer=input.nextInt();
		if(number2-number1==answer)
			System.out.println("You are correct!");
		else {
			System.out.println("Your answer is wrong.");
			System.out.println(number2+"-"+number1+" should be "+(number2-number1));
		}
	}

}
