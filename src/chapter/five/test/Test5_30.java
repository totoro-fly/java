package chapter.five.test;

import java.util.Scanner;

public class Test5_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("������ÿ�¶�Ͷ���");
		int add=input.nextInt();
		System.out.println("������������");
		double rate=input.nextDouble()/12/100;
		System.out.println("������Ͷ�ʳ�������");
		int month=input.nextInt();
		double sum=0;
		for(int i=1;i<=month;i++){
			sum=(sum+add)*(1+rate);
		}
		System.out.println(sum);
	}

}
