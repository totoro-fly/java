package chapter.three.test;

import java.util.Random;
import java.util.Scanner;

public class Test3_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=(int)(Math.random()*10);
		int number2=(int)(Math.random()*10);
		int number3=(int)(Math.random()*10);
		System.out.println(number1+"+"+number2+"+"+number3+"= ?");
		Scanner input=new Scanner(System.in);
		int answer=input.nextInt();
		System.out.println(number1+"+"+number2+"+"+number3+"="+answer+" is "+(answer==number1+number2+number3));
	}

}
