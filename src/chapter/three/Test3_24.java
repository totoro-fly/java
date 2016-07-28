package chapter.three;

import java.util.Scanner;

public class Test3_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double x=input.nextDouble();
		double y=input.nextDouble();
		double z=input.nextDouble();
		System.out.println(x<y&&y<z);
		System.out.println(x<y||y<z);
		System.out.println(!(x<y));
		System.out.println(x+y<z);
		System.out.println(x+y>z);
	}

}
