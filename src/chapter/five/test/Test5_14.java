package chapter.five.test;

import java.util.Scanner;

public class Test5_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("����������������");
		int number1=input.nextInt();
		int number2=input.nextInt();
		int min=Math.min(number1, number2);
		while(true){
			if(number1%min==0&&number2%min==0)
				break;
			min--;
				
		}
		if(min==1)
			System.out.println(number1+"��"+number2+"����");
		else
			System.out.println(number1+"��"+number2+"�����Լ��Ϊ"+min);
		
	}

}
