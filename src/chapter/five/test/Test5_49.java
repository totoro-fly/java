package chapter.five.test;

import java.util.Scanner;

public class Test5_49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=input.nextLine();
		str=str.trim();
		int countV=0;
		int countC=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='U'||ch=='u')
				countV++;
			else
				countC++;
		}
		System.out.println("The number of vowels is "+countV);
		System.out.println("The number of consonants is "+countC);
	}

}
