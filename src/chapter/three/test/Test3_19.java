package chapter.three.test;

import java.util.Scanner;

public class Test3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("输入三角形的三条边，并计算周长。");
		double line1=input.nextDouble();
		double line2=input.nextDouble();
		double line3=input.nextDouble();
		double sum;
		if((line1+line2>line3)||(line2+line3>line1)||(line3+line1>line2))
		System.out.println("三角形的周长为 "+(line1+line2+line3));
		else
			System.out.println("输入值不合法！");
		
	}

}
