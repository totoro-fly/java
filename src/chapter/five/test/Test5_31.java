package chapter.five.test;

import java.util.Scanner;

public class Test5_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("����������");
		double amount=input.nextDouble();
		System.out.println("������������");
		double rate=input.nextDouble()/100/12;
		System.out.println("�������·�");
		int month=input.nextInt();
		System.out.println("Month   CD Value");
		for(int i=1;i<=month;i++){
			amount+=amount*rate;
			System.out.printf(i+"       %.2f\n",amount);
		}
		
	}

}
