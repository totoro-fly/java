package chapter.five;

import java.util.Scanner;

public class Dec2Hex5_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a decimal number");
		int decimal=input.nextInt();
		String hex="";
		int hexValue;
		char hexDigit;
		int i=0;
		while(decimal!=0){
			hexValue=decimal%16;
			hexDigit=hexValue>=0&&hexValue<=9?(char)(hexValue+'0'):((char)(hexValue-10+'A'));
			hex=hexDigit+hex;
			decimal=decimal/16;
			i++;
		}
		System.out.println("The hex number is "+hex+" "+i);
	}

}
