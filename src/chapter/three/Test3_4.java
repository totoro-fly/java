package chapter.three;

import java.util.Scanner;

public class Test3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an integer for y  y>=0,x=1 and y<0,x=-1");
		int y=input.nextInt();
		int x=-1;
		System.out.println("x is "+x);
		if(y>=0)
			System.out.println("x is "+(x=1));
	}

}
