package chapter.two.test;

import java.util.Scanner;

public abstract class Test2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ǰ�˿���312032486,7s��1,13s��1,45s��1,δ��5��ÿ���˿���");
		int population = 312032486;
		int seconds = 60 * 60 * 24 * 365;
		double change = seconds / 7.0 + seconds / 45.0 - seconds / 13.0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of years");
		int years=input.nextInt();
		int populationNext=population+(int)change*years;
		System.out.println("The population in "+years+" is "+populationNext);
	}

}
