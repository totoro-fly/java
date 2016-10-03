package chapter.six;

import java.util.Scanner;

public class Hex2Dec6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hex number");
		String hex = input.nextLine();
		System.out.println("The decimal value for hex number" + hex + " is "+hexToDec(hex.toUpperCase()));
	}

	public static int hexToDec(String hex) {
		int dec = 0;
		for (int i = 0; i < hex.length(); i++) {
			char ch=hex.charAt(i);
			dec=dec*16+hexCharToDec(ch);
		}
		return dec;
	}
	public static int hexCharToDec(char ch){
		if(ch>='A'&&ch<='F')
			return ch-'A'+10;
		else
			return ch-'0';
	}

}
