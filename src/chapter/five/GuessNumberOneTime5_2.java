package chapter.five;

import java.util.Scanner;

public class GuessNumberOneTime5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int guess = (int) (Math.random() * 101);
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");
		System.out.println("Enter your guess:");
		int answer = input.nextInt();
		if (guess == answer) {
			System.out.println("Yes,the number is " + guess);
		} else if (guess > answer) {
			System.out.println("Your guess is too high");

		} else {
			System.out.println("Your guess is too low");
		}
	}

}
