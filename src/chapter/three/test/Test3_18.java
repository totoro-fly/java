package chapter.three.test;

import java.util.Scanner;

public class Test3_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter w ");
		double w=input.nextDouble();
		if(w>0&&w<=1)
			System.out.println("$3.5");
		else if(w>1&&w<=3)
			System.out.println("$5.5");
		else if(w>3&&w<=10)
			System.out.println("$8.5");
		else if(w>10&&w<=20)
			System.out.println("$10.5");
		else
			System.out.println("the package cannot be shipped.");
	}

}
