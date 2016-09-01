package chapter.five;

import java.util.Scanner;

public class GuessNumber5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int guess=(int)(Math.random()*101);
		Scanner input=new Scanner(System.in);
		System.out.println("Guess a mmagic number between 0 and 100");
		int answer=-1;
		while(guess!=answer){
			System.out.println("Enter your guess");
			answer=input.nextInt();
			if(guess==answer){
				System.out.println("Yes,the number is "+answer);
			}else if(guess>answer){
				System.out.println("Your guess is too low");
			}else{
				System.out.println("Your guess is too high");
			}
		}
	}

}
