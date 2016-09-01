package chapter.five;

import java.util.Scanner;

public class GuessNumber5_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=(int)(Math.random()*101);
		System.out.println("Guess a magic number between 0 and 100");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your guess:");
		int answer=input.nextInt();
		while(number!=answer){
			if(answer>number){
				System.out.println("Your guess is too high");
				System.out.println("Enter your guess:");
				answer=input.nextInt();
			}
			if(answer<number){
				System.out.println("Your guess is too low");
				System.out.println("Enter your guess:");
				answer=input.nextInt();
			}
		}
		System.out.println("Yes,the number is "+number);
	}

}
