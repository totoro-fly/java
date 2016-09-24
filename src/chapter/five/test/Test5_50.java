package chapter.five.test;

import java.util.Scanner;

public class Test5_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=input.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
				count++;
		}
		System.out.println(count);
	}

}
