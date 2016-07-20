package chapter.two.test;

import java.util.Scanner;

public class Test2_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000 :");
		int number=input.nextInt();
		int s1=number%10;
		int remaining=number/10;
		int s2=remaining%10;
		int s3=remaining/=10;
		System.out.println("The sum of the digits is "+(s1+s2+s3));
		System.out.println("The sum of the digits is "+s1+s2+s3);
		System.out.println(s1+s2+s3);
	}

}
