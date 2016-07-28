package chapter.three;

import java.util.Scanner;

public class Test3_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int weight=input.nextInt();
		int leight=input.nextInt();
		if(weight>50||leight>60)
			System.out.println(true);
		else
			System.out.println(false);
			
	}

}
