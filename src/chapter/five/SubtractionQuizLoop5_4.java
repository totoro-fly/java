package chapter.five;

import java.util.Scanner;

public class SubtractionQuizLoop5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMBER_OF_QUESTIONS = 5;
		int count = 0;
		int correctCount = 0;
		String output = "";
		Scanner input = new Scanner(System.in);
		long startTime=System.currentTimeMillis();
		while (count < NUMBER_OF_QUESTIONS) {
			int number1 = (int) (Math.random() * 10);
			int number2 = (int) (Math.random() * 10);
			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			System.out.println("What is "+number1+" - "+number2+" ?");
			int answer=input.nextInt();
			if(number1-number2==answer){
				System.out.println("You are correct");
				correctCount++;
			}else{
				System.out.println("Your answer is wrong.\n"+number1+" - "+number2+" = "+(number1-number2));
			}
			count++;
			output+=number1+" - "+number2+" = "+answer+" "+(number1-number2==answer?"ture":"false")+"\n";
		}
		long endTime=System.currentTimeMillis();
		long time=endTime-startTime;
		System.out.println("\nCorrect count is "+correctCount+"\nTest time "+time/1000+" second\n"+output);
	}

}
