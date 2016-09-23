package chapter.five.test;

import java.util.Scanner;

public class Test5_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count1 = 0;
		int count2 = 0;
		while (true) {
			System.out.println("scissor(0),rock(1),paper(2):");
			int number = input.nextInt();
			int random = (int) (Math.random() * 3);
			String randomS = change(random);
			String numberS = change(number);
			if ((number == 0 && random == 2) || (number == 1 && random == 0) || (number == 2 && random == 1)) {
				System.out.println("The computer is " + randomS + ". You are " + numberS + ". You win.");
				count1++;
			} else if (number == random) {
				System.out.println("The computer is " + randomS + ". You are " + numberS + " too. It's a draw.");
			} else {
				System.out.println("The computer is " + randomS + ". You are " + numberS + ". You lose.");
				count2++;
			}
			if (count1 == 2 || count2 == 2) {
				if (count1 == 2)
					System.out.println("YOU WIN");
				if (count2 == 2)
					System.out.println("YOU LOSE");
				break;
			}
		}
	}

	static String change(int change) {
		switch (change) {
		case 0:
			return "scissor";
		case 1:
			return "rock";
		case 2:
			return "paper";
		}
		return null;
	}

}