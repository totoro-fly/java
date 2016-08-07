package chapter.three.test;

import java.util.Scanner;

public class Test3_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a point's x- and y- coordinates:(正值)");
		double x=input.nextDouble();
		double y=input.nextDouble();
		//最大比例
		double a=(200-x)/200*100;
		double b=(100-y)/100*200;
		System.out.println(x<=b&&y<=a?"The point is  in the triangle.":"The point is not in the triangle.");
	}

}
