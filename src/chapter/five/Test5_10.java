package chapter.five;

import java.util.Scanner;

public class Test5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int sum=0,count,number;
		for(count=0;count<5;count++){
			number=input.nextInt();
			sum+=number;
		}
		System.out.println(sum);
		System.out.println(count);
	}

}
