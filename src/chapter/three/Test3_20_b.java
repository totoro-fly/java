package chapter.three;

import java.util.Scanner;

public class Test3_20_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		if(Math.abs(x-5)>4.5)
			System.out.println(true);
		else
			System.out.println(false);
			
	}

}
