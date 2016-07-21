package chapter.two.test;

import java.util.Scanner;

public class Test2_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the pennies:");
		int totalPennies=input.nextInt();
		int pennies=totalPennies%100;
		int dollars=totalPennies/100;
		System.out.println(dollars+" dollars "+pennies+" pennies");
	}

}
