package chapter.six.test;

import java.util.Random;

public class Test6_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMatrix(10);
	}
	public static void printMatrix(int x){
		for(int i=1;i<=x;i++){
			for(int j=1;j<=x;j++){
				System.out.print(randomNumber()+" ");
			}
			System.out.println();
		}
	}
	public static int randomNumber(){
		return (int)(Math.random()*2);
	}

}
