package chapter.five;

import java.util.Scanner;

public class TestFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=input.nextInt();
		int factor=0;
		for(int i=2;i<=number;i++){
			if(number%i==0){
				factor=i;
				break;
			}
		}
		System.out.println(factor);
	}

}
