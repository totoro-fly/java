package chapter.five.test;

import java.util.Scanner;

public class Test5_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入每月定投金额");
		int add=input.nextInt();
		System.out.println("请输入年利率");
		double rate=input.nextDouble()/12/100;
		System.out.println("请输入投资持续月数");
		int month=input.nextInt();
		double sum=0;
		for(int i=1;i<=month;i++){
			sum=(sum+add)*(1+rate);
		}
		System.out.println(sum);
	}

}
