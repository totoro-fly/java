package chapter.five.test;

import java.util.Scanner;

public class Test5_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®");
		String str=input.nextLine();
		String str0="";
		for(int i=str.length()-1;i>=0;i--){
			str0+=str.charAt(i);
		}
		System.out.println(str0);
	}

}
