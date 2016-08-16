package chapter.four;

import java.util.Scanner;

public class HexDigit2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a hex digit:");
		String number =input.nextLine();
		if(number.length()!=1){
			System.out.println("You must enter exactly one character");
			System.exit(1);
		}
		char ch=Character.toUpperCase(number.charAt(0));
		if(ch>='A'&&ch<='F'){
			int value=ch-'A'+10;
			System.out.println("The decimal value for hex digit "+ch+" is "+value);
		}else if(Character.isDigit(ch)){
			System.out.println("The decimal value for hex digit "+ch+" is "+ch);
			
		}else{
			System.out.println(ch+" is an invalid input.");
			
		}
		
			
	}

}
