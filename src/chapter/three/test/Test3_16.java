package chapter.three.test;

import java.util.Scanner;

public class Test3_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=(int)(Math.random()*100);
		int y=(int)(Math.random()*200);
		int z1=(int)(Math.random()*10)>4?1:-1;
		int z2=(int)(Math.random()*10)>4?1:-1;
		System.out.println(x*z1+" "+y*z2);
		
	}

}
