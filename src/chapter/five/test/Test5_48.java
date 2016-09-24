package chapter.five.test;

import java.util.Scanner;

public class Test5_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=input.nextLine();
		String str0="";
		for(int i=0;i<str.length();i++){
			if(i%2==0){
				str0+=str.charAt(i);
			}
		}
		System.out.println(str0);
	}

}
