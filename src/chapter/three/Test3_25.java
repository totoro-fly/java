package chapter.three;

import java.util.Scanner;

public class Test3_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int age=input.nextInt();
		if(age>13&&age<18)
			System.out.println(true);
		else
			System.out.println(false);
	}

}
