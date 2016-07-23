package chapter.three;

import java.util.Scanner;

public class Test3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pay=100;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the score");
		int score=input.nextInt();
		if(score>90)
			System.out.println(pay*(1+0.03));
		else
			System.out.println(pay*(1+0.01));
	}

}
